package anonymousex;
// �͸� Ŭ���� : �� ���� ����ϰ� ���� �� ����ϸ� ����. 

class Dog{
	private String state = "���� �� �ִ�.";

	public String getState() {
		return state;
	}
}

/*
class HurtDog extends Dog{
	//�ʵ� : hidding ó��
	private String state = "���� �� ����.";
	
	//�޼ҵ�� overriding
	public String getState() {
		return state;
	}
}
*/

public class AnnoymousTest {
	public static void main(String[] args) {
		
		//�Ϲ����� �ν��Ͻ� ����
		//Dog d = new HurtDog();
		//System.out.println(d.getState());
		
		//�͸� Ŭ����
		//1ȸ������ ������ �� �� ����Ѵ�. 
		Dog d = new Dog() {
			private String state = "���� �� ����.";
			public String getState() {
				return state;
			}
			void test() {//��������� ������ �� ����. �ֳ��ϸ� �θ������� �ν��Ͻ��� �����Ͽ��� ������ ���� �� �� ����. 
				// �������̵��� �ƴϸ� �ǹ� ����. 
				System.out.println("test �۵�");
			}
		};
		
		System.out.println(d.getState());
		
	}
}
