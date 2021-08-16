package com.keerthana.cj.day8basics;

import java.util.Scanner;
import java.util.concurrent.ThreadLocalRandom;

public class GenerateNEvenRandomNumbers {
	public static void main(String[] args) {
		// print n even random numbers in range 1001 to 2000
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the n value");
		int n = sc.nextInt();
		int count = 0;
		for(;;){
			int num = ThreadLocalRandom.current().nextInt(1001,2000);
			if(num%2==0) {
				count++;
				System.out.print(num+" ");
		}
			if(count==n) {
			break;
	}
		}
		sc.close();
	}

}
