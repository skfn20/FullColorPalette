package stringex;



public class StringBuilder {
	

	public static void main(String[] args) {
		//���ڿ� ���� ����  Ŭ���� 
		//���ڿ� ����� ���� �Ұ���
		//�����Ͱ� �ٸ��� ���ο� ���ڿ��� �����ؼ� �ּڰ��� ���� �Ҵ� 
		String s = "java";
		System.out.println(s.hashCode());
		s = "java2";
		System.out.println(s.hashCode());
		
		// ���� �����忡���� StringBuilder�� ����
		// ��Ƽ �����忡���� StringBuffer�� ���� 
		
		//���ڿ� ���� ���� Ŭ���� 
		//�ӵ��� ������
		//�뷮 �ȿ��� ������ ������ ����, ����, �߰�  ���� 
		StringBuilder sb = new StringBuilder("Java");
		//���ڿ��� ���� + 16�� �ؼ� �Ҵ��� ���ش�. 
		System.out.println("�뷮 : " + sb.capacity());
		StringBuilder sb2 = sb.append(" is easy");
		System.out.println("���� : " + sb2.length());
		System.out.println("�뷮 : " + sb2.capacity());
		
	
		StringBuilder sb2 =new StringBuilder();
		sb2.append("One").append("Two").append("Three");
		
	}
}
