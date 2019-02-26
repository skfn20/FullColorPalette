package collection;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

//프레임 워크 : 잘 정의된 구조 또는 골격
//자바의 프레임워크 : 잘 정의된 클래스들
//컬렉션 프레임워크 : 데이터를 잘 다루기 위해서 클래스들을 구조화해서 정의 
//자료구조에 따라서 프로그램의 성능이 좌우된다. 
//데이터 저장 방식 : list, stack, queue, tree, hash, graph 
//알고리즘(데이터를 가공처리 방법)

public class Collection_List {
	public static void main(String[] args) {
		//1. List<E>를 구현
		//	cf) 제네릭의 형 E : 요소라는 의미로 컬렉션에 쓴다. 
		//	1)저장 순서가 있다
		//	2)동일한 데이터의 중복 저장을 허용
		//1-1. ArrayList -> 검색이 쉽고 빠르다 
		//	배열 기반의 자료구조
		
		String[] s = new String[2];
		s[0] = "pen";
		s[1] = "note";
		//s[2] = "note2";	//기존 배열은 사이즈가 정해져 있음
		
		//ArrayList 기반 객체 생성 
		List<String> list = new ArrayList<>();	//코드의 유지보수를 위하여 List로 많이 선언해준다. 
		list.add("Hi");
		list.add("Ni Hao");
		list.add("note2");	//사이즈가 정해져 있고 그때그때 동적으로 할당해서 저장을 해준다. 
		System.out.println(list);
		
		for(int i = 0 ; i < list.size(); i++)
			System.out.println(list.get(i));
		
		list.add(0, "Hello");
		
		System.out.println(list);
		
		//위치 찾기 
		System.out.println(list.indexOf("Hello"));
		//삭제 
		list.remove(2);
		System.out.println(list);
		
		list.remove(list.indexOf("note2"));
		System.out.println(list);
		
		for(String s2 : list)
			System.out.println(s2);
		
		//반복자를 이용한 출력 
		Iterator<String> it = list.iterator();
		System.out.println("===반복자를 이용한 출력===");
		while(it.hasNext())
			System.out.println(it.next());
		
		//반복자를 이용하여 삭제
		//인덱스를 통하지 않고 바로 삭제 가능 
		
		it = list.iterator(); //반복을 한 번 사용하면 다시 선언해서 사용해주어어야한다. 
		while(it.hasNext()) {
			String s1 = it.next();
			if(s1.equals("note"))
				it.remove();
			else
				System.out.println("note가 없습니다.");
		}
		
		System.out.println(list);
		
		//for문을 활용하는 방법
		for(Iterator<String> wit = list.iterator(); wit.hasNext(); ) {
			System.out.println(wit.next());
		}
		
		//1-2. LinkedList
		//list 기반 자료구조 -> 자료의 삽입과 삭제가 자주 발생할 경우 time complexity가 좋다
		//각 요소가 자신의 이전 요소의 주소와 다음 요소의 주소를 가지고 있다.
		//검색 시 성능 저하
		List<String> list2 = new LinkedList<>();
		list2.add("Pen");
		list2.add("note");
		Iterator<String> it3 = list2.iterator();
		
		while(it3.hasNext())
			System.out.println(it3.next());
		
		//list 초기화
		//생성과 동시에 값 넣기
		List<String> list3 = Arrays.asList("Pen", "Note");
		list3 = new ArrayList<>(list3);
		System.out.println(list3);
		
		//여러가지 형 넣기 
		List list4 = new LinkedList();
		list4.add("Hi");
		list4.add(100);
		list4.add(3.14);
		System.out.println(list4);
		
		
	}
}
