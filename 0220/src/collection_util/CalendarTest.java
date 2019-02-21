package collection_util;

import java.util.Calendar;
import java.util.GregorianCalendar;

public class CalendarTest {
	public static void main(String[] args) {
		//java.lang ��Ű�� : currentTimeMillis()
		//���� �ð��� long type���� ��ȯ 
		//1970/01/01�� �������� ������� �ð��� ������ 
		
		//a�� 10000�� �����ϴµ� �ɸ��� �ð��� üũ 
		System.out.println("���� : " + System.currentTimeMillis());
		
		int a = 0;
		for(int i = 0 ; i < 10000; i++) {
			a++;
		}
		
		System.out.println("�� : " + System.currentTimeMillis());

		// calendar Ŭ���� : ��¥ / �ð� ���� ��� ����
		// �ν��Ͻ��� �������� ���ϴ� �߻� Ŭ���� 
		
		Calendar cal = Calendar.getInstance();
		System.out.println(cal.get(cal.YEAR));
		System.out.println(cal.get(cal.SECOND));
		System.out.println(cal.get(cal.DAY_OF_WEEK)); // 1�� �Ͽ���
		
		//�׷����� �ν��Ͻ� ���� 
		Calendar cal2 = new GregorianCalendar();
		
		//��¥, �ð� �ٲٱ� -> �̿��ؼ� ��¥ ���� ���̸� ���� �� �ִ�. 
		Calendar cal3 = Calendar.getInstance();
		cal3.set(Calendar.DATE, 10);
		System.out.println(cal3.get(cal3.DATE));
			

	}
}
