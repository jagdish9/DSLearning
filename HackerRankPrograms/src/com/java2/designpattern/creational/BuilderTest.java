package com.java2.designpattern.creational;

/*Intent
Separate the construction of a complex object from its representation so that the 
same construction process can create different representations.

Explanation
Real world example

Imagine a character generator for a role playing game. The easiest option is to 
let computer create the character for you. But if you want to select the character 
details like profession, gender, hair color etc. the character generation 
becomes a step-by-step process that completes when all the selections are ready.

In plain words

Allows you to create different flavors of an object while avoiding constructor pollution.
Useful when there could be several flavors of an object.
Or when there are a lot of steps involved in creation of an object.

Wikipedia says

The builder pattern is an object creation software design pattern with the intentions of 
finding a solution to the telescoping constructor anti-pattern.

Having said that let me add a bit about what telescoping constructor anti-pattern is.
At one point or the other we have all seen a constructor like below:*/

/*public Hero(Profession profession, String name, HairType hairType, HairColor hairColor, Armor armor, HairWeapon weapon) {
}
*/
/*As you can see the number of constructor parameters can quickly get out of hand and it might
become difficult to understand the arrangement of parameters. Plus this parameter list could 
keep on growing if you would want to add more options in future. This is called telescoping constructor anti-pattern.

Programmatic Example

The sane alternative is to use the Builder pattern. First of all we have our hero that we want to create
*/

class Profession{

	public static final String MAGE = null;
}

class HairType{
	
}

class HairColor{

	public static final String BLACK = null;
	
}

class Armor{
	
}

class HairWeapon{

	public static final String DAGGER = null;
	
}

 final class Hero {
  private final Profession profession;
  private final String name;
  private final HairType hairType;
  private final HairColor hairColor;
  private final Armor armor;
  private final HairWeapon weapon;

  Hero(Builder builder) {
    this.profession = builder.profession;
    this.name = builder.name;
    this.hairColor = builder.hairColor;
    this.hairType = builder.hairType;
    this.weapon = builder.weapon;
    this.armor = builder.armor;
  }
}//And then we have the builder

 class Builder {
    final Profession profession;
    final String name;
    HairType hairType;
    HairColor hairColor;
    Armor armor;
    HairWeapon weapon;

    public Builder(Profession profession, String name) {
      if (profession == null || name == null) {
        throw new IllegalArgumentException("profession and name can not be null");
      }
      this.profession = profession;
      this.name = name;
    }

    public Builder withHairType(HairType hairType) {
      this.hairType = hairType;
      return this;
    }

    public Builder withHairColor(HairColor hairColor) {
      this.hairColor = hairColor;
      return this;
    }

    public Builder withArmor(Armor armor) {
      this.armor = armor;
      return this;
    }

    public Builder withWeapon(HairWeapon weapon) {
      this.weapon = weapon;
      return this;
    }

    public Hero build() {
      return new Hero(this);
    }
  }

//And then it can be used as:


public class BuilderTest {

	public static void main(String[] args){
		/*Hero mage = new Hero.Builder(Profession.MAGE, "Riobard")
				.withHairColor(HairColor.BLACK)
				.withWeapon(HairWeapon.DAGGER).build();*/

	}
}

/*Applicability
Use the Builder pattern when

the algorithm for creating a complex object should be independent of the parts that make up the 
object and how they're assembled
the construction process must allow different representations for the object that's constructed
*/