package OOP;

public class Student {
	private int ID;
	private String Name;
	private int Age;
	private String Address;
	
	public Student() {
		ID = 0;
		Name = "unknow";
		Age = 0;
		Address = "not available";
	}
	
	public Student(String Name, int Age) {
		this.Name = Name;
		this.Age = Age;
	}
	
	public Student(String Name, int Age, String Address) {
		this.Name = Name;
		this.Age  = Age;
		this.Address = Address;
	}
	
	public Student(int ID, String Name, int Age, String Address) {
		
		this.ID = ID;
		this.Name = Name;
		this.Age  = Age;
		this.Address = Address;
	}
	
	public void setInfo(String Name, int Age) {
		this.Name = Name;
		this.Age = Age;
	}
	
	public void setInfo(String Name, int Age, String Address) {
		this.Name = Name;
		this.Age  = Age;
		this.Address = Address;
	}
	
	public void setInfo(int ID, String Name, int Age, String Address) {
		this.ID = ID;
		this.Name = Name;
		this.Age  = Age;
		this.Address = Address;
	}
	
	public String getAddress() {
		return Address;
	}
	
	public void setAddress(String Address) {
		this.Address = Address;
	}
	
	public String getName() {
		return this.Name;
	}
	
	public void setName(String Name) {
		this.Name = Name;
	}
	
	public int getAge() {
		return this.Age;
	}
	
	public void setAge(int Age) {
		this.Age = Age;
	}
	public int getID() {
		return this.ID;
	}
	public void setID(int ID) {
		this.ID = ID;
	}
}
