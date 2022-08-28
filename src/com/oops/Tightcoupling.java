package com.oops;

class College{
	void status() {
		System.out.println("college is open today");
	}
	}
class Student1{
	College obj = new College();
	void gotocollege() {

		obj.status();
	}}

