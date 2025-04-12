package Polymorphism;

import java.util.Scanner;

public class PolyTest {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int selectedBike;
		System.out.println("Select Model number from below : \n\t 1. Honda\n\t2.Yamaha");
		selectedBike=sc.nextInt();
		switch (selectedBike) {
		case 1:
			Honda h1=new Honda();
			System.out.println("Honda Topspeed: "+h1.topspeed());
			break;
		case 2:
			Yamaha y1=new Yamaha();
			System.out.println("Yamaha Topspeed: "+y1.topspeed());
			break;

		default:
			System.err.println("Wrong selection");
			break;
		}
			

	}

}
