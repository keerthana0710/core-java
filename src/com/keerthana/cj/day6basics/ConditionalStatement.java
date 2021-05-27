package com.keerthana.cj.day6basics;

import java.util.Scanner;

public class ConditionalStatement {
	public static void main(String[] args) {
		int big;
		Scanner sc = new Scanner(System.in);
		System.out.println("enter num1");
		int num1 = sc.nextInt();
		System.out.println("enter num2");
		int num2 = sc.nextInt();
		System.out.println("enter num3");
		int num3 = sc.nextInt();
		if (num1 > num2 && num1 > num3) {
			big = num1;
		} else if (num2 > num3) {
			big = num2;
		} else {
			big = num3;
		}
		System.out.println("the biggest of " + num1 + "," + num2 + "," + num3 + " is " + big + "");
		sc.close();
	}

}
