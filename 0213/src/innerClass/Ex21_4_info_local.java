package innerClass;

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
	
	void method(String addr) {
		
		// local inner class
		class Addr{
			private String addr;
			
			Addr(String addr) {
				this.addr = addr;
			}
	
			String getAddr() {
				return addr;
			}
				
			@Override
			public String toString() {
				return "�̸� : " + name + ", ���� : " + age + ", �ּ� : " + addr;
			}
		}
		
		Addr myadd = new Addr(addr);
		System.out.println(myadd);
	}
	
	//�ܺ� Ŭ������ toString method
	@Override
	public String toString() {
		return "�̸� :  " + name + ", ���� : " + age; 
	}
}

public class Ex21_4_info_local {
	public static void main(String[] args) {
		Info myinfo = new Info("peter", 26);
		myinfo.method("���ı�");
	}

}
