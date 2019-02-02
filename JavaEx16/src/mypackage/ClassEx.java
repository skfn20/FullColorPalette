package mypackage;

public class ClassEx extends AbstractClass{

	public ClassEx() {
		System.out.println("ClassEx constructor");
	}
	
	public ClassEx(int i, String s) {
		super(i, s);
	}

	@Override
	public void fun2() {
		// TODO Auto-generated method stub
		System.out.println("ClassEx fun2()");
	}
}
