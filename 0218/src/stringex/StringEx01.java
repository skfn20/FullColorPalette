package stringex;

import java.util.Arrays;

public class StringEx01 {
	public static void main(String[] args) {
		//문자열 클래스
		//인스턴스 생성
		String s = new String("Hello Java");
		String s2 = new String("Hello Java");
		
		if(s == s2) System.out.println("같다");
		else System.out.println("다르다"); 
		
		//toString이 overriding 되어있어서
		//인스턴스 안의 내용값이 같은지 비교
		if(s.equals(s2)) System.out.println("같다");
		else System.out.println("다르다");
		
		//메소드 영역(static 영역)에 상수풀이라는 공간에 생성 --> Data영역 
		//상수풀에서는 기존 문자열이 있으면 새로 만들지 않고 기존 주소를 사용 
		String m = "Java";
		String m2 = "Java";
		
		//똑같은 주소를 가지고 있기 때문에 같다 
		if(m == m2) System.out.println("같다");
		else System.out.println("다르다");
		
		System.out.println("m.hashCode : " + m.hashCode());
		System.out.println("m2.hashCode : " + m2.hashCode());
		
		if(m.equals(m2)) System.out.println("같다");
		
		//문자 연결
		String e1 = "java";
		String e2 =" is easy";
		
		System.out.println(e1.concat(e2));
		
		//문자열 잘라내기
		System.out.println(e2.substring(4));
		System.out.println(e2.substring(1, 3));
		
		//문자열 길이
		System.out.println(e2.length());
		
		//대문자로 변환
		System.out.println(e2.toUpperCase());
		
		//소문자로 변환
		System.out.println(e2.toLowerCase());
		
		//인덱스에 해당하는 글자
		System.out.println(e1.charAt(1));
		
		//문자열의 위치
		System.out.println(e1.indexOf("va"));
		
		//공백의 제거 
		System.out.println(e2.trim());
		
		//문자열의 일부분을 변경  
		//replace 
		String ex1 = "대한사람 대한으로 길이 보전하세";
		System.out.println(ex1.replace("대한", "한국"));
		
		//replaceAll
		String ex2 = "대한사람 대한으로 길이 보전하세";
		System.out.println(ex2.replaceAll("대한", "한국"));
		
		//replace와 replaceAll의 차이점
		//replaceAll은 정규식을 사용함 
		String ex3 = "abcdefghijk";
		System.out.println(ex3.replaceAll("[ac]", "김"));
		ex3 = "abcdefghijkac";
		System.out.println(ex3.replaceAll("[ac]", "김"));
		System.out.println(ex3.replaceAll("[^ac]", "김"));
		
		String ex4 = "20 + 10 = 30";
		System.out.println(ex4.replaceAll("[+]" , "-"));
		//replaceAll을 사용했을 때 []없으면 에러나는 것들
		//* : 앞문자가 없을 수 도 많을 수도 있다는 표현 
		//$ : 문자열의 종료 
		//+ : 앞 문자가 하나 이상임을 의미 
		//| : 패턴 안에서 or 연산자 
		
		String ex05 = "0abc00defg";
		System.out.println(ex05.replaceAll("[0]+", "+"));
		System.out.println(ex05.replaceAll("[ ]*", "-"));
		
		//형변환 
		//valueOf : 문자로 변환 
		int a = 100; 
		String ex06 = String.valueOf(a);
		System.out.println(ex06.length());
		
		//split 메소드 
		//문자열을 잘게 쪼갠다. 
		String ex07 ="a,b,c,d,e";
		System.out.println(s.split(","));
		String[] s1 = ex07.split(",");
		System.out.println(Arrays.toString(s1));
		
		for(String ms : s1)
			System.out.print(ms + " ");
		System.out.println();
	}
}
