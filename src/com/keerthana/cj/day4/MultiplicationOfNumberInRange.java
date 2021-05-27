package com.keerthana.cj.day4;

import java.util.Scanner;

public class MultiplicationOfNumberInRange {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("enter lb value");
		int lb = sc.nextInt();
		System.out.println("enter the ub value");
		int ub = sc.nextInt();
		for(int i=lb;i<=ub;i++) {
		for(int j=1;j<=10;j++){
			System.out.println(i+"*"+j+" = "+(i*j));
		}
		System.out.println("-------------");
		}
		sc.close();
		}

}
