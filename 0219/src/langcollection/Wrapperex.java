package langcollection;

public class Wrapperex {
	public static void main(String[] args) {
		StringBuilder sb = new StringBuilder("Java");
		System.out.println(sb.length());
		System.out.println(sb.capacity());
		
		//wrapper class
		//기본형을 클래스로 감싸서 다양한 기능(메소드)의 
		//기능과 필드를 사용 가능하게 해줌 
		//int : Integer Class
		//문자열을 숫자로 변환하기 
		String s = "10";
		System.out.println(s + 20);
		System.out.println(Integer.parseInt(s) + 20); // parseInt는 static형으로 정의되어있다. 
		System.out.println(Integer.valueOf(s) + 20);
		Integer i = 20; //20 -> int형 => Integer형으로 자동 형 변환 
		
		//숫자를 문자열로 변환 
		System.out.println(Integer.toString(i) + 20);
		
		System.out.println(String.valueOf(1000) + 2000);
		
		//십진수를 2진수로 변환해서 문자열로 반환 
		System.out.println(Integer.toBinaryString(i));
		
		//Integer 클래스의 상수값 출력 
		System.out.println(Integer.MAX_VALUE);
		System.out.println(Integer.MIN_VALUE);
		
		//Float형
		System.out.println(Float.MAX_VALUE);
		System.out.println(Float.MIN_VALUE);
		System.out.println(Float.parseFloat(s) + 2.4);
		System.out.println(Float.valueOf("3.14"));
		
		System.out.println(Float.toString(3.14f));
		
		System.out.println(String.valueOf(3.14));
			
	}
}
