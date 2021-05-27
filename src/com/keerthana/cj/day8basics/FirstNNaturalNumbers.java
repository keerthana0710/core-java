package com.keerthana.cj.day8basics;

import java.util.Scanner;

public class FirstNNaturalNumbers {
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter N value");
		int N = sc.nextInt();
		/*for(int i=1;i<=N;i++) {
		System.out.print(i);
		}*/
		//n natural numbers in reverse order
		/*for(int i = N ; i>= 1 ; i--) {
			System.out.print(i+" ");
		}*/
		// print n even numbers
		/*for(int i = 1; i<=N ; i++) {
			if(i%2==0) {
			
				System.out.print(i+" ");
			}
		}*/
		// print even numbers without using if by using only loops
		/*for(int i=2;i<=N;i=i+2) {
			System.out.print(i+" ");
		}*/
		// print odd numbers without using if by using only loops
		/*for(int i=1;i<=N;i=i+2) {
			System.out.print(i+" ");
		}*/
		// print numbers which are divisable by 3&6 but not 9 in the range N
		/*for(int i=1;i<=N;i++) {
			if(i%3==0 && i%6==0 && i%9!=0) {
				System.out.print(i+" ");
			}
		}*/
		/*expected op 1 5
		              2 4
		              3 3
	               	  4 2
		              5 1*/
		for(int i=1,j=N;i<=N;i++,j--) {
			System.out.println(i+" "+j);
		}
		sc.close();
	}

}
