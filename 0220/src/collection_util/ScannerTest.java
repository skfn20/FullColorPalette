package collection_util;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class ScannerTest {
	public static void main(String[] args) {
		//��ĳ�� Ŭ���� : ������ �о���� 
		//(1)����ڰ� Ű����� �Է��� �� �о����
		Scanner sc = new Scanner(System.in);
		String s = sc.nextLine();
		System.out.println(s);
		
		//(2)���Ϸκ��� �о���� 
		try {
			Scanner sc2 = new Scanner(new File("./txtfile/sample.txt"));
			while(sc2.hasNextLine()) {
				System.out.println(sc2.nextLine());
			}
		} catch (FileNotFoundException e) {
			System.out.println("������ �����ϴ�.");
			e.printStackTrace();
		}
		
		//(3)���ڿ� �о����
		String s2 = "Hello\nHi\nBye";
		Scanner sc3 = new Scanner(s2);
		while(sc3.hasNextLine()) {
			System.out.println(sc3.nextLine());
		}
		
		//Readable�� ��� ���� ��� Ŭ������ ����� �� �ִ�. 
		//Ctrl + t�� ��� ���� Ȯ�� 
	}
}
