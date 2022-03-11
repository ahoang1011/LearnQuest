/**
 * 
 */
package com.lq.second;

import java.util.Scanner;

/**
 * @author Student
 *
 */
public class Main {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String name;
		
		Scanner sc = new Scanner(System.in);
		
		name = sc.nextLine();
		
		if(name.equals("John")) {
			System.out.println("Cap");
		}
		else if(name.equals("john")) {
			System.out.println("Small");
		}
		else if(name.equalsIgnoreCase("jane")) {
			System.out.println("See you tomorrow");
		}
		else {
			System.out.println("Good Bye";)
		}
	}

}
