package Abstract;

public class Employee extends StaffMember{

	protected String socialSecurityNumber;
	protected double payRate;
	
	public Employee(String socialSecurityNumber, double payRate, String name, String address, String phone) {
		super(name, address, phone);
		this.socialSecurityNumber = socialSecurityNumber;
		this.payRate = payRate;
	}
	
	@Override
	public String toString() {
		return "Employee [ name= " + name +", address= " + address +", phone= " + phone +", socialSecurityNumber= " + socialSecurityNumber + ", payRate= " + payRate + "]";
	}

	public double pay() {
		return 1200;
	}

}
