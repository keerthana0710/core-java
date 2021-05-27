package com.keerthana.cj.day3;

import java.util.Scanner;

public class StudentGrade {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the name");
		String name = sc.nextLine();
		System.out.println("enter the score");
		float score = sc.nextFloat();
		if(score>=0 && score<=5)
		{
			System.out.println("student grade is c");
		}
		else if(score>=6 && score<=8)
		{
			System.out.println("student grade is b");
		}
		else if(score>=9 && score<=10)
		{
			System.out.println("student grade is a");
		}
		else
		{
			System.out.println("INVALID SCORE");
		}
		sc.close();
	}
	

}
