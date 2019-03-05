package com.java2.fragma;

public class Deliveres {

	private int MATCH_ID;
	private int INNING;
	private String BATTING_TEAM;
	private String BOWLING_TEAM;
	private int OVER;
	private int BALL;
	private String BATSMAN;
	private String BOWLER;
	private int WIDE_RUNS;
	private int BYE_RUNS;
	private int LEGBYE_RUNS;
	private int NOBALL_RUNS;
	private int PENALTY_RUNS;
	private int BATSMAN_RUNS;
	private int EXTRA_RUNS;
	private int TOTAL_RUNS;
	
	public Deliveres(int MATCH_ID, int INNING, String BATTING_TEAM, String BOWLING_TEAM, int OVER, int BALL, String BATSMAN, String BOWLER,
			int WIDE_RUNS, int BYE_RUNS, int LEGBYE_RUNS, int NOBALL_RUNS, int PENALTY_RUNS, int BATSMAN_RUNS, int EXTRA_RUNS, int TOTAL_RUNS){
		this.MATCH_ID = MATCH_ID;
		this.INNING = INNING;
		this.BATTING_TEAM = BATTING_TEAM;
		this.BOWLING_TEAM = BOWLING_TEAM;
		this.OVER = OVER;
		this.BALL = BALL;
		this.BATSMAN = BATSMAN;
		this.BOWLER = BOWLER;
		this.WIDE_RUNS = WIDE_RUNS;
		this.BYE_RUNS = BYE_RUNS;
		this.LEGBYE_RUNS = LEGBYE_RUNS;
		this.NOBALL_RUNS = NOBALL_RUNS;
		this.PENALTY_RUNS = PENALTY_RUNS;
		this.BATSMAN_RUNS = BATSMAN_RUNS;
		this.EXTRA_RUNS = EXTRA_RUNS;
		this.TOTAL_RUNS = TOTAL_RUNS;
	}

	public int getMATCH_ID() {
		return MATCH_ID;
	}

	public int getINNING() {
		return INNING;
	}

	public String getBATTING_TEAM() {
		return BATTING_TEAM;
	}

	public String getBOWLING_TEAM() {
		return BOWLING_TEAM;
	}

	public int getOVER() {
		return OVER;
	}

	public int getBALL() {
		return BALL;
	}

	public String getBATSMAN() {
		return BATSMAN;
	}

	public String getBOWLER() {
		return BOWLER;
	}

	public int getWIDE_RUNS() {
		return WIDE_RUNS;
	}

	public int getBYE_RUNS() {
		return BYE_RUNS;
	}

	public int getLEGBYE_RUNS() {
		return LEGBYE_RUNS;
	}

	public int getNOBALL_RUNS() {
		return NOBALL_RUNS;
	}

	public int getPENALTY_RUNS() {
		return PENALTY_RUNS;
	}

	public int getBATSMAN_RUNS() {
		return BATSMAN_RUNS;
	}

	public int getEXTRA_RUNS() {
		return EXTRA_RUNS;
	}

	public int getTOTAL_RUNS() {
		return TOTAL_RUNS;
	}

}
