package com.java2.fragma;

public class Matches {

	private String MATCH_ID;
	private String SEASON;
	private String CITY;
	private String DATE;
	private String TEAM1;
	private String TEAM2;
	private String TOSS_WINNER;
	private String TOSS_DECISION;
	private String RESULT;
	private String WINNER;
	
	public Matches(String MATCH_ID, String SEASON, String	CITY, String DATE, String TEAM1, String TEAM2, 
			String TOSS_WINNER, String TOSS_DECISION, String RESULT, String WINNER){
		this.MATCH_ID = MATCH_ID;	
		this.SEASON	= SEASON;
		this.CITY = CITY;
		this.DATE = DATE;
		this.TEAM1 = TEAM1;
		this.TEAM2 = TEAM2;
		this.TOSS_WINNER = TOSS_WINNER;
		this.TOSS_DECISION = TOSS_DECISION;
		this.RESULT	= RESULT;
		this.WINNER = WINNER;

	}

	public String getMATCH_ID() {
		return MATCH_ID;
	}

	public String getSEASON() {
		return SEASON;
	}

	public String getCITY() {
		return CITY;
	}

	public String getDATE() {
		return DATE;
	}

	public String getTEAM1() {
		return TEAM1;
	}

	public String getTEAM2() {
		return TEAM2;
	}

	public String getTOSS_WINNER() {
		return TOSS_WINNER;
	}

	public String getTOSS_DECISION() {
		return TOSS_DECISION;
	}

	public String getRESULT() {
		return RESULT;
	}

	public String getWINNER() {
		return WINNER;
	}
	
}
