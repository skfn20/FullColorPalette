package collection_util;

import java.util.Calendar;
import java.util.GregorianCalendar;

public class CalendarTest {
	public static void main(String[] args) {
		//java.lang 패키지 : currentTimeMillis()
		//현재 시간을 long type으로 반환 
		//1970/01/01을 기준으로 현재까지 시간을 보여줌 
		
		//a를 10000번 증가하는데 걸리는 시간을 체크 
		System.out.println("시작 : " + System.currentTimeMillis());
		
		int a = 0;
		for(int i = 0 ; i < 10000; i++) {
			a++;
		}
		
		System.out.println("끝 : " + System.currentTimeMillis());

		// calendar 클래스 : 날짜 / 시간 관련 기능 제공
		// 인스턴스를 생성하지 못하는 추상 클래스 
		
		Calendar cal = Calendar.getInstance();
		System.out.println(cal.get(cal.YEAR));
		System.out.println(cal.get(cal.SECOND));
		System.out.println(cal.get(cal.DAY_OF_WEEK)); // 1은 일요일
		
		//그레고리력 인스턴스 생성 
		Calendar cal2 = new GregorianCalendar();
		
		//날짜, 시간 바꾸기 -> 이용해서 날짜 간의 차이를 구할 수 있다. 
		Calendar cal3 = Calendar.getInstance();
		cal3.set(Calendar.DATE, 10);
		System.out.println(cal3.get(cal3.DATE));
			

	}
}
