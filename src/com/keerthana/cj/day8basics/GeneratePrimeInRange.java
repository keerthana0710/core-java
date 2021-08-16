package com.keerthana.cj.day8basics;

import java.util.Scanner;

public class GeneratePrimeInRange {
	public static void main(String[] args) {
		//generate first n prime number
		Scanner sc = new Scanner(System.in);
		System.out.println("enter n value");
		int n = sc.nextInt();
		boolean isprime = true;
		for(int i=2;i<=n/2;i++) {
			if(n%i==0) {
				isprime = false;
			}
			if(isprime) {
				System.out.print("prime");
			}else
				System.out.print("not prime");
		}
	}

}
