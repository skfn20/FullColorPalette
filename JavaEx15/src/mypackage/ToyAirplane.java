package mypackage;

public class ToyAirplane implements Toy{
	public ToyAirplane() {
		System.out.println("Toy Airplane");
	}
	@Override
	public void walk() {
		// TODO Auto-generated method stub
		System.out.println("Airplane walk");
		
	}

	@Override
	public void run() {
		// TODO Auto-generated method stub
		System.out.println("Airplane run");
	}

	@Override
	public void alarm() {
		// TODO Auto-generated method stub
		System.out.println("Airplane alarm");
	}

	@Override
	public void light() {
		// TODO Auto-generated method stub
		System.out.println("Airplane light");
	}

	
}
