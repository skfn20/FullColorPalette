
public class ChildClass {
	
	public String name;
	public String gender;
	public int age;
	
	public ChildClass(String name, String gender, int age) {
		System.out.println("---ChildClass constructor");
		this.name = name;
		this.gender = gender;
		this.age = age;
	}
	
	public void getInfo() {
		System.out.println("---getInfo() START -- ");
		System.out.println("name : " + name);
		System.out.println("gender : " + gender);
		System.out.println("age : " + age);
	}
}
