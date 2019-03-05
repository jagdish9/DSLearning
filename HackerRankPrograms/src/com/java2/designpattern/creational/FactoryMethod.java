package com.java2.designpattern.creational;

/*Also known as
Virtual Constructor

Intent
Define an interface for creating an object, but let subclasses decide which class to instantiate. 
Factory Method lets a class defer instantiation to subclasses.

Explanation
Real world example

Blacksmith manufactures weapons. Elves require Elvish weapons and orcs require Orcish weapons. 
Depending on the customer at hand the right type of blacksmith is summoned.

In plain words

It provides a way to delegate the instantiation logic to child classes.

Wikipedia says

In class-based programming, the factory method pattern is a creational pattern that uses factory methods 
to deal with the problem of creating objects without having to specify the exact class of the object that will be created. This is done by creating objects by calling a factory method—either specified in an interface and implemented by child classes, or implemented in a base class and optionally overridden by derived classes—rather than by calling a constructor.

Programmatic Example*/

interface Weapon{
	
}

class ElfWeapon implements Weapon{

	public ElfWeapon(WeaponType weaponType) {
		System.out.println("Elf Weapon");
	}
	
}

class OrcWeapon implements Weapon{
	public OrcWeapon(WeaponType weaponType){
		System.out.println("Orc Weapon");
	}
}

class WeaponType{
	public static final WeaponType SPEAR = null;
	public static final WeaponType AXE = null;
}

interface Blacksmith {
	  Weapon manufactureWeapon(WeaponType weaponType);
	}

class ElfBlacksmith implements Blacksmith {
	  public Weapon manufactureWeapon(WeaponType weaponType) {
	    return new ElfWeapon(weaponType);
	  }
	}

class OrcBlacksmith implements Blacksmith {
	  public Weapon manufactureWeapon(WeaponType weaponType) {
	    return new OrcWeapon(weaponType);
	  }
	}

//	Now as the customers come the correct type of blacksmith is summoned and requested weapons are manufactured
public class FactoryMethod {
	
	public static void main(String[] args){
		
	Blacksmith blacksmith = new ElfBlacksmith();
	blacksmith.manufactureWeapon(WeaponType.SPEAR);
	blacksmith.manufactureWeapon(WeaponType.AXE);
	
	
	}
	
}

/*Applicability
Use the Factory Method pattern when

a class can't anticipate the class of objects it must create
a class wants its subclasses to specify the objects it creates
classes delegate responsibility to one of several helper subclasses, 
and you want to localize the knowledge of which helper subclass is the delegate
	*/