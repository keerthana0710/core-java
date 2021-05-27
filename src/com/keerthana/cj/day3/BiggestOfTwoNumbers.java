package com.keerthana.cj.day3;

import java.util.Scanner;

public class BiggestOfTwoNumbers {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter num1");
		int num1 = sc.nextInt();
		System.out.println("enter num2");
		int num2 = sc.nextInt();
		
		if(num1>num2) {
			System.out.println(num1+" is biggest");
			
	}
		else if(num2 > num1) {
			System.out.println(num2+" is biggest");
		}
		else {
			System.out.println("numbers are equal");
			
		}
		sc.close();
	}

}
