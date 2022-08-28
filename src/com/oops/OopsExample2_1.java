package com.oops;
// in this code i have created multiple object in the same class
public class OopsExample2_1 { //created class
	public static void main( String [] args) { //it is used for the execute the code
		OopsExample2 myobj1= new  OopsExample2(); // created object
		OopsExample2 myobj2 = new OopsExample2();// created different object for same class type.
		System.out.println(myobj1.a);//10 // it will return the value of a of an object 
		System.out.println(myobj2.b);//8 // it will return the value of b of an object.
		
	}

}
