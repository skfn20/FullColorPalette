package my.java.main;

public abstract class ParentClass {
	public ParentClass() {
		System.out.println("ParentClass constructor");
	}
	
	public void parentFun() {
		System.out.println("--parentFun() START --");
	}
	
	private void parentprivateFun() {
		System.out.println("--parentprivateFun() START --");
	}

}
