package mypackage;

public class InterfaceClass implements InterfaceA, InterfaceB{

	public InterfaceClass() {
		System.out.println("InterfaceClass constructor");
	}
	@Override
	public void funA() {
		// TODO Auto-generated method stub
		System.out.println("--funA--");
		
	}
	
	@Override
	public void funB() {
		// TODO Auto-generated method stub
		System.out.println("--funB--");
	}	
}
