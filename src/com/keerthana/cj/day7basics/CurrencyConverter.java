package com.keerthana.cj.day7basics;

import java.util.Scanner;

public class CurrencyConverter {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter no of us dollers");
		int usd = sc.nextInt();
		int inr = 75 * usd;
		System.out.println(usd+" = "+inr);
		sc.close();
		
	}
}
