package com.keerthana.cj.day2;

import java.util.Scanner;

public class EmployeeDetails {
	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		
		System.out.println("enter empno"); 
		String empno = sc.nextLine();
		System.out.println("enter name");
		String name = sc.nextLine();
		System.out.println("enter  salary");
		float salary = sc.nextFloat();
		float y_salary = salary*12;
		
		System.out.println("empnum            :"+empno);
		System.out.println("name              :"+name);
		System.out.println("salary            :"+salary);
		System.out.println("yearly salary     :"+y_salary);
		sc.close();
	}

}
