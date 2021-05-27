package com.keerthana.cj.day3;

import java.util.Scanner;

public class EvenOrOdd {
	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		
		System.out.println("enter the num");
		int num = sc.nextInt();
		
		if(num % 2 == 0) {
			System.out.println("number is even");
		}
		else {
			System.out.println("entered numberer is odd");

		}
	sc.close();
	}
	
}
