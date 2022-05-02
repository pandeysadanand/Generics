package com.bl.generics;

import java.util.Scanner;

/*
 * @author sadanand pandey
 * Finding maximum number using compareTo method
 */
public class MaximumNumber {

	public static void main(String[] args) {
		compareTo("Apple", "vegetables", "Banana");
	}

	/*
	 * comparing objects , to find maximum number
	 */
	public static void campareTo(int num1, int num2, int num3) {
		Integer number1 = new Integer(num1);
		Integer number2 = new Integer(num2);
		Integer number3 = new Integer(num3);

		if (number1.compareTo(number2) > 0 && number1.compareTo(number3) > 0)
			System.out.println("number1 is maximum");

		else if (number2.compareTo(number1) > 0 && number2.compareTo(number3) > 0)
			System.out.println("number2 is maximum");

		else
			System.out.println("number3 is maximum");
	}

	/*
	 * comparing 3float objects , to find maximum number
	 */
	public static void compareTo(float num1, float num2, float num3) {
		Float number1 = new Float(num1);
		Float number2 = new Float(num2);
		Float number3 = new Float(num3);

		if (number1.compareTo(number2) > 0 && number1.compareTo(number3) > 0)
			System.out.println("number1 is maxximum");

		else if (number2.compareTo(number1) > 0 && number2.compareTo(number3) > 0)
			System.out.println("number2 is maximum");

		else
			System.out.println("number3 is maximum");
	}
	/*
	 * comparing 3 string , to find maximum String
	 */
	public static void compareTo(String str1, String str2, String str3) {
		String word1 = new String(str1);
		String word2 = new String(str2);
		String word3 = new String(str3);

		if (word1.compareTo(word2) > 0 && word1.compareTo(word3) > 0)
			System.out.println("Words is maxximum");

		else if (word2.compareTo(word1) > 0 && word2.compareTo(word3) > 0)
			System.out.println("Word2 is maximum");

		else
			System.out.println("Word3 is maximum");
	}
}
