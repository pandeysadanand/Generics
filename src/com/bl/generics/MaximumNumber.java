package com.bl.generics;

/*
 * @author sadanand pandey
 * Finding maximum number using compareTo method
 */
public class MaximumNumber {
	 //compareTo method for Checking Maximum from 3 Object
    public static <T extends Comparable<T>> T compareTo(T var1,T var2, T var3) {
        if(var1.compareTo(var2) > 0){
            if(var1.compareTo(var3) > 0) {
                return var1;
            } else {
                return var3;
            }
        } else {
            if(var2.compareTo(var3) > 0) {
                return var2;
            } else {
                return var3;
            }
        }
    }

    public static void main(String[] args) {
        //Welcome message for User
    	System.out.println("===============================================");
        System.out.println("Welcome to Java Core - Generics Test Maximum.");
        System.out.println("===============================================");
        System.out.println();
        //Creating Generic Integer Object for Integer Comparison
        MaximumNumber integerComparison = new MaximumNumber();
        System.out.println("Maximum from 3 Integer Object : "+integerComparison.compareTo(56, 70, 60));
        //Creating Generic Float Object for Float Comparison
        MaximumNumber floatComparison = new MaximumNumber();
        System.out.println("Maximum from 3 Float Object   : "+floatComparison.compareTo(90.25F,120.63F,90.56F));
        //Creating Generic String Object for String Comparison
        MaximumNumber stringComparison = new MaximumNumber();
        System.out.println("Maximum from 3 String Object  : "+stringComparison.compareTo("Indai", "UK", "USA"));
    }
}
