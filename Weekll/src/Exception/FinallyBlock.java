package Exception;

public class FinallyBlock {

	public FinallyBlock() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[] = new int[2];
		try {
			System.out.println("access element of array [3]"+a[3]);
		} catch (ArrayIndexOutOfBoundsException e) {
			// TODO: handle exception
			System.out.println("Exception throw :" + e);
		} finally {
			// TODO: handle finally clause
			a[0] = 6;
			System.out.println("First element of array has value is :"+ a[0]);
			System.out.println("The finally block is executed.");
		}
	}

}
