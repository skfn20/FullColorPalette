package mypackage;

public class MainClass {

	public static void main(String[] args) {
		Toy toyair = new ToyAirplane();
		Toy toycar = new ToyCar();
		
		Toy toys[] = {toyair, toycar};
		
		for(int i = 0; i<toys.length; i++) {
			toys[i].walk();
			toys[i].run();
			toys[i].alarm();
			toys[i].light();
			System.out.println();  
		}
		
	}
}
