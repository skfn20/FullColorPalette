package exceptionex;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class Exception1 {
	public static void main(String[] args) {
		// 예외처리
		// 0으로 나누는 경우
		int a = 10, b = 0;
		try {   
			int c = a / b;
			System.out.println(c);
		}catch(Exception e) {
			System.out.println("예외 발생");
		}
		
		System.out.println("프로그램 끝");
		
		int[] arr = new int[5];
		
		try {
			for(int i = 0; i <= 5; i++) {
				arr[i] = i;
				System.out.println(arr[i]);
			}
		}catch(ArrayIndexOutOfBoundsException e) {
			System.out.println(e);
			System.out.println("예외 처리 부분");
		}
	}
}
