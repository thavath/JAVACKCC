package Encapslulation;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("========Student=======");
		Student student = new Student("IT",2018,120.50,"Thavath","PP");
		System.out.println("Name: "+ student.getName() +" Program :"+ student.getProgram()+" Year :"
		+ student.getYear()+" Fee :"+ student.getFee()+ " Address :"+ student.getAddress());
		System.out.println(student.toString());
		System.out.println("========Staff=========");
		Staff staff = new Staff("RUPP",1200,"Daravitu","Phnom Penh");
		System.out.println("Name: "+ staff.getName() +" Pay :"+ staff.getPay()
		+" School :"+ staff.getSchool() + " Address :"+ student.getAddress());
		System.out.println(staff.toString());
	}

}
