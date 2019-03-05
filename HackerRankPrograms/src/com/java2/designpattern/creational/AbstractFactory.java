package com.java2.designpattern.creational;

import com.java2.designpattern.creational.FactoryMaker.KingdomType;

/*Also known as
Kit

Intent
Provide an interface for creating families of related or dependent objects without specifying their concrete classes.

Explanation
Real world example

To create a kingdom we need objects with common theme. Elven kingdom needs an Elven king, 
Elven castle and Elven army whereas Orcish kingdom needs an Orcish king, 
Orcish castle and Orcish army. There is a dependency between the objects in the kingdom.

In plain words

A factory of factories; a factory that groups the individual but related/dependent factories together 
		without specifying their concrete classes.

Wikipedia says

The abstract factory pattern provides a way to encapsulate a group of individual factories 
that have a common theme without specifying their concrete classes

Programmatic Example*/

interface Castle {
	  String getDescription();
	}
interface King {
	  String getDescription();
	}
interface Army {
	  String getDescription();
	}

	// Elven implementations ->
class ElfCastle implements Castle {
	  static final String DESCRIPTION = "This is the Elven castle!";
	  public String getDescription() {
	    return DESCRIPTION;
	  }
	}
 class ElfKing implements King {
	  static final String DESCRIPTION = "This is the Elven king!";
	  public String getDescription() {
	    return DESCRIPTION;
	  }
	}
class ElfArmy implements Army {
	  static final String DESCRIPTION = "This is the Elven Army!";
	  public String getDescription() {
	    return DESCRIPTION;
	  }
	}

//Orcish implementations similarly...
class OrcCastle implements Castle {
	  static final String DESCRIPTION = "This is the Orc castle!";
	  public String getDescription() {
	    return DESCRIPTION;
	  }
	}
class OrcKing implements King {
	  static final String DESCRIPTION = "This is the Orc king!";
	  public String getDescription() {
	    return DESCRIPTION;
	  }
	}
class OrcArmy implements Army {
	  static final String DESCRIPTION = "This is the Orc Army!";
	  public String getDescription() {
	    return DESCRIPTION;
	  }
	}

//Then we have the abstraction and implementations for the kingdom factory

interface KingdomFactory {
Castle createCastle();
King createKing();
Army createArmy();
}

class ElfKingdomFactory implements KingdomFactory {
public Castle createCastle() {
 return new ElfCastle();
}
public King createKing() {
 return new ElfKing();
}
public Army createArmy() {
 return new ElfArmy();
}

}

class OrcKingdomFactory implements KingdomFactory {
public Castle createCastle() {
 return new OrcCastle();
}
public King createKing() {
 return new OrcKing();
}
public Army createArmy() {
 return new OrcArmy();
}
}

class FactoryMaker {

	public enum KingdomType {
	 ELF, ORC
	}

	public static KingdomFactory makeFactory(KingdomType type) {
	 switch (type) {
	   case ELF:
	     return new ElfKingdomFactory();
	   case ORC:
	     return new OrcKingdomFactory();
	   default:
	     throw new IllegalArgumentException("KingdomType not supported.");
	 }
   }
}

/*Now we have our abstract factory that lets us make family of related objects 
i.e. Elven kingdom factory creates Elven castle, king and army etc.*/

public class AbstractFactory {
    public static void main(String[] args){
    	KingdomFactory factory = new ElfKingdomFactory();
    	Castle castle = factory.createCastle();
    	King king = factory.createKing();
    	Army army = factory.createArmy();

    	castle.getDescription();  // Output: This is the Elven castle!
    	king.getDescription(); // Output: This is the Elven king!
    	army.getDescription(); // Output: This is the Elven Army!
    	
    	AppFactory app = new AppFactory();

    	app.createKingdom(FactoryMaker.makeFactory(KingdomType.ELF));
    	app.getArmy().getDescription();
    	app.getCastle().getDescription();
    	app.getKing().getDescription();

    	app.createKingdom(FactoryMaker.makeFactory(KingdomType.ORC));
    	//-- similar use of the orc factory
    }
  
}


/*Now, we can design a factory for our different kingdom factories. In this example,
we created FactoryMaker, responsible for returning an instance of either ElfKingdomFactory or OrcKingdomFactory.
The client can use FactoryMaker to create the desired concrete factory which, 
in turn, will produce different concrete objects (Army, King, Castle).
In this example, we also used an enum to parameterize which type of kingdom factory the client will ask for.*/


class AppFactory{
	public KingdomFactory createKingdom(KingdomFactory kingdomFactory){
		if(kingdomFactory instanceof ElfKingdomFactory)
			return new ElfKingdomFactory();
		else 
			return new OrcKingdomFactory();
	}

	public Castle getKing() {
		// TODO Auto-generated method stub
		return null;
	}

	public Castle getCastle() {
		// TODO Auto-generated method stub
		return null;
	}

	public Castle getArmy() {
		// TODO Auto-generated method stub
		return null;
	}
}

/*Applicability
Use the Abstract Factory pattern when

a system should be independent of how its products are created, composed and represented
a system should be configured with one of multiple families of products
a family of related product objects is designed to be used together, and you need to enforce this constraint
you want to provide a class library of products, and you want to reveal just their interfaces, not their implementations
the lifetime of the dependency is conceptually shorter than the lifetime of the consumer.
you need a run-time value to construct a particular dependency
you want to decide which product to call from a family at runtime.
you need to supply one or more parameters only known at run-time before you can resolve a dependency.

*/