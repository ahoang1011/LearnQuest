package com.lq.exercises;

public class Lab3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String[] daysOfWeek = new String[] {"Monday","Tuesday","Wednesday",
				"Thursday","Friday","Saturday","Sunday"};
		
		System.out.println("_____EXERCISE 1_____");
		
		for(int days = 0; days < daysOfWeek.length; days++) {
			System.out.println(daysOfWeek[days]);
		}
		
		System.out.println();
		
		for(int days = daysOfWeek.length - 1; days >= 0; days--) {
			System.out.println(daysOfWeek[days]);
		}
		
		System.out.println();
		System.out.println("_____EXERCISE 2_____");
		
		int i = 0;
		int j = 20;
		
		while(++i <= j) {
			if (i % 2 == 1) continue;
			System.out.print(i + " ");	
		}
		
		System.out.println();
		System.out.println();
		System.out.println("_____EXERCISE 3_____");
		
		for (int a = 1; a < 100; a++) {
			if (50 <= a && a <= 60) continue;
			System.out.print(a + " ");
		}
		
		System.out.println();
		System.out.println("_____EXERCISE 4_____");
		
		int counter = 0;
		
		while(++counter <= 12) {
			switch(counter) {
			case: 
			}
		}

	}

}
