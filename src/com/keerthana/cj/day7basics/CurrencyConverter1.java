package com.keerthana.cj.day7basics;

import java.util.Scanner;

import com.sun.javafx.scene.layout.region.Margins.Converter;

public class CurrencyConverter1 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter amount");
		Long amount = sc.nextLong();
		sc.nextLine();
		System.out.println("enter (usd|euro) fromcurreny");
		String fromcurrency = sc.nextLine();
		System.out.println("enter (inr|lkr) tocurreny");
		String tocurrency = sc.nextLine();
		float price;
		if(fromcurrency.equals("usd") && tocurrency.equals("inr")) {
			price = 75.9f;
		}else if(fromcurrency.equals("usd") && tocurrency.equals("lkr")) {
			price = 150f;
		}else if(fromcurrency.equals("euro") && tocurrency.equals("inr")) {
			price = 120f;
		}else if(fromcurrency.equals("euro") && tocurrency.equals("lkr")) {
			price = 230f;
		}else {
			System.out.println("entered wrong choice");
			return;
		}
		double convertedamount = price * amount;
		System.out.println(fromcurrency+amount+" = "+convertedamount + tocurrency);
		
		sc.close();
	}

}
