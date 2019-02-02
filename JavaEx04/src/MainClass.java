import java.util.Scanner;

public class MainClass {
	public static void main(String[] args) {
		int num1 = 10;
		int num2 = 20;
		
		if(num1 < num2) {
			System.out.println("num1는 num2보다 작다.");
		}
		
		System.out.println();
		
		if(num1 < num2) {
			System.out.println("num1는  num2보다 작다.");
		}
		else {
			System.out.println("num1는 num2보다 크거나 같다");
		}
		
	
		
		String message;
		Scanner scan = new Scanner(System.in);
		
		System.out.println("메세지를 입력하세요 : ");
		
		message = scan.nextLine();
		
		System.out.println("입력 메세지 : \'" + message + "\'");
		
		int kilometer;
		double liter, mpg;
		
		System.out.println("거리(km) 값 정수를 입력하세요 : ");
		
		kilometer = scan.nextInt();
		
		System.out.println("리터 값을 입력하세요 : ");
		
		liter = scan.nextDouble();
		
		mpg = kilometer / liter;
		
		System.out.println("Kilometer per liter : " + mpg);
		
		scan.close();
	}
	

}
