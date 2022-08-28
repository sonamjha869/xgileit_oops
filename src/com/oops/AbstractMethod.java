package com.oops;

abstract class A { //created parent abstract class
	abstract void m1(); //abstract method
	void m2() { //  created normal method and which  prints one line
		System.out.println("This is"+ "a concrete metho0d.");
	}
	}
class B extends A{//class b extends abstract class a
	void m1()//   we have to write the implementation for inheritate method run.
	//bcz it mandatory for child class to implement abstract method of parent a method run,
	//return type void and it prints.
	{
		System.out.println("B is" + "implementation of m1.");
	}
	}
class AbstractDemo{// created abstractdemo class for the execution
	  public static void main(String [] args)
	  {
		  B b = new B();//created object of class b
		  b.m1();// calling method m1
		  b.m2();//calling method m2
		  
	  }
	
	


}
