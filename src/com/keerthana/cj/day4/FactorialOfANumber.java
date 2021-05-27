package com.keerthana.cj.day4;

import java.util.Scanner;

public class FactorialOfANumber {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the number");
		int n = sc.nextInt();
		int temp=1;
		for(int i=2;i <= n;i++) {
			int r;
			temp *=i;
			
		}
		System.out.println("factorial of : "+temp);
		sc.close();
		
		
	}

}
