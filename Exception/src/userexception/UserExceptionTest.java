package userexception;
//사용자 예외 만들기
//나이 체크 예외

class AgeException extends Exception{
	public AgeException(String message) {
		super(message); // 부모의 생성자
	}
}

public class UserExceptionTest {
	static void ticketing(int age) throws AgeException{
		if(age < 0) {
			throw new AgeException("나이 입력 에러");
		}
		System.out.println("티켓팅 성공");
	}
	
	public static void main(String[] args) {
		try {
			ticketing(-10);
		}catch(AgeException e) {
			System.out.println(e.getMessage());
		}
	}
}
