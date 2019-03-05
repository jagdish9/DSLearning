package com.java2.lambdaExpressions;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Unit1ExerciseSolutionJava7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		List<Persons> people = Arrays.asList(
				new Persons("Chandan", "Singh", 30),
			    new Persons("Khemlal", "Meghdut", 45),
			    new Persons("Swati", "Chandel", 28),
			    new Persons("Shah", "Chan", 50),
			    new Persons("cherolete", "Shaan", 36),
			    new Persons("Zkhan", "Croshan", 47),
			    new Persons("Shinza", "Chandrkanta", 42));
		
		// sort list by last name
		Collections.sort(people, new Comparator<Persons>(){
             
			public int compare(Persons p1, Persons p2){
				return p1.getLastName().compareTo(p2.getLastName());
			}
		});
		
		// Create a method that prints all elements in the list
		printAll(people);
		
		System.out.println("---------------------------------------------");
		
		// create a method that print all people that have last name beginning with C
		printLastNameBeginningWIthC(people);
	}
	
	private static void printLastNameBeginningWIthC(List<Persons> people) {
		// TODO Auto-generated method stub
		for(Persons p : people){
			if(p.getLastName().startsWith("C")){
				System.out.println(p);
			}
		}
	}

	private static void printAll(List<Persons> people) {
		// TODO Auto-generated method stub
		for(Persons p : people){
			System.out.println(p);
		}
	}

}
