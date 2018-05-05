package exercise.methodoverloading;

public class BasicRateTax {
	public static final double baseSalary = 1000;
	public static final double baseTax = 0.20;
	public double calcTax() {
		return baseSalary * baseTax;
	}
	public double calcTax(double grossIncome) {
		if(grossIncome>1000) {
			return grossIncome*baseTax;
		}
		return calcTax(); 
	}
}
