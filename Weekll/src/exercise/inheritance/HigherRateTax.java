package exercise.inheritance;
import exercise.methodoverloading.BasicRateTax;

public class HigherRateTax extends BasicRateTax{
	public double calcTax(double grossIncome) {	
		if(grossIncome<=34000) {
			return grossIncome*0.20;
		}else if(grossIncome<150000) {
			return grossIncome*0.40;
		}else {
			return grossIncome*0.50;
		} 
	}
}
