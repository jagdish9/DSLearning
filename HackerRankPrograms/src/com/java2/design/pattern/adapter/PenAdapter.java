package com.java2.design.pattern.adapter;

import com.java2.design.pattern.adapter.friendpen.PilotPen;

public class PenAdapter implements Pen {

	PilotPen pp = new PilotPen();

	@Override
	public void write(String str) {
		// TODO Auto-generated method stub
		pp.mark(str);
	}
}
