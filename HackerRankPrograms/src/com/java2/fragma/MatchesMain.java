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

public class MatchesMain {
	
	public static List<Matches> matchesCount = new ArrayList<Matches>();
	public static Map<String, TeamYear> _matchesMap = new HashMap<String, TeamYear>();

	public static void main(String[] args) {

		String csvFile = "C:\\Softwares\\Jagdish\\Fragma question 16-Nov-2018\\iplDataSet\\matches.csv";
        String line = "";
        String cvsSplitBy = ",";

        try (BufferedReader br = new BufferedReader(new FileReader(csvFile))) {

            while ((line = br.readLine()) != null) {

                String[] splitMatches = line.split(cvsSplitBy);
                if(splitMatches[0].equals("MATCH_ID")) continue;
                String winnerValue = "";
                if(!splitMatches[8].equals("no result")) winnerValue = splitMatches[9];
                matchesCount.add(new Matches(splitMatches[0], splitMatches[1], splitMatches[2], splitMatches[3], 
                		splitMatches[4], splitMatches[5], splitMatches[6], splitMatches[7],
                		splitMatches[8], winnerValue));

            }

        } catch (IOException e) {
            e.printStackTrace();
        }
        
        topTeamElectedFielding();
	}
	
	public static void topTeamElectedFielding(){
		 for(Matches m : matchesCount){
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

}

class TeamYear{
	private String year;
	private int count;
	
	public TeamYear(String year, int count){
		this.year = year;
		this.count = count;
	}
	
	public String getYear(){
		return year;
	}
	
	public int getCount(){
		return count;
	}
}
