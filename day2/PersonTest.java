 //class and data abstraction
 import java.util.*;
 class Person
 {
	 private String name;
	 private int age;
	 private String constituency;
	Scanner sc;
	 Person() //constructor
	 {
		 System.out.println("Voter Eligibility App");
		 age = 0;
		 name ="";
		 constituency = "noida";
		 sc = new Scanner(System.in);
	 }
	 Person(String n,int a)//parameterized constructor
	 {
		 name = n;
		 age = a;
		  constituency = "noida";
	 }
	  Person(String n,int a,String c)//parameterized constructor
	 {
		 name = n;
		 age = a;
		 constituency = c;
	 }
	public void input()
	 {
		System.out.println("Enter your name:");
		name =sc.nextLine();
		System.out.println("Enter your age : ");
		age = sc.nextInt();
	 }	
	public void print()
	 {
		 System.out.println("\t Name : \t"+name);
		 System.out.println("\t Age : \t"+age);
		 System.out.println("\t constituency : \t"+constituency);
	 }
	public  void check()
	 {
		 if(age <18){
			 System.out.println("\n Your are not eligible to vote");
		 }
		 else {
			 System.out.println("Eligible to vote");
		 }
	 }
		 
	 
 }
 class PersonTest
 {
	 public static void main(String s[])
	 {
		 Person objPerson = new Person();
		 Person objPerson1 = new Person("Raj",30);
		 Person objPerson2 = new Person("Mike",50,"Delhi");
		 
		 objPerson.input();
		 objPerson.print();
		 objPerson.check();
		 
		 objPerson1.print();
		objPerson1.check();
		
		objPerson2.print();
		objPerson2.check();
		
	 }
 }