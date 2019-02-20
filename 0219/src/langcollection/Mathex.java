package langcollection;

public class Mathex {
	public static void main(String[] args) {
		//수학 관련 클래스
		//필드
		System.out.println("자연 지수 : " + Math.E);
		System.out.println("파이 값 : " + Math.PI);
		
		//메소드
		System.out.println(Math.abs(-3.4));	//절대값 
		System.out.println(Math.ceil(3.5));
		System.out.println(Math.floor(3.5));
		System.out.println(Math.round(3.5));
		System.out.println(Math.log10(3)); 	//밑이 10인 로그 값
		System.out.println(Math.log(3));	//밑이 2인 로그 값 
		System.out.println(Math.pow(10, 3));
		System.out.println(Math.round(Math.random()*10) + 1);
		System.out.println(Math.sqrt(2)); //제곱근 구하기 
	}
}
