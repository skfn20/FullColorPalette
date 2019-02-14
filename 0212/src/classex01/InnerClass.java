package classex01;
//���� Ŭ���� 

class OuterClass{
	//���� ������ : public(��𿡼��� ��밡���ϴ�), default(���� ��Ű�� �������� ������ ����), protected, private 
	//inner class�� ���ó�� ����� �ǹǷ� protected�� private�� �ٿ��� ����� �� �ִ�.
	//abstract
	//Ŭ���� ��� : static
	//������ : final
	static int num = 10; //Ŭ���� ����
	
	//static class
	static class StaticInner{}
	StaticInner si = new StaticInner(); //�ν��Ͻ� ���� 
	static StaticInner si2 = new StaticInner(); //Ŭ���� ����
	
	//instance class
	class InstanceInner{}
	InstanceInner ii = new InstanceInner(); //�ν��Ͻ� ����
	
	// instance������ static�� ������ �� ������ static������ instance�� ������ �� ����.
	// instance�� �����Ǹ鼭 heap�� �������� �Ҵ�ǰ� static�� memory�� �������� instance���� ���� �����Ǿ�
	// instance�� ������ �� ���� �����̴�. 
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
