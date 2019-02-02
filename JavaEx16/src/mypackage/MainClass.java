package mypackage;

public class MainClass {

	public static void main(String[] args) {
		
		AbstractClass ex = new ClassEx(10, "java");
		
		ex.fun1();
		ex.fun2();
		System.out.println("ex.num : " + ex.num);
		System.out.println("ex.str : " + ex.str); 
	}
}
