package com.bl.generics;

/*
 * @author sadanand pandey
 * Finding maximum number using compareTo method
 */
public class MaximumNumber <T extends Comparable<T>>{
	T var1, var2, var3;
	
	MaximumNumber(T var1, T var2, T var3){
		this.var1 = var1;
		this.var2 = var2;
		this.var3 = var3;
	}
	 //compareTo method for Checking Maximum from 3 Object
	public T compareTo() {
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
        MaximumNumber<Integer> integerComparison = new MaximumNumber(56, 70, 60);
        System.out.println("Maximum from 3 Integer Object : "+integerComparison.compareTo());
        //Creating Generic Float Object for Float Comparison
        MaximumNumber floatComparison = new MaximumNumber(90.25F,120.63F,90.56F);
        System.out.println("Maximum from 3 Float Object   : "+floatComparison.compareTo());
        //Creating Generic String Object for String Comparison
        MaximumNumber stringComparison = new MaximumNumber("Indai", "UK", "USA");
        System.out.println("Maximum from 3 String Object  : "+stringComparison.compareTo());
    }
}
