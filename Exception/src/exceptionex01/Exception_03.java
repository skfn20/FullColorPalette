package exceptionex01;
//���ܸ� �߻���Ű�� 
//üũ ����	: �׻� try-catch�� Ȥ�� throws�� �̿��Ͽ� ó�����־���Ѵ�.
//��üũ ����	: �� ���� ó���� ���� �ʿ�� ����. 

public class Exception_03 {
	//���ܸ� �߻���Ű�� �޼���
	void exceptTest() throws Exception {
		throw new Exception("���� ����");
	}
	
	//��üũ �����̹Ƿ� try-catch Ȥ�� throws�� �Ѱ��ִ� ���� �ǹ��� �ƴϴ�. 
	void exceptTest2() throws ArrayIndexOutOfBoundsException{
		throw new ArrayIndexOutOfBoundsException();
	}
	
	public static void main(String[] args) {
		{
			Exception e = new Exception("���� �߻�");
			
			try {
				throw e;
			}catch(Exception el) {
				System.out.println("���� �߻�");
				System.out.println(e.getMessage());
				el.printStackTrace();
				System.out.println();
			}
		}
		{
			Exception_03 ex = new Exception_03();
			
			try {
				ex.exceptTest();
			}catch(Exception e) {
				System.out.println(e.getMessage());
				e.printStackTrace();
				System.out.println();
			}
			
			ex.exceptTest2();
		}
	}
}
