package collection_util;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class ScannerTest {
	public static void main(String[] args) {
		//스캐너 클래스 : 데이터 읽어오기 
		//(1)사용자가 키보드로 입력한 값 읽어오기
		Scanner sc = new Scanner(System.in);
		String s = sc.nextLine();
		System.out.println(s);
		
		//(2)파일로부터 읽어오기 
		try {
			Scanner sc2 = new Scanner(new File("./txtfile/sample.txt"));
			while(sc2.hasNextLine()) {
				System.out.println(sc2.nextLine());
			}
		} catch (FileNotFoundException e) {
			System.out.println("파일이 없습니다.");
			e.printStackTrace();
		}
		
		//(3)문자열 읽어오기
		String s2 = "Hello\nHi\nBye";
		Scanner sc3 = new Scanner(s2);
		while(sc3.hasNextLine()) {
			System.out.println(sc3.nextLine());
		}
		
		//Readable을 상속 받은 모든 클래스를 사용할 수 있다. 
		//Ctrl + t로 상속 관계 확인 
	}
}
