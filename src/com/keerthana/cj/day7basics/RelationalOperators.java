package com.keerthana.cj.day7basics;

public class RelationalOperators {
	public static void main(String[] args) {
		int[] ages = {21,22,23,26,26,25,24,2,28,27,32,31,36,35,34,39,38,37,33,48,45,50};		
			int count=0;
			for(int age:ages) {
				if(age >= 20 && age <= 60) {
					count++;
				}
			}
			System.out.println("for total   "+ages.length+" people "+count+" are in the range");

	}

}
