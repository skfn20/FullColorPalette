package collection_util;

import java.util.Calendar;
import java.util.Date;

public class DateTest {
	public static void main(String[] args) {
		//Date Ŭ���� 
		//������ �־ ��κ� ������� �ʴ� ��ɵ��� ����. 
		
		Date today = new Date();
		System.out.println(today);
		
		//ȣȯ�� ������ ������ ������ �� �Ҹ�� ���� �˷��ش�.
		System.out.println(today.getHours()); 
		
		//long, Date, Calendar���� ���� ȣȯ �����ϴ�.
		Calendar cal = Calendar.getInstance();
		Date date = cal.getTime();
		cal.setTimeInMillis(System.currentTimeMillis());
	}
}
