package classex01;

import java.util.Scanner;

//실습) 개인정보 입력받고 출력
//inner class
class Info{
	private String	name;
	private int		age;
	
	//생성자(이름, 나이)
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
			return "이름 : " + name + ", 나이 : " + age + ", 주소 : " + addr;
		}
		
	}
	
	//외부 클래스의 toString method
	@Override
	public String toString() {
		return "이름 :  " + name + ", 나이 : " + age; 
	}
}

public class Ex21_3_info {
	public static void main(String[] args) {
		// 개인 정보를 입력 받고 출력
		Scanner sc = new Scanner(System.in);
		System.out.print("이름 : ");
		String name = sc.nextLine();
		System.out.println();
		System.out.print("나이 : ");
		int age = sc.nextInt(); //enter 키를 읽어드리지 못한다. 때문에 enter가 입력 스트림에 남아있어서 다음 입력 받는 것이 뛰어넘게 된다.
		//nextInt가 정수만 읽어서 처리하기 때문에 개행문자가 입력스트림에 남아있다.
		//그 후에 nextLine으로 개행문자를 읽어서 처리해준다.
		sc.nextLine();
		System.out.println();
		System.out.print("주소 : ");
		String add = sc.nextLine();
		
		
		Info info = new Info(name, age);
		Info.Addr myadd = info.new Addr();
		
		myadd.setAddr(add);
		System.out.println(myadd.toString());
		System.out.println(myadd);
		
	}
}
