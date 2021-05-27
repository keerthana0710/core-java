package com.keerthana.cj.day4;

import java.util.Scanner;

public class CheckPrimeOrNot {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the number");
		int n = sc.nextInt();
		boolean isprime = true;
		for(int i=2;i<=n/2;i++) {
			if(n%i==0) {
				isprime = false;
			break;
		}
	}
		if(isprime) {
			System.out.println("number is prime");
		}else {
			System.out.println("number is not a prime");
		}
		sc.close();
	}

}
