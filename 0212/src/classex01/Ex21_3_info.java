package classex01;

import java.util.Scanner;

//�ǽ�) �������� �Է¹ް� ���
//inner class
class Info{
	private String	name;
	private int		age;
	
	//������(�̸�, ����)
	public Info(String name, int age) {
		this.name	= name;
		this.age	= age; 
	}
	
	public String getName() {
		return name;
	}
	
	public int getAge() {
		return age;
	}
	
	//instance inner class
	class Addr{
		private String addr;

		String getAddr() {
			return addr;
		}

		void setAddr(String addr) {
			this.addr = addr;
		}
		
		@Override
		public String toString() {
			return "�̸� : " + name + ", ���� : " + age + ", �ּ� : " + addr;
		}
		
	}
	
	//�ܺ� Ŭ������ toString method
	@Override
	public String toString() {
		return "�̸� :  " + name + ", ���� : " + age; 
	}
}

public class Ex21_3_info {
	public static void main(String[] args) {
		// ���� ������ �Է� �ް� ���
		Scanner sc = new Scanner(System.in);
		System.out.print("�̸� : ");
		String name = sc.nextLine();
		System.out.println();
		System.out.print("���� : ");
		int age = sc.nextInt(); //enter Ű�� �о�帮�� ���Ѵ�. ������ enter�� �Է� ��Ʈ���� �����־ ���� �Է� �޴� ���� �پ�Ѱ� �ȴ�.
		//nextInt�� ������ �о ó���ϱ� ������ ���๮�ڰ� �Է½�Ʈ���� �����ִ�.
		//�� �Ŀ� nextLine���� ���๮�ڸ� �о ó�����ش�.
		sc.nextLine();
		System.out.println();
		System.out.print("�ּ� : ");
		String add = sc.nextLine();
		
		
		Info info = new Info(name, age);
		Info.Addr myadd = info.new Addr();
		
		myadd.setAddr(add);
		System.out.println(myadd.toString());
		System.out.println(myadd);
		
	}
}
