package Abstract;

public class Voluntear extends StaffMember{

	public Voluntear(String name, String address, String phone) {
		super(name, address, phone);
	}
	public double pay() {
		return 0;
	}
	@Override
	public String toString() {
		return "Employee [ name=" + name +", address=" + address +", phone=" + phone +"]";
	}

}
