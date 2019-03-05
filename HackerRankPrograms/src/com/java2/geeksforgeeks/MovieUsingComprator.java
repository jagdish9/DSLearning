package com.java2.geeksforgeeks;

//A Java program to demonstrate use of Comparable 
import java.io.*; 
import java.util.*; 

//A class 'Movie' that implements Comparable 
class Movie1 
{ 
private double rating; 
private String name; 
private int year; 

// Constructor 
public Movie1(String nm, double rt, int yr) 
{ 
   this.name = nm; 
   this.rating = rt; 
   this.year = yr; 
} 

// Getter methods for accessing private data 
public double getRating() { return rating; } 
public String getName()   {  return name; } 
public int getYear()      {  return year;  } 
} 

class RatingCompare implements Comparator<Movie1>{
	public int compare(Movie1 m1, Movie1 m2){
		if(m1.getRating() > m2.getRating())
			return 1;
		else if(m1.getRating() < m2.getRating())
			return -1;
		else return 0;
	}
}

class NameCompare implements Comparator<Movie1>{
	public int compare(Movie1 m1, Movie1 m2){
		return m1.getName().compareTo(m2.getName());
	}
}

class YearCompare implements Comparator<Movie1>{
	public int compare(Movie1 m1, Movie1 m2){
		if(m1.getYear() > m2.getYear()) return 1;
		else if(m1.getYear() < m2.getYear()) return -1;
		else return 0;
	}
}

//Driver class 
public class MovieUsingComprator 
{ 
public static void main(String[] args) 
{ 
   ArrayList<Movie1> list = new ArrayList<Movie1>(); 
   list.add(new Movie1("Force Awakens", 8.3, 2015)); 
   list.add(new Movie1("Star Wars", 8.7, 1977)); 
   list.add(new Movie1("Empire Strikes Back", 8.8, 1980)); 
   list.add(new Movie1("Return of the Jedi", 8.4, 1983)); 

   Collections.sort(list, new RatingCompare()); 

   System.out.println("Movies after sorting by RatingCompare: "); 
   for (Movie1 movie: list) 
   { 
       System.out.println(movie.getName() + " " + 
                          movie.getRating() + " " + 
                          movie.getYear()); 
   } 
   
   System.out.println();
   Collections.sort(list, new NameCompare()); 

   System.out.println("Movies after sorting by NameCompare: "); 
   for (Movie1 movie: list) 
   { 
       System.out.println(movie.getName() + " " + 
                          movie.getRating() + " " + 
                          movie.getYear()); 
   } 
   
   System.out.println();
   Collections.sort(list, new YearCompare()); 

   System.out.println("Movies after sorting by YearCompare: "); 
   for (Movie1 movie: list) 
   { 
       System.out.println(movie.getName() + " " + 
                          movie.getRating() + " " + 
                          movie.getYear()); 
   } 
} 
} 

