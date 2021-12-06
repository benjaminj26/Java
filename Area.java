package Lab21;

import java.util.Scanner;

public class Area {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int length,breadth,base,height,radius;
		//Triangle
		System.out.print("Input the base length of the triangle: ");
		base = sc.nextInt();
		System.out.print("Input the height of the triangle: ");
		height = sc.nextInt();
		System.out.println("Area of triangle = "+(((float)base*(float)height)/2));
		//Rectangle
		System.out.print("Input the length of the rectangle: ");
		length = sc.nextInt();
		System.out.print("Input the breadth of the rectangle: ");
		breadth = sc.nextInt();
		System.out.println("Area of the rectangle = "+(length*breadth));
		//Circle
		System.out.print("Input the radius of the circle: ");
		radius = sc.nextInt();
		System.out.println("Area of the circle = "+(((float)22/(float)7)*(float)radius*(float)radius));
		sc.close();
	}

}
