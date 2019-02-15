package exceptionex01;

import java.util.InputMismatchException;
import java.util.Scanner;

//���� ó��
//���ܰ� �߻��ϸ� JVM�� �ش� ���� ��ü�� �ν��Ͻ��� �����Ͽ� �ش��ϴ� catch()�� �Ѱ��ش�.


public class Exception_01 {
	public static void main(String[] args) {
		{
			//0���� ���� ���
			int a = 10, b =0;
			try {
				int c = a/b;
				System.out.println(c);
			}catch(ArithmeticException e) { 
				// Object -> Throwable -> Exception -> RuntimeException -> ArithmeticException
				e.printStackTrace();
				System.out.println(e.toString());
				System.out.println(e);
				//���ܰ� �߻� �� ������ ����
				System.out.println("0���� ���� �� �����ϴ�.");
			}
			System.out.println("���⵵ �۵�");
		}
		{ 
			// �� ���� �̻��� ���ܰ� �߻����� ��
			int b = 10;
			Scanner sc = new Scanner(System.in);
			System.out.print("���� ������ �Է��Ͻÿ� : ");
			
			int a;
			
			//try catch������ catch���� ���� �� ����� �� catch�� ���� Ŭ������ �ִ� ���ܺ��� catch�� �������Ѵ�.
			//�ڽ� -> �θ� ������ (�ֳ��ϸ� �θ� ���� ����ϸ� �������� ������ Ȯ�� �� �� ���� �����̴�.)
			try {
				a = sc.nextInt();
				int c = b /a;
				System.out.println("��� : " + c);
			}catch(InputMismatchException e) {
				System.out.println("������ �Է��ϼ���");
				System.out.println(e.toString());
			}catch(ArithmeticException e) {
				System.out.println("0���� ���� �� �����ϴ�.");
				//���� �޼����� ����ϴ� �����
				System.out.println("e.getMessage() : " + e.getMessage());	//� ������ �߻��ߴ���
				System.out.println(e.toString());							//� ����Ŭ�������� � ������ �߻��ߴ���
				e.printStackTrace();										//��ü������ ��� �߻��ߴ������� �� �� �ִ�.
			}catch(Exception e) { 
				System.out.println("���� �߻�");
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
				//���ܰ� �߻� �� ������ ����
				System.out.println("0���� ���� �� �����ϴ�.");
			}finally {
				//���ܰ� �߻� ���ο� ��� ���� �׻� ����ȴ�.
				//���� �����, �ܺ� ��ġ���� ���� �� �����۾��� ����Ѵ�.
				System.out.println("���α׷� ����");
			}
		} 
		
	}
}
