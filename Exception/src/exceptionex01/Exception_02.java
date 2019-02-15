package exceptionex01;

public class Exception_02 {
	
	//try-catch()
	void arrayIndex() {
		try {
			int[] num = new int[2];
			num[0] = 10;
			num[1] = 20;
			num[2] = 30;
		}catch(ArrayIndexOutOfBoundsException e) {
			System.out.println("�ε��� ���� ����");
			System.out.println(e);
		}
	}
	
	//���� ������ : throws(��üũ ����)
	void arrayIndex2() throws ArrayIndexOutOfBoundsException{
		int[] num = new int[2];
		num[0] = 10;
		num[1] = 20;
		num[2] = 30;
	}
	
	
	//üũ ���� 
	void arrayIndex3() throws Exception{
		int[] num = new int[2];
		num[0] = 10;
		num[1] = 20;
		num[2] = 30;
	}
	
	public static void main(String[] args) {
		Exception_02 ex = new Exception_02();
		
		//try-catch�� ���ܸ� ó��
		ex.arrayIndex();
		
		//throw��  ���ܸ� ó��
		//�ڵ��� ���Ἲ�� ���Ͽ� throw�� ������ش�.
		//method������ �ִ��� �������� ���� ����� �������ְ� ȣ���ϴ� �޼��忡�� ���ܸ� ����ش�. 
		try {
			ex.arrayIndex2();
		}catch(ArrayIndexOutOfBoundsException e) {
			System.out.println("�ε��� ���� ����");
			System.out.println(e);
		}
		
		//ex.arrayIndex2(); ArrayIndexOutOfBoundsException�� ���ܸ� throw�� ��쿡�� ������ ������ ������ 
		//ex.arrayIndex3(); Exception���� ���ܸ� throw�� ��쿡�� try-catch�� �������� ������ ������ �����.
		try {
			ex.arrayIndex3();
		} catch (Exception e) {
			System.out.println("���� �߻�");
			e.printStackTrace();
		}
	}
}
