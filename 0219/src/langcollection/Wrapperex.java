package langcollection;

public class Wrapperex {
	public static void main(String[] args) {
		StringBuilder sb = new StringBuilder("Java");
		System.out.println(sb.length());
		System.out.println(sb.capacity());
		
		//wrapper class
		//�⺻���� Ŭ������ ���μ� �پ��� ���(�޼ҵ�)�� 
		//��ɰ� �ʵ带 ��� �����ϰ� ���� 
		//int : Integer Class
		//���ڿ��� ���ڷ� ��ȯ�ϱ� 
		String s = "10";
		System.out.println(s + 20);
		System.out.println(Integer.parseInt(s) + 20); // parseInt�� static������ ���ǵǾ��ִ�. 
		System.out.println(Integer.valueOf(s) + 20);
		Integer i = 20; //20 -> int�� => Integer������ �ڵ� �� ��ȯ 
		
		//���ڸ� ���ڿ��� ��ȯ 
		System.out.println(Integer.toString(i) + 20);
		
		System.out.println(String.valueOf(1000) + 2000);
		
		//�������� 2������ ��ȯ�ؼ� ���ڿ��� ��ȯ 
		System.out.println(Integer.toBinaryString(i));
		
		//Integer Ŭ������ ����� ��� 
		System.out.println(Integer.MAX_VALUE);
		System.out.println(Integer.MIN_VALUE);
		
		//Float��
		System.out.println(Float.MAX_VALUE);
		System.out.println(Float.MIN_VALUE);
		System.out.println(Float.parseFloat(s) + 2.4);
		System.out.println(Float.valueOf("3.14"));
		
		System.out.println(Float.toString(3.14f));
		
		System.out.println(String.valueOf(3.14));
			
	}
}
