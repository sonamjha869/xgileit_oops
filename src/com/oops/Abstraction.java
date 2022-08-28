package com.oops;

abstract class Bike { //abstract parent class
	abstract void run();//abstract method
}
class Honda4 extends  Bike{ //child class honda4 is inherit/extends parent class bike.
	void run() { // we have to write the implementation for inheritate method run.
		//bcz it mandatory for child class to implement abstract method of parent a method run,
		//return type void and its prints word running safely
		System.out.println("running safely");
	}
	public static void main(String [] args) {
		Bike obj = new Honda4();// created object of class bike./*bike is parent class and honda4 is the child class. 
		//so parents class bike is holding referance of child class object honda4.*/
		obj.run();// obj is the object of child class honda4 so honda4 class method will be call.
	}

}
