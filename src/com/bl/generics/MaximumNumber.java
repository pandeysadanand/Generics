package com.bl.generics;

import java.util.Scanner;

/*
 * @author sadanand pandey
 * Finding maximum number using compareTo method
 */
public class MaximumNumber {

	public static void main(String[] args) {

		campareTo(56, 90, 70);
	}

	/*
	 * comparing objects , to find maximum number
	 */
	public static void campareTo(int num1, int num2, int num3) {
		Integer object1 = new Integer(num1);
		Integer object2 = new Integer(num2);
		Integer object3 = new Integer(num3);
		
		if (object1.compareTo(object2) > 0 && object1.compareTo(object3) > 0)
			System.out.println("object1 is maxximum");

		else if (object2.compareTo(object1) > 0 && object2.compareTo(object3) > 0)
			System.out.println("Object2 is maximum");

		else
			System.out.println("Object3 is maximum");
	}
}