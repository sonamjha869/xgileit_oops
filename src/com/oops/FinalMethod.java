package com.oops;

 class FinalMethod { // created class
	 final void method() { //created final method
		 System.out.println("parent class final method");
	 }}
  class FinalMethodChild extends FinalMethod{ //created child class finalmethodchild
	  //which inherits/extends parent class finalmethod
	  void method () {// in general child can override the parent method,
		 // but if a method declared as final in parent then child cannot change implementation for that method
		  System.out.println("final method modified inside child class");
	  }
	  public static void main(String [] args) {
		  FinalMethodChild f = new FinalMethodChild();//created object of finalmethodchild
		  f.method();//called method method
		  
		  
		  
		  
	  }
	  
	

}
