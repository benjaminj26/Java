/*
    Program to demonstrate multiple inheritance in Java
    Author : Benjamin Joseph
    Date : 06-01-2022
*/

package Java;

class Animal{
    int legs;
    String name;
    Animal(int legs){
        this.legs = legs;
    }
    void walk(){
        System.out.println("This animal walks on "+legs+" legs");
    }
    void eat(){
        System.out.println("Eating");
    }
}

interface Pet{
    String getName();
    void setName(String name);
    void play();
}

class Spider extends Animal{
    Spider(int legs){
        super(legs);
    }
    void eat() {
    	System.out.println("Spider eats Insects");
    }
}

class Cat extends Animal implements Pet{
	Cat(int legs, String name){
		super(legs);
		this.name = name;
	}
	void eat() {
		System.out.println("Cat eats Fish");
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public void play() {
		System.out.println("Cat plays with people");
	}
}

class Fish extends Animal implements Pet{
    Fish(int legs, String name){
        super(legs);
        this.name = name;
    }
    void eat() {
    	System.out.println("Fish eats plants");
    }
    void walk() {
    	System.out.println("Fish has no legs");
    }
    public String getName() {
    	return name;
    }
    public void setName(String name) {
    	this.name = name;
    }
    public void play() {
    	System.out.println("Fish likes to swim around");
    }
}

public class Interface {
	public static void main(String[] args) {
		Fish fish = new Fish(0, "Mimi");
		System.out.println("This fish's name is "+fish.getName());
		fish.eat();
		fish.walk();
		fish.setName("Momo");
		System.out.println("This fish's name is "+fish.getName());
		fish.play();
		System.out.println();

		Cat cat = new Cat(4, "Fluffy");
		System.out.println("This cat's name is "+cat.getName());
		cat.eat();
		cat.walk();
		cat.setName("Moose");
		System.out.println("This cat's name is "+cat.getName());
		cat.play();
		System.out.println();

		Spider spider = new Spider(8);
		spider.eat();
		spider.walk();
	}
}
