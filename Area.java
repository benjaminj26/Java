/*
    Author : Benjamin Joseph
    Date : 07-12-2021
*/

package Lab21;

import java.util.Scanner;

public class Area {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int length,breadth;
		float base,height,radius;
		//Triangle
		System.out.print("Input the base length of the triangle: ");
		base = sc.nextInt();
		System.out.print("Input the height of the triangle: ");
		height = sc.nextInt();
		System.out.println("Area of triangle = "+(area(base,height)));
		//Rectangle
		System.out.print("Input the length of the rectangle: ");
		length = sc.nextInt();
		System.out.print("Input the breadth of the rectangle: ");
		breadth = sc.nextInt();
		System.out.println("Area of the rectangle = "+(area(length, breadth)));
		//Circle
		System.out.print("Input the radius of the circle: ");
		radius = sc.nextInt();
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
