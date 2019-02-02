package mypackage;

import java.util.ArrayList;
import java.util.HashMap;

public class MainClass {

	public static void main(String[] args) {
		ArrayList<String> list = new ArrayList<String>();
		
		System.out.println("list.size : " + list.size());
		list.add("Hello");
		list.add("Java");
		list.add("World");
		
		System.out.println(list.size());
		list.add(2, "Programming");
		
		System.out.println("list : " + list);
		
		list.set(2,  "HI");
		
		System.out.println("list : " + list);
		
		String str = list.get(2);
		
		System.out.println(str);
		
		boolean b = list.isEmpty();
		System.out.println("list.isEMpty() : " + b);
		
		list.clear();
		
		HashMap<Integer, String> map = new HashMap<Integer, String>();
		System.out.println(map.size());
		
		map.put(5,  "HI");
		map.put(7, "Oh no");
		
		System.out.println(map);
		System.out.println(map.get(5));
		b = map.containsKey(7);
		System.out.println(b);
		System.out.println(map.containsValue("World"));
		
		map.clear();
		System.out.println(map.size());
		
	}
}
