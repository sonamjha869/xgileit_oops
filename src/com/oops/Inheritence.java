package com.oops;

 class Animal { //created  parent class animal
	 void eat() { // created a method  eat. return type is void and its prints word eating.
		 System.out.println("eating");//
	 }}
	 class Dog extends Animal{ //  child class dog is inheriting/extends parent class animal.
		 void bark() { // created a method bark. return type is void and its prints word barking.
			 System.out.println("barking");
		 }}
		 class BabyDog extends Dog{ //  child class babydog is inheriting parent class dog.
			 void weep() {   // 
				 System.out.println("weeping");
			 }}
		 class TestInheritence2{ // i have created class testinheritence2 for code execution. 
			 public static void main (String [] args) {
				 BabyDog d = new BabyDog();//created object of class babydog
				 d.weep(); //calling method  weep implemented in child class babydog
				 d.bark();//calling method bark implemented  in parent class dog.
				 d.eat();//calling  method eat implemented  in parent class animal
			 }
		 }
	 


