package com.keerthana.cj.day4;

import java.util.Scanner;

public class PrimeNumbersInRange {
		public static void main(String[] args) {
			
			Scanner sc = new Scanner(System.in);
			System.out.println("enter lb value");
			int lb = sc.nextInt();
			System.out.println("enter the ub value");
			int ub = sc.nextInt();
			
			for(int l=lb;l<=ub;l++) {
				int num=l;
			boolean isprime = true;
			for(int i = 2; i <= num/2; i++) {
				if(num % i == 0) {
					isprime=false;
					break;
				}
			}
			if(isprime) {
				System.out.print(num+" ");
			}
			
			}
			sc.close();
	}

}
