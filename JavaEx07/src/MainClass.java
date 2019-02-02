
public class MainClass {

	public static void main(String[] args) {
		
		ObjectClass obj1 = new ObjectClass();
		ObjectClass obj2 = new ObjectClass();
		ObjectClass obj3 = new ObjectClass();
		
		System.out.println("obj1 = " + obj1);
		System.out.println("obj2 = " + obj2);
		System.out.println("obj3 = " + obj3);
		
		obj1.getInfo();
		
		obj1 = null;
		
		obj1 = new ObjectClass();
		
		System.out.println("obj1 = " + obj1);
	}
}
