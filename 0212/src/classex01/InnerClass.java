package classex01;
//내부 클래스 

class OuterClass{
	//접근 제어자 : public(어디에서나 사용가능하다), default(같은 패키지 내에서만 생성이 가능), protected, private 
	//inner class는 멤버처럼 사용이 되므로 protected와 private를 붙여서 사용할 수 있다.
	//abstract
	//클래스 멤버 : static
	//종결자 : final
	static int num = 10; //클래스 변수
	
	//static class
	static class StaticInner{}
	StaticInner si = new StaticInner(); //인스턴스 변수 
	static StaticInner si2 = new StaticInner(); //클래스 변수
	
	//instance class
	class InstanceInner{}
	InstanceInner ii = new InstanceInner(); //인스턴스 변수
	
	// instance에서는 static을 참조할 수 있지만 static에서는 instance를 참조할 수 없다.
	// instance는 생성되면서 heap에 동적으로 할당되고 static은 memory상에 정적으로 instance보다 먼저 생성되어
	// instance를 참조할 수 없기 때문이다. 
	static void method() {
		//local inner class
		class LocalInner{}
		LocalInner li = new LocalInner();
		
		//static inner class
		StaticInner si = new StaticInner();
		
		//intance inner class
		// InstanceInner ii = new InstanceInner();
	}
	
}
public class InnerClass {
	public static void main(String[] args) {
		//instance build
		
		OuterClass oc = new OuterClass();
		System.out.println(oc.num);
		System.out.println(OuterClass.num);
		oc.method();
		
		OuterClass.method();
	}
}
