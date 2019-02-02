package mypackage;

public class OuterClass {
	int num = 10;
	String str1 = "java";
	static String str2 = "world";
	public OuterClass() {
		System.out.println("OuterClass constructor");
	}
	
	class InnerClass{
		int num = 100;
		String str2 = str1;
		
		public InnerClass() {
			System.out.println("InnerClass constuctor");
		}
	}
	
	static class SinnerClass{
		int num=1000;
		String str3 = str2;
		
		public SinnerClass() {
			System.out.println("SinnerClass constructor");
		}
	}
}
