package com.keerthana.cj.day4;

import java.util.Scanner;

public class PrintEvenNumbersInRange {
	public static void main(String[] args) {
	
		Scanner sc = new Scanner(System.in);
		System.out.println("enter lb value");
		int lb = sc.nextInt();
		System.out.println("enter the ub value");
		int ub = sc.nextInt();
		for(int i=lb;i<=ub;i++) {
			if(i%2 == 0)
				System.out.println(i);
		}
		sc.close();
	}
	
	

}
