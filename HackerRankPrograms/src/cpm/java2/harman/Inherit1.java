package cpm.java2.harman;

class Animal{
	public void speak(){
		System.out.println("speak");
	}
}

class Dog extends Animal{
	public void speak(){
		System.out.println("speak Dog");
	}
}

class Cat extends Animal{
	public void speak(){
		System.out.println("speak Cat");
	}
}

public class Inherit1 extends Animal{

	public static void main(String args[]){
	Animal a[] = new Animal[3];
	a[0] = new Animal();
	a[1] = new Dog();
	a[2] = new Cat();
	for(int i = 0; i < a.length; i++){
        a[i].speak();
	 }
	}
}
