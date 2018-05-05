package Exception;

public class InsufficientFundsException extends Exception {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private double amount;
	public InsufficientFundsException(double amount) {
		// TODO Auto-generated constructor stub
		this.amount = amount;
	}
	public double getAmount() {
		return amount;
	}
}
