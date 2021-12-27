/*
	Java program to show the use case of an interface
	Author : Benjamin Joseph
	Date : 26-12-2021
*/

package Java;

import java.util.Scanner;

class Animal{
    int legs;
    Animal(int legs){
        this.legs = legs;
    }
    void walk(){
        System.out.println("Walking");
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
}

class Fish extends Animal implements Pet{
    String name;
    Fish(int legs){
        this.legs = legs;
    }
}

public class Interface {
}
