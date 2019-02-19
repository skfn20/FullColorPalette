package stringex;



public class StringBuilder {
	

	public static void main(String[] args) {
		//문자열 변경 가능  클래스 
		//문자열 상수는 변경 불가능
		//데이터가 다르면 새로운 문자열을 생성해서 주솟값을 새로 할당 
		String s = "java";
		System.out.println(s.hashCode());
		s = "java2";
		System.out.println(s.hashCode());
		
		// 단일 스레드에서는 StringBuilder가 유리
		// 멀티 스레드에서는 StringBuffer가 유리 
		
		//문자열 변경 가능 클래스 
		//속도가 빠르다
		//용량 안에서 기존의 데이터 수정, 삭제, 추가  용이 
		StringBuilder sb = new StringBuilder("Java");
		//문자열의 길이 + 16을 해서 할당을 해준다. 
		System.out.println("용량 : " + sb.capacity());
		StringBuilder sb2 = sb.append(" is easy");
		System.out.println("길이 : " + sb2.length());
		System.out.println("용량 : " + sb2.capacity());
		
	
		StringBuilder sb2 =new StringBuilder();
		sb2.append("One").append("Two").append("Three");
		
	}
}
