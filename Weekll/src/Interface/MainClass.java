package Interface;

public class MainClass {

	public static void main(String[] args) {
		Payable Objects[] = new Payable[4];
		Objects[0] = new Invoie("01234", "Seat", 10, 50);
		Objects[1] = new Invoie("56789", "Tire", 05, 30);
		Objects[2] = new SalaryEmployee("Thavath", "Rath", "123-456-897", 50);
		Objects[3] = new SalaryEmployee("Darava", "Sok", "234-456-678", 45);
		
		for (Payable currentPayable : Objects) {
			System.out.println("=================================================");
			System.out.println(currentPayable.toString());
			System.out.println("Total Amount is : " + currentPayable.getPaymentAmount());
		}
	}

}
