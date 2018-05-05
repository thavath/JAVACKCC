package Static;

public class Sheep {
	int penNumber;
	static int totalSheep = 0;
	public Sheep(int n) {
		// TODO Auto-generated constructor stub
		penNumber = n;
		totalSheep ++;
	}
	
	public int Find() {
		return penNumber;
	}
	
	public void moveTo (int differentPen) {
		penNumber = differentPen;
	}
	
	public static int countAll() {
	
		return totalSheep;
	}
}
