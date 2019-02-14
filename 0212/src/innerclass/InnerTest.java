package innerclass;

class OutClass{
	private int num = 10;
	private static int sNum = 20;
	
	private InClass inClass;
	
	public OutClass() {
		inClass = new InClass();
	}
	
	class InClass{
		int inNum = 100;
		//static int sInNum = 200;
		
		void inTest() {
			System.out.println("OutClass num = " + num + 
					"(�ܺ� Ŭ������ �ν��Ͻ� ����)");
			System.out.println("OutClass sNum = " + sNum +
					"(�ܺ� Ŭ������ ���� ����)");
		}	
	}
	
	static class InstaticClass{
		int inNum = 100;
		static int sInNum = 200;
		
		void sinTest() {
			System.out.println(inNum);
			System.out.println(sInNum);
			System.out.println(sNum);
		}
		
		static void sTest() {
			System.out.println(sNum);
			System.out.println(sInNum);
		}
	}
	
	public void usingClass() {
		inClass.inTest();
	}
}

public class InnerTest {
	public static void main(String[] args) {
		OutClass outClass = new OutClass();
		System.out.println("�ܺ� Ŭ���� �̿��Ͽ� ���� Ŭ���� ��� ȣ��");
		outClass.usingClass();
		
		OutClass.InstaticClass sInClass = new OutClass.InstaticClass();
		//OutClass.InClass = OutClass.new InClass(); �ν��Ͻ� inner class
		sInClass.sinTest();
		OutClass.InstaticClass.sTest();
	}
}
