package Exception;

public class ExceptionOne {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			int array[] = new int[2];
//			array[0] = 78;
//			array[1] = 45;
			for (int i = 0; i < 3; i++) {
				System.out.println("Access array element array["+i+"] :" + array[i]);
			}
		} catch (ArrayIndexOutOfBoundsException e) {
			// TODO: handle exception
			System.out.println("Throw type of exception :" + e);
		}
		System.out.println("Out of block try catch.");
	}

}
