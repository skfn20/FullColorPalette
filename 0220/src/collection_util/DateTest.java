package collection_util;

import java.util.Calendar;
import java.util.Date;

public class DateTest {
	public static void main(String[] args) {
		//Date 클래스 
		//문제가 있어서 대부분 사용하지 않는 기능들이 많다. 
		
		Date today = new Date();
		System.out.println(today);
		
		//호환성 때문에 제공은 하지만 곧 소멸될 것을 알려준다.
		System.out.println(today.getHours()); 
		
		//long, Date, Calendar형은 서로 호환 가능하다.
		Calendar cal = Calendar.getInstance();
		Date date = cal.getTime();
		cal.setTimeInMillis(System.currentTimeMillis());
	}
}
