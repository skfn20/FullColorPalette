
public class MainClass {
	public static void main(String[] args) {
		Grandeur myCar1 = new Grandeur("red", "auto", 30000);
				
		myCar1.run();
		myCar1.stop();
		myCar1.info();
		
		myCar1.Color="Blue";
		
		myCar1.info();
		
		System.out.println();
				
	}
}
