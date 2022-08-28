package com.oops;
class  TestEqualMethod  {// created class
	public static void main (String [] args)
	{
		String s1= "GreatLearning";//created variable S1 of  type string
		String s2= "GreatLearning";//
		String s3= new // created string object s3
				String("GreatLearning");
		System.out.println(s1==s3);//false // == compares addresses 
		System.out.println(s1.equals(s2)); //true //.equl methods compare  value of string.
		System.out.println(s1.equals(s3)); //true //same as
		
				
	}
	

}
