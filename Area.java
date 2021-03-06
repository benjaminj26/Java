/*
	Java program to find the area of a Triangle, Rectangle and Circle using method overloading
	Author : Benjamin Joseph
	Date : 26-12-2021
*/

package Java;

import java.util.Scanner;

public class Area {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int length,breadth;
		float base,height,radius;
		//Triangle
		System.out.print("Input the base length of the triangle: ");
		base = sc.nextFloat();
		System.out.print("Input the height of the triangle: ");
		height = sc.nextFloat();
		System.out.println("Area of triangle = "+(area(base,height)));
		//Rectangle
		System.out.print("Input the length of the rectangle: ");
		length = sc.nextInt();
		System.out.print("Input the breadth of the rectangle: ");
		breadth = sc.nextInt();
		System.out.println("Area of the rectangle = "+(area(length, breadth)));
		//Circle
		System.out.print("Input the radius of the circle: ");
		radius = sc.nextFloat();
		System.out.println("Area of the circle = "+(area(radius)));
		sc.close();
	}

	static float area(float base, float height) {
		return ((base*height)/2);
	}

	static int area(int length, int breadth) {
		return (length*breadth);
	}

	static float area(float radius) {
		return ((22f/7f)*radius*radius);
	}

}
