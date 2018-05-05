package exercise.methodoverloading;
import exercise.inheritance.HigherRateTax;

public class TaxCollector {
	public static void main(String[] args) {
		BasicRateTax tax = new HigherRateTax();
		double a = tax.calcTax();
		double b = tax.calcTax(15000);
		double c = tax.calcTax(1000);
		double d = tax.calcTax(345000);
		
		System.out.println("Tax :" + a);
		System.out.println("New Tax :" + b);
		System.out.println("New Tax :" + c);
		System.out.println("New Tax :" + d);
	}
}
