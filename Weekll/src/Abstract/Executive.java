package Abstract;

public class Executive extends Employee{
	private double bonus;
	
	public Executive(String socialSecurityNumber, double payRate, String name, String address, String phone, double bonus) {
		super(socialSecurityNumber, payRate, name, address, phone);
		this.bonus = bonus;
	}
	
	public double getBonus() {
		return bonus;
	}

	public void setBonus(double bonus) {
		this.bonus = bonus;
	}

	@Override
	public String toString() {
		return "Employee [ name=" + name +", address=" + address +", phone=" + phone +", socialSecurityNumber=" + socialSecurityNumber + ", payRate=" + payRate + ",  bonus=" + bonus + "]";
	}

	public double pay() {
		return this.bonus + super.pay();
	}
}
