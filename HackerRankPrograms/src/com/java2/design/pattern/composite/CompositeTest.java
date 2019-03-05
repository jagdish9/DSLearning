package com.java2.design.pattern.composite;

public class CompositeTest {

	public static void main(String[] args) {
		Component hd = new Leaf(4000, "HD");
		Component mouse = new Leaf(400, "Mouse");
		Component monitor = new Leaf(4000, "Monitor");
		Component ram = new Leaf(5000, "RAM");
		Component cpu = new Leaf(200, "CPU");
		
		Composite ph = new Composite("Peri");
		Composite cabinet = new Composite("Cabinet");
		Composite mb = new Composite("MB");
		Composite computer = new Composite("Computer");
		
		mb.addComponent(ram);
		mb.addComponent(cpu);
		
		ph.addComponent(mouse);
		ph.addComponent(monitor);
		
		cabinet.addComponent(hd);
		cabinet.addComponent(mb);
		
		computer.addComponent(ph);
		computer.addComponent(cabinet);
		
		computer.showPrice();
	}

}
