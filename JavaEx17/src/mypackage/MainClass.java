package mypackage;

public class MainClass {

	public static void main(String[] args) {
		Interface1 li1 = (String s1, String s2, String s3) -> 
		{System.out.println(s1+ " " + s2 + " " + s3);};
		
		li1.method("Hello", "java", "World");
		
		li1=(String s1, String s2, String s3) -> 
		{
			System.out.println("HI" + s1 + " " + s2 + " " + s3);
		};
		
		li1.method("this", "outr", "thiog");
		
	}
	
}
