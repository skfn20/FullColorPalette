package exceptionex;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class Exception1 {
	public static void main(String[] args) {
		// ����ó��
		// 0���� ������ ���
		int a = 10, b = 0;
		try {   
			int c = a / b;
			System.out.println(c);
		}catch(Exception e) {
			System.out.println("���� �߻�");
		}
		
		System.out.println("���α׷� ��");
		
		int[] arr = new int[5];
		
		try {
			for(int i = 0; i <= 5; i++) {
				arr[i] = i;
				System.out.println(arr[i]);
			}
		}catch(ArrayIndexOutOfBoundsException e) {
			System.out.println(e);
			System.out.println("���� ó�� �κ�");
		}
	}
}
