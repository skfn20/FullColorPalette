
public class MainClass {

	public static void main(String[] args) {
		
		int[] Arr = {1, 2, 3, 4};
		ObjectClass obj = new ObjectClass("Solo", Arr);
		
		System.out.println("obj : " + obj.name);
		
		
		
		System.gc();
		
	}
}
