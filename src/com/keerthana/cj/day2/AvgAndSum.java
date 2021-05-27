package com.keerthana.cj.day2;

import java.util.Scanner;

public class AvgAndSum {

	public static void main(String[] args) {
		
		float weight_1,weight_2,weight_3,sum,avg;
		Scanner sc=new Scanner(System.in);
		
		System.out.println("enter weight1");
		weight_1 = sc.nextFloat();
		System.out.println("enter weight2");
		weight_2 = sc.nextFloat();
		System.out.println("enter weight3");
		weight_3 = sc.nextFloat();
		sum=weight_1 + weight_2 + weight_3;
		avg=sum/3;
		
		System.out.println("sum of weights :"+sum+"");
		
		System.out.println("avg of weights : "+avg+"");
		
		sc.close();
		
	}
}
