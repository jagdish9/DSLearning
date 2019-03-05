package com.java2.fragma;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

public class DeliveresaMain {
	
	public static Map<String, TeamYear> _matchesMap = new HashMap<String, TeamYear>();
	
	public static List<Deliveres> deliveres = new ArrayList<Deliveres>();
	public static Map<String, DeliveresScrores> _map = new HashMap<String, DeliveresScrores>();
	public static List<Matches> matches = new ArrayList<Matches>();
	
	public static Map<String, BowlingTeam> bowlingMap = new HashMap<String, BowlingTeam>();
	public static List<EconomyRate> economyList = new LinkedList<EconomyRate>();
	
	public static Map<String, NetRunRate> runRateMap = new HashMap<String, NetRunRate>();
	public static List<NetRunRate> runRateList = new LinkedList<NetRunRate>();
	public static List<NetRunRateTeam> runRateTeam = new LinkedList<NetRunRateTeam>();

	public static void main(String[] args) {

		String csvFile = "C:\\Softwares\\Jagdish\\Fragma question 16-Nov-2018\\iplDataSet\\deliveries.csv";
        String line = "";
        String cvsSplitBy = ",";

        try (BufferedReader br = new BufferedReader(new FileReader(csvFile))) {

            while ((line = br.readLine()) != null) {

                String[] splitDeilveres = line.split(cvsSplitBy);
                if(splitDeilveres[0].equals("MATCH_ID")) continue;
                deliveres.add(new Deliveres(Integer.parseInt(splitDeilveres[0]), Integer.parseInt(splitDeilveres[1]),
                		splitDeilveres[2], splitDeilveres[3], 
                		Integer.parseInt(splitDeilveres[4]), Integer.parseInt(splitDeilveres[5]),
                		splitDeilveres[6], splitDeilveres[7],
                		Integer.parseInt(splitDeilveres[8]), Integer.parseInt(splitDeilveres[9]),
                		Integer.parseInt(splitDeilveres[10]), Integer.parseInt(splitDeilveres[11]), 
                		Integer.parseInt(splitDeilveres[12]), Integer.parseInt(splitDeilveres[13]), 
                		Integer.parseInt(splitDeilveres[14]), Integer.parseInt(splitDeilveres[15])));

            }

        } catch (IOException e) {
            e.printStackTrace();
        }
        
        String csvFile1 = "C:\\Softwares\\Jagdish\\Fragma question 16-Nov-2018\\iplDataSet\\matches.csv";
        String line1 = "";
        String cvsSplitBy1 = ",";

        try (BufferedReader br = new BufferedReader(new FileReader(csvFile1))) {

            while ((line1 = br.readLine()) != null) {

                String[] splitMatches = line1.split(cvsSplitBy1);
                if(splitMatches[0].equals("MATCH_ID")) continue;
                String winnerValue = "";
                if(!splitMatches[8].equals("no result")) winnerValue = splitMatches[9];
                matches.add(new Matches(splitMatches[0], splitMatches[1], splitMatches[2], splitMatches[3], 
                		splitMatches[4], splitMatches[5], splitMatches[6], splitMatches[7],
                		splitMatches[8], winnerValue));

            }

        } catch (IOException e) {
            e.printStackTrace();
        }
        
       topTeamElectedFielding();
       System.out.println("-----------------------------------------");
       totalFoursSixesAndScores();
       System.out.println("-----------------------------------------");
       economyRateBowler();
       System.out.println("-----------------------------------------");
       netRunRate();
	}
	
	public static void topTeamElectedFielding(){
		 for(Matches m : matches){
	        	if(m.getSEASON().equals("2017") || m.getSEASON().equals("2016")){
	        		if(m.getTOSS_DECISION().equals("field")){
	        			 if (!_matchesMap.containsKey(m.getTOSS_WINNER())) {  // first time we've seen this string
	        				 _matchesMap.put(m.getTOSS_WINNER(), new TeamYear(m.getSEASON(), 1));
	        			    }
	        			    else {
	        			      TeamYear teamYear = _matchesMap.get(m.getTOSS_WINNER());
	        			      int count = teamYear.getCount();
	        			      _matchesMap.put(m.getTOSS_WINNER(), new TeamYear(m.getSEASON(), count + 1));
	        			    }
	        		}
	        	}
	        }
	        System.out.println("YEAR TEAM COUNT");
	        Map<String, TeamYear> sortedMap = sortByCountValue(_matchesMap);
	        int top = 0;
	        for(Map.Entry<String, TeamYear> maps : sortedMap.entrySet()){
	        	TeamYear ty = maps.getValue();
	        	if(top<4){
	        		System.out.println(ty.getYear()+" "+maps.getKey()+" "+ty.getCount());
	        	}
	        	top++;
	        }
	}
	
