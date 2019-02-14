package innerClass;

class Info2{
	private String	name;
	private int		age;
	
	//생성자(이름, 나이)
	public Info2(String name, int age) {
		this.name	= name;
		this.age	= age; 
	}
	
	public String getName() {
		return name;
	}
	
	public int getAge() {
		return age;
	}
	
	//static inner class
	static class Addr{
		private String addr;
		
		Addr(String addr){
			this.addr = addr;
		}

		String getAddr() {
			return "주소 : " + addr;
		}
	}
	
	//외부 클래스의 toString method
	@Override
	public String toString() {
		return "이름 :  " + name + ", 나이 : " + age; 
	}
}

public class Ex21_5_info_static {
	public static void main(String[] args) {
		Info2 info = new Info2("peter", 25);
		Info2.Addr myadd = new Info2.Addr("송파구");
		System.out.print(info + " ");
		System.out.println(myadd.getAddr());

		
	}
}
