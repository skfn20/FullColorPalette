package collection;

import java.util.HashMap;
import java.util.Set;

//�л� Ŭ���� 
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
//		return "�̸� : " + name + ", ���� : " + age;
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
		//�л� Ŭ������ ���� value������
		
//		Student std1 = new Student("ȫ�浿", 15);
//		Student std2 = new Student("���ڹ�", 30);
//		
//		HashMap<K, Student> map = new HashMap<>();
//		
//		map.put(std1.getName(), std1);
//		map.put(std2.getName(), std2);
//		
//		System.out.println(map);
//		
//		Set<String> kSet = map.keySet();	//Ű�� set���� ��ȯ 
//		System.out.println(kSet);
//		
//		for(String s : kSet)
//			System.out.println(s + ")" + map.get(s));
		
		//generic class�� map�� �߰��ϱ�
		Student<String, Integer> std1 = new Student<>("ȫ�浿", 20);
		Student<String, Integer> std2 = new Student<>("���ڹ�", 30);
		
		HashMap<String, Student<String, Integer>> map = new HashMap();
		map.put(std1.getName(), std1);
		map.put(std2.getName(), std2);
		
		System.out.println(map);
		
		Set<String> kSet = map.keySet();
		for(String s : kSet)
			System.out.println(s + "| " + map.get(s));
	}
}
