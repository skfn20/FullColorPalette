package exception_example;

public class CarTest {
	public static void main(String[] args) {
		Car myCar = null;
		
		myCar = new Car("Bugati", 90);
		
		
		while(myCar.getSpeed() < 120) {
			myCar.speedUp();
		}
	
		System.out.println(myCar.getSpeed());
	
		
		
	}
}
