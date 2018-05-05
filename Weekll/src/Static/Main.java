package Static;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Sheep vava = new Sheep(1);
		Sheep kaka = new Sheep(2);
		Sheep jaja = new Sheep(3);
		Sheep lala = new Sheep(4);
		
		System.out.println("cout sheep total is :"+ Sheep.countAll());
		System.out.println("vava is now in pen :" + vava.Find());
		System.out.println("Now move vava to pen 4:");
		vava.moveTo(4);
		System.out.println("Now vava in pen : " + vava.Find());
	}

}
