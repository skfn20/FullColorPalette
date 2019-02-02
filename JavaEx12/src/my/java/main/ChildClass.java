package my.java.main;

public class ChildClass extends ParentClass{
	
	int openYear = 2000;
	
	public ChildClass() {
		System.out.println("ChildClass constructor");
	}
	public void make() {
		System.out.println("--make more delicious--");
		System.out.println("ChildClass.openYear : " + this.openYear);
		System.out.println("ParentClass.openYear : " + super.openYear);
	}
}
