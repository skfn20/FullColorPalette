package collection_util;

import java.util.Arrays;
import java.util.StringTokenizer;

public class StringTokenizerTest {
	public static void main(String[] args) {
		//token : 잘게 잘린 문자열 
		//문자열을 구분자로 구분 
		//문자열을 잘게 쪼개는 기능
		
		//String.split()
		String s = "Java, Python, C++";
		String[] splitted = s.split(", ");
		
		System.out.println(Arrays.toString(splitted));
		
		StringTokenizer st = new StringTokenizer(s, ", ");
		System.out.println(st.nextToken());
		System.out.println(st.nextToken());
		System.out.println(st.nextToken());
		
		//st.hasMoreTokens() -> 나누어진 문자열이 더 있는지 확인 
		while(st.hasMoreTokens()) {
			System.out.println(st.nextToken());
		}
		
		//여러 개의 구분자 
		//공백을 제외하고 싶으면 공백도 토큰의 구분자로 사용될 수 있다. 
		String d = "1 + 2 - 3 * 4 / 5";
		StringTokenizer st2 = new StringTokenizer(d, "+-*/ ");
		while(st2.hasMoreTokens()) {
			System.out.print(st2.nextToken() + " ");
		}
		
		//구분자도 토큰으로 포함
		//StringTokenizer st2 = new StringTokenizer(d, "+-*/ ", true);
		//구분자도 같이 출력된다. 
	}
}
