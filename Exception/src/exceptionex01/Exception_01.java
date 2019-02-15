package exceptionex01;

import java.util.InputMismatchException;
import java.util.Scanner;

//예외 처리
//예외가 발생하면 JVM이 해당 예외 객체의 인스턴스를 생성하여 해당하는 catch()에 넘겨준다.


public class Exception_01 {
	public static void main(String[] args) {
		{
			//0으로 나눈 경우
			int a = 10, b =0;
			try {
				int c = a/b;
				System.out.println(c);
			}catch(ArithmeticException e) { 
				// Object -> Throwable -> Exception -> RuntimeException -> ArithmeticException
				e.printStackTrace();
				System.out.println(e.toString());
				System.out.println(e);
				//예외가 발생 시 실행할 문장
				System.out.println("0으로 나눌 수 없습니다.");
			}
			System.out.println("여기도 작동");
		}
		{ 
			// 두 가지 이상의 예외가 발생했을 때
			int b = 10;
			Scanner sc = new Scanner(System.in);
			System.out.print("나눌 정수를 입력하시오 : ");
			
			int a;
			
			//try catch문에서 catch문을 여러 번 사용할 때 catch에 하위 클래스에 있는 예외부터 catch를 잡아줘야한다.
			//자식 -> 부모 순으로 (왜냐하면 부모를 먼저 사용하면 세부적인 오류는 확인 할 수 없기 때문이다.)
			try {
				a = sc.nextInt();
				int c = b /a;
				System.out.println("결과 : " + c);
			}catch(InputMismatchException e) {
				System.out.println("정수를 입력하세요");
				System.out.println(e.toString());
			}catch(ArithmeticException e) {
				System.out.println("0으로 나눌 수 없습니다.");
				//에러 메세지를 출력하는 방법들
				System.out.println("e.getMessage() : " + e.getMessage());	//어떤 에러가 발생했는지
				System.out.println(e.toString());							//어떤 예외클래스에서 어떤 에러가 발생했는지
				e.printStackTrace();										//구체적으로 어디서 발생했는지까지 알 수 있다.
			}catch(Exception e) { 
				System.out.println("에러 발생");
				e.printStackTrace();
			}
		}
		{ 
			// try-catch-finally 
			int a = 10, b =0;
			try {
				int c = a/b;
				System.out.println(c);
			}catch(ArithmeticException e) { 
				// Object -> Throwable -> Exception -> RuntimeException -> ArithmeticException
				e.printStackTrace();
				System.out.println(e.toString());
				System.out.println(e);
				//예외가 발생 시 실행할 문장
				System.out.println("0으로 나눌 수 없습니다.");
			}finally {
				//예외가 발생 여부와 상관 없이 항상 실행된다.
				//파일 입출력, 외부 장치와의 연동 시 사후작업에 사용한다.
				System.out.println("프로그램 종료");
			}
		} 
		
	}
}
