package stringex;

import java.util.Arrays;

public class StringEx01 {
	public static void main(String[] args) {
		//���ڿ� Ŭ����
		//�ν��Ͻ� ����
		String s = new String("Hello Java");
		String s2 = new String("Hello Java");
		
		if(s == s2) System.out.println("����");
		else System.out.println("�ٸ���"); 
		
		//toString�� overriding �Ǿ��־
		//�ν��Ͻ� ���� ���밪�� ������ ��
		if(s.equals(s2)) System.out.println("����");
		else System.out.println("�ٸ���");
		
		//�޼ҵ� ����(static ����)�� ���Ǯ�̶�� ������ ���� --> Data���� 
		//���Ǯ������ ���� ���ڿ��� ������ ���� ������ �ʰ� ���� �ּҸ� ��� 
		String m = "Java";
		String m2 = "Java";
		
		//�Ȱ��� �ּҸ� ������ �ֱ� ������ ���� 
		if(m == m2) System.out.println("����");
		else System.out.println("�ٸ���");
		
		System.out.println("m.hashCode : " + m.hashCode());
		System.out.println("m2.hashCode : " + m2.hashCode());
		
		if(m.equals(m2)) System.out.println("����");
		
		//���� ����
		String e1 = "java";
		String e2 =" is easy";
		
		System.out.println(e1.concat(e2));
		
		//���ڿ� �߶󳻱�
		System.out.println(e2.substring(4));
		System.out.println(e2.substring(1, 3));
		
		//���ڿ� ����
		System.out.println(e2.length());
		
		//�빮�ڷ� ��ȯ
		System.out.println(e2.toUpperCase());
		
		//�ҹ��ڷ� ��ȯ
		System.out.println(e2.toLowerCase());
		
		//�ε����� �ش��ϴ� ����
		System.out.println(e1.charAt(1));
		
		//���ڿ��� ��ġ
		System.out.println(e1.indexOf("va"));
		
		//������ ���� 
		System.out.println(e2.trim());
		
		//���ڿ��� �Ϻκ��� ����  
		//replace 
		String ex1 = "���ѻ�� �������� ���� �����ϼ�";
		System.out.println(ex1.replace("����", "�ѱ�"));
		
		//replaceAll
		String ex2 = "���ѻ�� �������� ���� �����ϼ�";
		System.out.println(ex2.replaceAll("����", "�ѱ�"));
		
		//replace�� replaceAll�� ������
		//replaceAll�� ���Խ��� ����� 
		String ex3 = "abcdefghijk";
		System.out.println(ex3.replaceAll("[ac]", "��"));
		ex3 = "abcdefghijkac";
		System.out.println(ex3.replaceAll("[ac]", "��"));
		System.out.println(ex3.replaceAll("[^ac]", "��"));
		
		String ex4 = "20 + 10 = 30";
		System.out.println(ex4.replaceAll("[+]" , "-"));
		//replaceAll�� ������� �� []������ �������� �͵�
		//* : �չ��ڰ� ���� �� �� ���� ���� �ִٴ� ǥ�� 
		//$ : ���ڿ��� ���� 
		//+ : �� ���ڰ� �ϳ� �̻����� �ǹ� 
		//| : ���� �ȿ��� or ������ 
		
		String ex05 = "0abc00defg";
		System.out.println(ex05.replaceAll("[0]+", "+"));
		System.out.println(ex05.replaceAll("[ ]*", "-"));
		
		//����ȯ 
		//valueOf : ���ڷ� ��ȯ 
		int a = 100; 
		String ex06 = String.valueOf(a);
		System.out.println(ex06.length());
		
		//split �޼ҵ� 
		//���ڿ��� �߰� �ɰ���. 
		String ex07 ="a,b,c,d,e";
		System.out.println(s.split(","));
		String[] s1 = ex07.split(",");
		System.out.println(Arrays.toString(s1));
		
		for(String ms : s1)
			System.out.print(ms + " ");
		System.out.println();
	}
}