	private static Map<String, TeamYear> sortByCountValue(Map<String, TeamYear> unsortMap) {

        // 1. Convert Map to List of Map
        List<Map.Entry<String, TeamYear>> list =
                new LinkedList<Map.Entry<String, TeamYear>>(unsortMap.entrySet());

        // 2. Sort list with Collections.sort()
        Collections.sort(list, new Comparator<Map.Entry<String, TeamYear>>() {
            public int compare(Map.Entry<String, TeamYear> o1,
                               Map.Entry<String, TeamYear> o2) {
                if (o2.getValue().getCount() > o1.getValue().getCount())
                   return 1;
                else if(o2.getValue().getCount() < o1.getValue().getCount())
                   return -1;
                else return 0;
            }
        });

        // 3. Loop the sorted list and put it into a new insertion order Map LinkedHashMap
        Map<String, TeamYear> sortedMap = new LinkedHashMap<String, TeamYear>();
        for (Map.Entry<String, TeamYear> entry : list) {
            sortedMap.put(entry.getKey(), entry.getValue());
        }

        return sortedMap;
    }
	public static void totalFoursSixesAndScores(){
	       for(Matches m : matches){
	    	   String matchID = m.getMATCH_ID();
	    	   for(Deliveres d : deliveres){
	    		   if(Integer.parseInt(matchID) == d.getMATCH_ID()){
	    			   if (!_map.containsKey(d.getBATTING_TEAM())) {  // first time we've seen this string
	    				   int batsmanRuns = d.getBATSMAN_RUNS();
	    				   int totalRuns = d.getTOTAL_RUNS();
	    				   int four = 0;
	    				   int six = 0;
	    				   if(batsmanRuns == 4 ) four = 1;
	    				   if(batsmanRuns == 6 ) six = 1;
	     			      _map.put(d.getBATTING_TEAM(), new DeliveresScrores(m.getSEASON(), four, six, totalRuns));
	     			    }
	     			    else {
	     			      DeliveresScrores scores= _map.get(d.getBATTING_TEAM());
	     			      int fourCount = scores.getFoursCount();
	     			      int sixesCount = scores.getSixesCount();
	     			      int totalScores = scores.getTotalScores();
	     			      int batsmanRuns = d.getBATSMAN_RUNS();
	  				      int totalRuns = d.getTOTAL_RUNS();
	  				      if(batsmanRuns == 4) fourCount = fourCount+1;
	  				      if(batsmanRuns == 6) sixesCount = sixesCount+1;
	     			      _map.put(d.getBATTING_TEAM(), new DeliveresScrores(m.getSEASON(), fourCount, sixesCount, totalRuns+totalScores));
	     			    }
	    		   }
	    	   }
	       }
	       
	       System.out.println("YEAR TEAM_NAME FOURS_COUNT SIXES_COUNT TOTAL_SCORE");
	       for(Map.Entry<String, DeliveresScrores> del : _map.entrySet()){
	    	   DeliveresScrores dScore = del.getValue();
	    	   System.out.println(dScore.getYear()+" "+del.getKey()+" "+dScore.getFoursCount()+" "+dScore.getSixesCount()+" "+dScore.getTotalScores());
	       }
	}

