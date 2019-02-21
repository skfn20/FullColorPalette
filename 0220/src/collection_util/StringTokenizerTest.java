package collection_util;

import java.util.Arrays;
import java.util.StringTokenizer;

public class StringTokenizerTest {
	public static void main(String[] args) {
		//token : �߰� �߸� ���ڿ� 
		//���ڿ��� �����ڷ� ���� 
		//���ڿ��� �߰� �ɰ��� ���
		
		//String.split()
		String s = "Java, Python, C++";
		String[] splitted = s.split(", ");
		
		System.out.println(Arrays.toString(splitted));
		
		StringTokenizer st = new StringTokenizer(s, ", ");
		System.out.println(st.nextToken());
		System.out.println(st.nextToken());
		System.out.println(st.nextToken());
		
		//st.hasMoreTokens() -> �������� ���ڿ��� �� �ִ��� Ȯ�� 
		while(st.hasMoreTokens()) {
			System.out.println(st.nextToken());
		}
		
		//���� ���� ������ 
		//������ �����ϰ� ������ ���鵵 ��ū�� �����ڷ� ���� �� �ִ�. 
		String d = "1 + 2 - 3 * 4 / 5";
		StringTokenizer st2 = new StringTokenizer(d, "+-*/ ");
		while(st2.hasMoreTokens()) {
			System.out.print(st2.nextToken() + " ");
		}
		
		//�����ڵ� ��ū���� ����
		//StringTokenizer st2 = new StringTokenizer(d, "+-*/ ", true);
		//�����ڵ� ���� ��µȴ�. 
	}
}
