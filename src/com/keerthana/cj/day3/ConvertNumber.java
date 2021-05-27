package com.keerthana.cj.day3;

import java.util.Scanner;

/**
 * @author Dell
 *
 */
public class ConvertNumber {
public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	System.out.println("enter the number");
	int num = sc.nextInt();
	if(num<0) {
		num=-num;
	}
		System.out.println("entered number is : "+num);
		sc.close();
}
}
