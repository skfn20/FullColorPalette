package exceptionex;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class ExceptionHandling2 {
	public static void main(String[] args) {
	
		FileInputStream fis = null;
		
		try {
			fis = new FileInputStream("a.txt");
			if(fis != null) {
				try {
					fis.close();
				}catch(IOException e) {
					e.printStackTrace();
				}
			}
		}catch(FIleNotFoundException e) {
			System.out.println(e);
		}
		System.out.println("여기도 수행 가능");
		
		
	}
}
