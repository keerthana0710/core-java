package com.keerthana.cj.day8basics;

import java.util.Scanner;

public class TernaryOperator {
	public static void main(String[] args) {
		//biggest of three numbers
		int big;
		Scanner sc = new Scanner(System.in);
		System.out.println("enter num1");
		int num1 = sc.nextInt();
		System.out.println("enter num2");
		int num2 = sc.nextInt();
		System.out.println("enter num3");
		int num3 = sc.nextInt();
		 big = (num1>num2 && num1>num3)? num1:(num2>num3)?num2:num3;
	/*
		}
		else if(num2>num3) {
			big = num2;
		}
		else {
			big =num3;
		}*/
		System.out.println("biggest is "+big);
		sc.close();
	}

}
