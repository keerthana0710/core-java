package com.keerthana.cj.day4;

import java.util.Scanner;

public class PrintFactorsOfGivenNumber {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the number");
		int n = sc.nextInt();
		int count = 0;
		for(int i=1;i<=n;i++) {
			if(n%i==0) {
				System.out.println(i);
			count++;
		}
			
		}
		System.out.println("\nfactors count is:"+count);
		if(count==0) {
			System.out.println("given number is prime");
		}
		else {
			System.out.println("given number is not prime");
		}
		sc.close();
	}

}
