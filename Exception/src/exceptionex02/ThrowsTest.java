package exceptionex02;

public class ThrowsTest {
	
	//���� �ѱ�� 
	static void methodA() throws Exception{
		methodB();
	}
	
	static void methodB() throws Exception{
		methodC();
	}
	
	static void methodC() throws Exception{
		throw new Exception();
	}
	
	public static void main(String[] args) {
		try {
			methodA();
		} catch (Exception e) {
			System.out.println("���ο��� ���� �߻�");
			e.printStackTrace();
		}
	}
}
