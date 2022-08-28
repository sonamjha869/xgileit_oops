package com.oops;

interface College1 {
	void status();
}
	class CollegeStatus1 implements College1{
		 public void status() {
			System.out.println("college is open monday to friday");
		 }
		}
	class CollegeStatus2 implements College1{
		public void status() {
			System.out.println("college is open on saturday");
		}
		}
	class Student2{
		College1 obj = new CollegeStatus1();
		 void goToCollege () {
			 obj.status();
		 }
		
	

}
