import java.util.Scanner;

public class MainClass {
	public static void main(String[] args) {
		int num1 = 10;
		int num2 = 20;
		
		if(num1 < num2) {
			System.out.println("num1�� num2���� �۴�.");
		}
		
		System.out.println();
		
		if(num1 < num2) {
			System.out.println("num1��  num2���� �۴�.");
		}
		else {
			System.out.println("num1�� num2���� ũ�ų� ����");
		}
		
	
		
		String message;
		Scanner scan = new Scanner(System.in);
		
		System.out.println("�޼����� �Է��ϼ��� : ");
		
		message = scan.nextLine();
		
		System.out.println("�Է� �޼��� : \'" + message + "\'");
		
		int kilometer;
		double liter, mpg;
		
		System.out.println("�Ÿ�(km) �� ������ �Է��ϼ��� : ");
		
		kilometer = scan.nextInt();
		
		System.out.println("���� ���� �Է��ϼ��� : ");
		
		liter = scan.nextDouble();
		
		mpg = kilometer / liter;
		
		System.out.println("Kilometer per liter : " + mpg);
		
		scan.close();
	}
	

}
