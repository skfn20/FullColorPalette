package anonymousex;
// 익명 클래스 : 한 번만 사용하고 싶을 때 사용하면 좋다. 

class Dog{
	private String state = "걸을 수 있다.";

	public String getState() {
		return state;
	}
}

/*
class HurtDog extends Dog{
	//필드 : hidding 처리
	private String state = "걸을 수 없다.";
	
	//메소드는 overriding
	public String getState() {
		return state;
	}
}
*/

public class AnnoymousTest {
	public static void main(String[] args) {
		
		//일반적인 인스턴스 생성
		//Dog d = new HurtDog();
		//System.out.println(d.getState());
		
		//익명 클래스
		//1회성으로 쓰고자 할 때 사용한다. 
		Dog d = new Dog() {
			private String state = "걸을 수 없다.";
			public String getState() {
				return state;
			}
			void test() {//만들어져도 접근할 수 없다. 왜냐하면 부모형으로 인스턴스를 생성하였기 때문에 접근 할 수 없다. 
				// 오버라이딩이 아니면 의미 없다. 
				System.out.println("test 작동");
			}
		};
		
		System.out.println(d.getState());
		
	}
}
