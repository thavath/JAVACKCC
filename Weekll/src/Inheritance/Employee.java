package Inheritance;

public class Employee extends Person{
	
	int employeeID;
	double salary;
	String startDate;
	
	public Employee(int employeeID, double salary, String startDate,String name, String dob) {
		super(name, dob);
		this.employeeID = employeeID;
		this.salary = salary;
		this.startDate = startDate;
	}
	
	public void getPersonInfo() {
		super.getPersonInfor();
		System.out.println("He/She works as employee from " + startDate + " with salary "+ salary );
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Employee anEmployee = new Employee(1001, 300, "3/3/2018", "Thavath","4/4/1999" );
		anEmployee.getPersonInfo();
	}

}
