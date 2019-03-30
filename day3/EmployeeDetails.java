 class Employee
 {
	 //declaring variables
	 protected String name;
	 protected int empId;
	 protected String address;
	 protected String department;
	 protected String designation;
	 
	 Employee() // default constructor
	 {
		
	 }
	 Employee(final String n,final int id,final String addr,final String dept,final String desg)
	 { 
		//inisializing variables
		 name = n;
		 empId = id;
		 address = addr;
		 department = dept;
		 designation = desg;
	 }
	 void display()
	 {
		 System.out.println("NAME OF EMPLOYEE : "+name);
		 System.out.println("EMPLOYEE ID : "+empId);
		 System.out.println("EMPLOYEE ADDRESS : "+address);
		  System.out.println("EMPLOYEE DEPARTMENT : "+department);
		  System.out.println("DESINATION : "+designation); 
	 }
 }
 class Manager extends Employee
 {
	 protected String skills;
	 
	 Manager()
	 {
		 
	 }
	 Manager(final String n,final int id,final String addr,final String dept,
	 final String desg,final String s)
	 {
		super(n,id,addr,dept,desg);   
		 skills = s;
	 }
	 void display()
	 {
		 super.display();
		 System.out.println("CURRENT PROJECT : "+skills);
	 }
 }
 class Developer extends Employee
 {
	 Developer()
	 {
		 
	 }
     Developer(final String n,final int id,final String addr,final String dept,
	 final String desg){
	 super(n,id,addr,dept,desg);
	 }
 }
 class EmployeeDetails
 {
	 public static void main(String []agrs)
	 {
		 Manager manObj = new Manager("ABC",123,"XYZ","HR","MANAGER","JAVA");
		 manObj.display();
		 Developer devObj = new Developer("AABBCC",345,"XXYYZZ","NETWORKING","TESTER");
		 devObj.display();
	 
	 }
	 
 }
 