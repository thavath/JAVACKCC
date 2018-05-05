package Abstract;

public class Hourly extends Employee{
	private int hoursWorked;

	public Hourly(String socialSecurityNumber, double payRate, String name, String address, String phone, int hoursWorked) {
		super(socialSecurityNumber, payRate, name, address, phone);
		this.hoursWorked = hoursWorked;
	}

	public int getHoursWorked() {
		return this.hoursWorked;
	}

	public void setHoursWorked(int hoursWorked) {
		this.hoursWorked = hoursWorked;
	}
	
	public void addHours(int moreHours) {
		hoursWorked += moreHours;
	}

	public double pay() {
		double total = super.pay() + ( hoursWorked * payRate); 
		return total;
	}

	@Override
	public String toString() {
		return "Employee [ name=" + name +", address=" + address +", phone=" + phone +", socialSecurityNumber=" + socialSecurityNumber + ", payRate=" + payRate + ", hoursWorked=" + hoursWorked + "]";
	}
	
}
