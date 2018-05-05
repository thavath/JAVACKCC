package OOP;

public class MainStudent {
	public static void main(String[] args) {
		
		Student[] students = new Student[5];
		
		students[0]= new Student(); 
		students[0].setInfo(1,"Thavath", 19, "Phnom Penh");
		
		students[1]= new Student();
		students[1].setInfo("Daraka", 21, "Beng Kok");
		
		students[2]= new Student();
		students[2].setInfo("Vannida", 22);
		
		students[3]= new Student();
		students[3].setInfo("Daravika", 23);
		
		students[4]= new Student();
		students[4].setID(5);
		
		for (int i = 0; i < students.length; i++) {
			System.out.println("ID :"+students[i].getID()+"\nName :"+students[i].getName()+
					"\nAddress :"+students[i].getAddress() + "\nAge :"+students[i].getAge());
		}
		
	}
}
