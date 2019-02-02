package mypackage;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;

public class MyClass {

	public static void main(String[] args) {
		int i;
		int j;
		ArrayList<String> list = null;
		int[] iArr = {0, 1, 2, 3, 4};
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Exception Before");
		
		try {
			System.out.println("input i : ");
			i = scanner.nextInt();
			System.out.println("input j : ");
			j = scanner.nextInt();
			System.out.println("i/j " + (i/j));
			
			for(int k=0; k<5; k++) {
				System.out.println("iArr[" + k +"] : " + iArr[k]);
			}
			
			System.out.println("list.size() : " +  list.size());
		}catch(InputMismatchException e) {
			e.printStackTrace();
		}catch(ArrayIndexOutOfBoundsException e) {
			e.printStackTrace();
		}catch(Exception e) {
			e.printStackTrace();
			String msg = e.getMessage();
			System.out.println("msg: " + msg);
		}finally {
			System.out.println("예외가 발생해도 항상 실행10");
		}
		
		scanner.close();
		System.out.println("Exceiption After");
	}
}
