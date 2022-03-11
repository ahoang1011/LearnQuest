/**
 * 
 */
package com.lq.exercises;

/**
 * @author Student
 *
 */
public class Lab2 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int width, height, area;
		double radius = 10.0, pi = 3.14;
		boolean result = true;
		
		width = 8;
		height = 12;
		area = 96;
		
		int[] daysInMonths = new int[] {31,28,31,30,31,30,31,31,30,31,30,31};
		String[] monthNames = new String[] {"January","February","March","April","May","June","July","August","September","October","November","December"};
		
		int x = 30;
		int y = 15;
		
		if (x < 20) {
			System.out.println("Hello");
		}
		else {
				System.out.println("Bye");
		}
		
		System.out.println("Hello World!");
		System.out.println("The value of width is " + width);
		System.out.println("The value of height is " + height);
		System.out.println("The value of area is " + area);
		System.out.println("The value of radius is " + radius);
		System.out.println("The value of pi is " + pi);
		System.out.println("The value of result is " + result);
		
		for (int i = 0; i < daysInMonths.length; i++)
			System.out.println(monthNames[i] + " has " + daysInMonths[i] + " days.");
		

	}

}
