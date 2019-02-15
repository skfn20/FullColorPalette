package exceptionex02;

public class ThrowsTest {
	
	//예외 넘기기 
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
			System.out.println("메인에서 예외 발생");
			e.printStackTrace();
		}
	}
}
