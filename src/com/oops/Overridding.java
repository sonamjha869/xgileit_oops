package com.oops;
class Vehicle{//Created parent class vehicle
	void run() {// created a method run.return type is void and its prints words vehicle is running
		System.out.println("vehicle is running");
	}}
 class Bike2 extends Vehicle{//child class bike2 is inheriting/extends parent class vehicle.
	 void run(){ //
		 System.out.println("Bike is running safely");
	 }
	 public static void main (String [] args) {
		 Bike2 obj =new Bike2(); //creating object of class bike2
		 obj.run();// calling method run implemented is parent class bike2
	 }
	
	

}
