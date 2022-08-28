package com.oops;

class Bus { //class bus
	private String name;
	Bus(String name) // bus name
	{
		this.name = name;
	}
	public String getBusName()
	{
		return this.name;
	}
	}
class Passenger { //passenger class
	private String name; //passenger name
	private int seatId; //passenger seat id number
	Passenger (String name, int seatId)
	{
		this.name = name;
		this.seatId = seatId;
	}
	public String getPassengerName()
	{
		return this.name;
	}
	public int getPassengerId()
	{
		return this.seatId;
	}}
//Association b/w both 
//classes in the main method
class Demo{ 
	public static void main(String [] args) {
		Bus bus = new Bus("Shree Travels");
		Passenger Psg = new Passenger("sneha",52);
		System.out.println(Psg.getPassengerName()+"with seat number"+Psg.getPassengerId()+"is a passenger of"+ bus.getBusName());
	}
}



