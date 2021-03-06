package ExerciseInterface;

public class BasePlusCommissionEmployee extends CommissionEmployee implements Payable{
	
	private double baseSalary;
	
	public BasePlusCommissionEmployee(String firstName, String lastName, String socialSecurityNumber, double grossSales,
			double commissionRate, double baseSalary) {
		super(firstName, lastName, socialSecurityNumber, grossSales, commissionRate);
		this.baseSalary = baseSalary;
	}

	public double getBaseSalary() {
		return baseSalary;
	}

	public void setBaseSalary(double baseSalary) {
		this.baseSalary = baseSalary;
	}
	
	public double getPaymentAmount() {
		return baseSalary;
	}

	@Override
	public String toString() {
		return "BasePlusCommissionEmployee [baseSalary = " + baseSalary + ", getBaseSalary() = " + getBaseSalary()
				+ ", getPaymentAmount() = " + getPaymentAmount() + "]";
	}
	
	
}
