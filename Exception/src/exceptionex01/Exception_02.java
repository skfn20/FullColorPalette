package exceptionex01;

public class Exception_02 {
	
	//try-catch()
	void arrayIndex() {
		try {
			int[] num = new int[2];
			num[0] = 10;
			num[1] = 20;
			num[2] = 30;
		}catch(ArrayIndexOutOfBoundsException e) {
			System.out.println("인덱스 접근 에러");
			System.out.println(e);
		}
	}
	
	//예외 던지기 : throws(언체크 예외)
	void arrayIndex2() throws ArrayIndexOutOfBoundsException{
		int[] num = new int[2];
		num[0] = 10;
		num[1] = 20;
		num[2] = 30;
	}
	
	
	//체크 예외 
	void arrayIndex3() throws Exception{
		int[] num = new int[2];
		num[0] = 10;
		num[1] = 20;
		num[2] = 30;
	}
	
	public static void main(String[] args) {
		Exception_02 ex = new Exception_02();
		
		//try-catch로 예외를 처리
		ex.arrayIndex();
		
		//throw된  예외를 처리
		//코드의 간결성을 위하여 throw를 사용해준다.
		//method에서는 최대한 가독성이 좋게 기능을 구현해주고 호출하는 메서드에서 예외를 잡아준다. 
		try {
			ex.arrayIndex2();
		}catch(ArrayIndexOutOfBoundsException e) {
			System.out.println("인덱스 접근 에러");
			System.out.println(e);
		}
		
		//ex.arrayIndex2(); ArrayIndexOutOfBoundsException로 예외를 throw한 경우에는 에러가 생기지 않지만 
		//ex.arrayIndex3(); Exception으로 예외를 throw한 경우에는 try-catch로 감싸주지 않으면 에러가 생긴다.
		try {
			ex.arrayIndex3();
		} catch (Exception e) {
			System.out.println("에러 발생");
			e.printStackTrace();
		}
	}
}
