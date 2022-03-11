/**
 * 
 */
package com.lq.exercises;

import java.util.Scanner;

/**
 * @author Student
 *
 */
public class Lab1 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int x = 30;
		int y = 15;
		
		Scanner sc = new Scanner(System.in);
		x = sc.nextInt();
		
		if (x == 1) {
			System.out.println("John");
		}
		else if (x == 2) {
			System.out.println("Jane");
		}
		else if (x == 3) {
			System.out.println("Sarah");
		}
		else if (x == 4 || x == 5) {
			System.out.println("Good Bye");
		}
		else if (x == 10 && y == 15) {
			System.out.println("Impossible");
		}
		else {
			System.out.println("Tim");
		}
		
		switch(x) {
		case 1:
			System.out.println("John");
			break;
		case 2:
			System.out.println("Jane");
		case 3:
		case 4:
		case 5:
			System.out.println("Good Bye");
			break;
		case 6:
			System.out.println("Hello");
			break;
		default:
			System.out.println("Tim");
		}

	}

}
