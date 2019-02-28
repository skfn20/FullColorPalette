package collection;

import java.util.HashMap;
import java.util.Set;

//학생 클래스 
//class Student{
//	private String name;
//	private int age;
//	
//	Student(String name, int age){
//		this.name = name;
//		this.age = age;
//	}
//	
//	public int getAge() {
//		return age;
//	}
//	
//	public String getName() {
//		return name;
//	}
//	
//	@Override
//	public String toString() {
//		return "이름 : " + name + ", 나이 : " + age;
//	}
//}

//generic class
class Student<K, V>{
	private K name;
	private V age;
	
	Student(K name, V age){
		this.name = name;
		this.age = age;
	}
	
	K getName() {
		return name;
	}
	
	V getAge() {
		return age;
	}
	
	public String toString() {
		return name + " : " + age;
	}
}


public class StudentTest {
	public static void main(String[] args) {
		//학생 클래스를 맵의 value값으로
		
//		Student std1 = new Student("홍길동", 15);
//		Student std2 = new Student("김자바", 30);
//		
//		HashMap<K, Student> map = new HashMap<>();
//		
//		map.put(std1.getName(), std1);
//		map.put(std2.getName(), std2);
//		
//		System.out.println(map);
//		
//		Set<String> kSet = map.keySet();	//키를 set으로 반환 
//		System.out.println(kSet);
//		
//		for(String s : kSet)
//			System.out.println(s + ")" + map.get(s));
		
		//generic class로 map에 추가하기
		Student<String, Integer> std1 = new Student<>("홍길동", 20);
		Student<String, Integer> std2 = new Student<>("김자반", 30);
		
		HashMap<String, Student<String, Integer>> map = new HashMap();
		map.put(std1.getName(), std1);
		map.put(std2.getName(), std2);
		
		System.out.println(map);
		
		Set<String> kSet = map.keySet();
		for(String s : kSet)
			System.out.println(s + "| " + map.get(s));
	}
}
