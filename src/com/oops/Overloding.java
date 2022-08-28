package com.oops;
 class Adder { //created class
	 static int add(int a,int b) { //created a parameterlized static method add
		 return a+b; }//and its returns sum of 2 nos
	 static int add(int a,int b,int c) {// now we have overloded add method with 3 parameter
		 return a+b+c;} // and its returns sum of 3 nos
	}
 class TestOverloding1{ //i have created class testoverloding1 for code execution
	 public static void main(String [] args) {
		 System.out.println(Adder.add(11,11));//we have called the method add with 2 parameters
		 System.out.println(Adder.add(11,11,11));// we have called the overloded methods with 3 parameters
		 
	 }
 }
