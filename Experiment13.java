package Java;

import java.util.Random;
import java.util.Scanner;

class EvenSquare extends Thread {
	int num;
	EvenSquare(int num) {
		this.num = num;
	}
	public void run() {
		System.out.println("Square of Even Number "+num+" = "+num*num);
	}
}

class OddCube extends Thread {
	int num;
	OddCube(int num) {
		this.num = num;
	}
	public void run() {
		System.out.println("Cube of Odd Number "+num+" = "+num*num*num);
	}
}

class Rand extends Thread {
	int limit;
	Rand(int limit) {
		this.limit = limit;
	}
	public void run() {
		Random random = new Random();
		for(int i=0; i<limit; ++i) {
			int num = random.nextInt(1000);
			if(num%2 == 0) {
				EvenSquare esq = new EvenSquare(num);
				esq.start();
			}
			else {
				OddCube odc = new OddCube(num);
				odc.start();
			}
			try {
				Thread.sleep(1000);
			} 
			catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
}

public class Experiment13 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the limit: ");
		int num = sc.nextInt();
		Rand random = new Rand(num);
		random.start();
		sc.close();
	}

}
