package com.keerthana.cj.day8basics;

import java.util.Scanner;
import java.util.concurrent.ThreadLocalRandom;

/**
 * @author Dell
 *
 */
public class DiceGame {
	public static void main(String[] args) {
		// 1,2,3,4,5,6
		int num = ThreadLocalRandom.current().nextInt(1, 6);
		Scanner sc = new Scanner(System.in);
		for (int i = 1; i <= 3; i++) {
			System.out.println("guss the number:(1-6)");
			int gnumber = sc.nextInt();
			if (num == gnumber) {
				System.out.println("congratulations");
			break;
			}
			else {
				if (i == 3) {

					System.out.println("sorry.....! your chances are over");
				} else {

					System.out.println("sorry....!try again");
				}
			}
		}

		sc.close();
	}

}
