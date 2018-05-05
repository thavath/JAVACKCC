package ExerciseInterface;

public class CommissionEmployee extends Employee{

	public CommissionEmployee(String firstName, String lastName, String socialSecurityNumber, double grossSales, double commissionRate) {
		super(firstName, lastName, socialSecurityNumber);
		this.grossSales = grossSales;
		this.commissionRate = commissionRate;
	}

	private double grossSales;
	private double commissionRate;
	
	public double getGrossSales() {
		return grossSales;
	}

	public void setGrossSales(double grossSales) {
		this.grossSales = grossSales;
	}

	public double getCommissionRate() {
		return commissionRate;
	}

	public void setCommissionRate(double commissionRate) {
		this.commissionRate = commissionRate;
	}

	@Override
	public String toString() {
		return "CommissionEmployee [grossSales = " + grossSales + ", commissionRate = " + commissionRate + "]";
	}

	@Override
	public double getPaymentAmount() {
		return commissionRate * grossSales;
	}

}
