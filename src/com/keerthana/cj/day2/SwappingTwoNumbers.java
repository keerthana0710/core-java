package com.keerthana.cj.day2;

import java.util.Scanner;

public class SwappingTwoNumbers {
	public static void main(String[] args) {
		
		int num1,num2;
		
		Scanner sc=new Scanner(System.in);
		System.out.println("enter num1");
		num1=sc.nextInt();
		System.out.println("enter num2");
		num2=sc.nextInt();
		
		System.out.println("number before swap num1="+num1+"and num2="+num2);
		int temp = num1;
		num1 = num2;
		num2 = temp;
		System.out.println("number after swap num1="+num1+"and num2="+num2);
		sc.close();
		
	}

}
