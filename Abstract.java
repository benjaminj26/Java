package Lab21;

abstract class Shape{
	abstract void numberOfSides();
}

class Rectangle extends Shape{
	void numberOfSides() {
		System.out.println("I am a Rectangle, I have 4 sides");
	}
}

class Triangle extends Shape{
	void numberOfSides(){
		System.out.println("I am a Triangle, I have  3 sides");
	}
}

class Hexagon{
	void numberOfSides() {
		System.out.println("I am a Hexagon, I have 6 sides");
	}
}

public class Abstract {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Rectangle rectangle = new Rectangle();
		Triangle triangle = new Triangle();
		Hexagon hexagon = new Hexagon();
		rectangle.numberOfSides();
		triangle.numberOfSides();
		hexagon.numberOfSides();
	}

}
