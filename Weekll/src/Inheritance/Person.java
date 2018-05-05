package Inheritance;

public class Person {
	String name;
	String dob;
	public Person(String name, String dob) {
		this.name = name;
		this.dob = dob;
		
	}
	public void getPersonInfor(){
		System.out.println("Hello, His/Her name is "+ name +" I was born in "+ dob);
	}

}
