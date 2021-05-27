package com.keerthana.cj.day2;

import java.util.Scanner;

public class Calc {
	
public static void main(String[] args) {
	
	Scanner sc=new Scanner(System.in);
	System.out.println("enter num 1:");
	int num1=sc.nextInt();
	System.out.println("enter num2: ");
	int num2=sc.nextInt();
	
	
	System.out.println(num1+"+"+num2+"="+(num1+num2));
	System.out.println(num1+"-"+num2+"="+(num1-num2));
	System.out.println(num1+"*"+num2+"="+(num1*num2));
	System.out.println(num1+"/"+num2+"="+(num1/num2));
	System.out.println(num1+"%"+num2+"="+(num1%num2));
	
     sc.close();	
}
}
