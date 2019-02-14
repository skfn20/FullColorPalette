package classex01;
//inner class
class OuterClass2{
	int			a = 10;
	static int	b = 20;
	
	class InnerClass{ //instance inner class
		int c = 5;
		void innerMethod() {
			System.out.println("inner Class");
		}
	}
	
	static class StaticInner{
		int d = 6;
		static int e = 7;
		public static void staticMethod() {
			System.out.println("Static Inner Class");
		}
	}
	
}
public class Ex21_2_inner {
	public static void main(String[] args) {
		//�ν��Ͻ� ����
		OuterClass2 oc = new OuterClass2();
		System.out.println("oc�� a��  : " + oc.a);
		System.out.println(OuterClass2.b);
		
		
		//inner Ŭ���� ����
		OuterClass2.InnerClass ic = oc.new InnerClass();
		System.out.println("Inner�� c�� : " + ic.c);
		ic.innerMethod();
		
		//static inner Ŭ���� ���� 
		OuterClass2.StaticInner os = new OuterClass2.StaticInner();
		System.out.println("Static inner d�� : " + os.d);
		System.out.println(OuterClass2.StaticInner.e);
		OuterClass2.StaticInner.staticMethod();
	}
}
