package com.java2.design.pattern.adapter;

public class AssignmentWork {

	public Pen p;

	public Pen getP() {
		return p;
	}

	public void setP(Pen p) {
		this.p = p;
	}
	
	public void writeAssignment(String str){
		p.write(str);
	}
}