	private static void economyRateBowler(){
	       for(Matches m : matches){
	    	   String matchID = m.getMATCH_ID();
	    	   for(Deliveres d : deliveres){
	    		   if(Integer.parseInt(matchID) == d.getMATCH_ID()){
	    			   if (!bowlingMap.containsKey(d.getBOWLER())) {  // first time we've seen this string
	    				   int wideRuns = d.getWIDE_RUNS();
	    				   int noballRuns = d.getNOBALL_RUNS();
	    				   int penaltyRuns = d.getPENALTY_RUNS();
	    				   int batsmanRuns = d.getBATSMAN_RUNS();
	    				   int extraRuns = d.getEXTRA_RUNS();
	    				   int ball = d.getBALL();
	    				   int oversCount = 0;
	    				   if(ball == 6) oversCount = 1;
	    				   int totalRunsByBowler = wideRuns+noballRuns+penaltyRuns+batsmanRuns+extraRuns;
	    				   
	    				   bowlingMap.put(d.getBOWLER(), new BowlingTeam(m.getSEASON(), oversCount, totalRunsByBowler, d.getBOWLER()));
	     			    }
	     			    else {
	     			      BowlingTeam bt= bowlingMap.get(d.getBOWLER());
	     			       int wideRuns = d.getWIDE_RUNS();
	    				   int noballRuns = d.getNOBALL_RUNS();
	    				   int penaltyRuns = d.getPENALTY_RUNS();
	    				   int batsmanRuns = d.getBATSMAN_RUNS();
	    				   int extraRuns = d.getEXTRA_RUNS();
	    				   int ball = d.getBALL();
	    				   int oversCount = 0;
	    				   if(ball == 6) oversCount = 1;
	     			      int totalovers = bt.getTotalOvers() + oversCount;
	     			      int totalRuns = bt.getTotalScores() + wideRuns+noballRuns+penaltyRuns+batsmanRuns+extraRuns;
	  				     bowlingMap.put(d.getBOWLER(), new BowlingTeam(m.getSEASON(), totalovers, totalRuns, d.getBOWLER()));
	     			    }
	    		   }
	    	   }
	       }
	       
	       for(Map.Entry<String, BowlingTeam> del : bowlingMap.entrySet()){
	    	   BowlingTeam bowlingTeam = del.getValue();
	    	   int Economy = bowlingTeam.getTotalOvers() != 0 ? bowlingTeam.getTotalScores()/bowlingTeam.getTotalOvers() : 0;
	    	   economyList.add(new EconomyRate(bowlingTeam.getYear(),Economy,bowlingTeam.getBowler()));
	       }
	       
	       Collections.sort(economyList, new Comparator<EconomyRate>(){

			@Override
			public int compare(EconomyRate er1, EconomyRate er2) {
				if(er2.getEconomyRate() > er1.getEconomyRate())
					return 1;
				else if(er2.getEconomyRate() < er1.getEconomyRate())
					return -1;
				else return 0;
			}
	    	   
	       });
	       
	       System.out.println("YEAR PLAYER ECONOMY");
	       int topEconomy = 0;
	       for(EconomyRate er : economyList){
	    	  if(topEconomy < 4) System.out.println(er.getYear()+" "+er.getBowler()+" "+er.getEconomyRate());
	    	  topEconomy++;
	       }
	}
	
	private static void netRunRate(){
		for(Matches m : matches){
	    	   String matchID = m.getMATCH_ID();
	    	   for(Deliveres d : deliveres){
	    		   if(Integer.parseInt(matchID) == d.getMATCH_ID()){
	    			   if (!runRateMap.containsKey(m.getMATCH_ID()+""+d.getINNING())) {  // first time we've seen this string
	    				   int totalScores = d.getTOTAL_RUNS();
	    				   int ball = d.getBALL();
	    				   int oversCount = 0;
	    				   if(ball == 6) oversCount = 1;
	    				   runRateMap.put(m.getMATCH_ID()+""+d.getINNING(), new NetRunRate(d.getBATTING_TEAM(), d.getBOWLING_TEAM(),
	    						   d.getINNING(), totalScores, oversCount, d.getMATCH_ID(), m.getSEASON()));
	     			    }
	     			    else {
	     			      NetRunRate rnRate= runRateMap.get(m.getMATCH_ID()+""+d.getINNING());
	     			      int totalScores = rnRate.getTotalScores();
	  				      int totalRuns = d.getTOTAL_RUNS();
	  				      int ball = d.getBALL();
	  				      int oversCount = 0;
	    				  if(ball == 6) oversCount = 1;
	     			      int totalovers = rnRate.getTotalOvers() + oversCount;
	  				     runRateMap.put(m.getMATCH_ID()+""+d.getINNING(), new NetRunRate(d.getBATTING_TEAM(), d.getBOWLING_TEAM(), 
	  				    		 d.getINNING(), totalRuns+totalScores, totalovers, d.getMATCH_ID(), m.getSEASON()));
	     			    }
	    		   }
	    	   }
	       }
		
		for(Map.Entry<String, NetRunRate> nrr : runRateMap.entrySet()){
			NetRunRate netRnRate = nrr.getValue();
			runRateList.add(new NetRunRate(netRnRate.getTeam1(), netRnRate.getTeam2(), 
					netRnRate.getInnings(), netRnRate.getTotalScores(), netRnRate.getTotalOvers(), netRnRate.getMatchID(), netRnRate.getYear()));
			
		}
		
		for(NetRunRate netRL : runRateList){
			for(NetRunRate netRLSecond : runRateList){
				if(netRL.getMatchID() == netRLSecond.getMatchID()){
					int nrrValue = 0;
					if(netRL.getTotalOvers() != 0 && netRLSecond.getTotalOvers() != 0){
						nrrValue = netRL.getTotalScores()/netRL.getTotalOvers() - netRLSecond.getTotalScores()/netRLSecond.getTotalOvers();
					}
					runRateTeam.add(new NetRunRateTeam(netRL.getTeam1(), nrrValue, netRL.getYear()));
				}
			}
		}
		
		Collections.sort(runRateTeam, new Comparator<NetRunRateTeam>(){

			@Override
			public int compare(NetRunRateTeam nr1, NetRunRateTeam nr2) {
				if(nr2.getNetRunRate() > nr1.getNetRunRate())
					return 1;
				else if(nr2.getNetRunRate() < nr1.getNetRunRate())
					return -1;
				else
					return 0;
			}
			
		});
		
		System.out.println("TEAM NET_RUN_RATE YEAR");
		int topHighestRunRate = 0;
		for(NetRunRateTeam nrrt : runRateTeam){
			if(topHighestRunRate < 1)System.out.println(nrrt.getBattingTeam()+" "+nrrt.getNetRunRate()+" "+nrrt.getYear());
			topHighestRunRate++;
		}
	}
}

