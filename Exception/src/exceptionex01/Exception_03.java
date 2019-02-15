package exceptionex01;
//예외를 발생시키기 
//체크 예외	: 항상 try-catch문 혹은 throws를 이용하여 처리해주어야한다.
//언체크 예외	: 꼭 예외 처리를 해줄 필요는 없다. 

public class Exception_03 {
	//예외를 발생시키는 메서드
	void exceptTest() throws Exception {
		throw new Exception("나의 예외");
	}
	
	//언체크 예외이므로 try-catch 혹은 throws로 넘겨주는 것이 의무가 아니다. 
	void exceptTest2() throws ArrayIndexOutOfBoundsException{
		throw new ArrayIndexOutOfBoundsException();
	}
	
	public static void main(String[] args) {
		{
			Exception e = new Exception("예외 발생");
			
			try {
				throw e;
			}catch(Exception el) {
				System.out.println("에러 발생");
				System.out.println(e.getMessage());
				el.printStackTrace();
				System.out.println();
			}
		}
		{
			Exception_03 ex = new Exception_03();
			
			try {
				ex.exceptTest();
			}catch(Exception e) {
				System.out.println(e.getMessage());
				e.printStackTrace();
				System.out.println();
			}
			
			ex.exceptTest2();
		}
	}
}
