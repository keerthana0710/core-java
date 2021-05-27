package com.keerthana.cj.day7basics;

import java.util.Scanner;

public class ConvertDaysToYearsAndMonths {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter number of days");
		long day = sc.nextLong();
		long years = day/365;
		long months = (day%365)/30;
		long days = (day%365)%30;
		System.out.println(years+"years "+months+"months "+days+"days");
		
		
		sc.close();
		}

}
