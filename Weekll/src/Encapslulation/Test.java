package Encapslulation;

public class Test {
	
	String name;
	String idNum;
	int age;
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getIdNum() {
		return idNum;
	}

	public void setIdNum(String idNum) {
		this.idNum = idNum;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}
	
	public static void main(String[] args) {
		
		Test person = new Test();
		person.setAge(22);
		person.setIdNum("A901");
		person.setName("Thavath");
		System.out.println("ID = "+person.getIdNum()+" Name :"+person.getName()+" Age :"+ person.getAge());
	}

}
