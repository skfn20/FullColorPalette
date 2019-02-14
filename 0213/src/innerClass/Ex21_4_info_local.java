package innerClass;

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
				return "이름 : " + name + ", 나이 : " + age + ", 주소 : " + addr;
			}
		}
		
		Addr myadd = new Addr(addr);
		System.out.println(myadd);
	}
	
	//외부 클래스의 toString method
	@Override
	public String toString() {
		return "이름 :  " + name + ", 나이 : " + age; 
	}
}

public class Ex21_4_info_local {
	public static void main(String[] args) {
		Info myinfo = new Info("peter", 26);
		myinfo.method("송파구");
	}

}