class DeliveresScrores{
	private String year;
	private int foursCount;
	private int sixesCount;
	private int totalScores;
	
	public DeliveresScrores(String year, int foursCount, int sixesCount, int totalScores) {
		this.year = year;
		this.foursCount = foursCount;
		this.sixesCount = sixesCount;
		this.totalScores = totalScores;
	}

	public String getYear() {
		return year;
	}

	public int getFoursCount() {
		return foursCount;
	}

	public int getSixesCount() {
		return sixesCount;
	}

	public int getTotalScores() {
		return totalScores;
	}
	
}

class BowlingTeam{
	private String year;
	private int totalOvers;
	private int totalScores;
	private String bowler;
	
	public BowlingTeam(String year, int totalOvers, int totalScores, String bowler) {
		this.year = year;
		this.totalOvers = totalOvers;
		this.totalScores = totalScores;
		this.bowler = bowler;
	}
	
	public String getYear() {
		return year;
	}
	public int getTotalOvers() {
		return totalOvers;
	}
	public int getTotalScores() {
		return totalScores;
	} 
	
	public String getBowler() {
		return bowler;
	} 
}

class EconomyRate{
	private String year;
	private int economyRate;
	private String bowler;
	
	public EconomyRate(String year, int economyRate, String bowler) {
		this.year = year;
		this.economyRate = economyRate;
		this.bowler = bowler;
	}

	public String getYear() {
		return year;
	}

	public int getEconomyRate() {
		return economyRate;
	}

	public String getBowler() {
		return bowler;
	}
	
}

class NetRunRate{
	private String team1;
	private String team2;
	private int innings;
	private int totalScores;
	private int totalOvers;
	private int matchID;
	private String year;
	
	public String getTeam1() {
		return team1;
	}
	public String getTeam2() {
		return team2;
	}
	public int getInnings() {
		return innings;
	}
	public int getTotalScores() {
		return totalScores;
	}
	public int getTotalOvers() {
		return totalOvers;
	}
	
	public int getMatchID(){
		return matchID;
	}
	
	public String getYear(){
		return year;
	}
	
	public NetRunRate(String team1, String team2, int innings, int totalScores, int totalOvers, int matchID, String year) {
		this.team1 = team1;
		this.team2 = team2;
		this.innings = innings;
		this.totalScores = totalScores;
		this.totalOvers = totalOvers;
		this.matchID = matchID;
		this.year = year;
	}
	
}

class NetRunRateTeam{
	private String battingTeam;
	private int netRunRate;
	private String year;
	
	public NetRunRateTeam(String battingTeam, int netRunRate, String year) {
		this.battingTeam = battingTeam;
		this.netRunRate = netRunRate;
		this.year = year;
	}

	public String getBattingTeam() {
		return battingTeam;
	}
	
	public int getNetRunRate(){
		return netRunRate;
	}
	
	public String getYear() {
		return year;
	}
}