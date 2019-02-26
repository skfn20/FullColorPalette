package collection;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

//������ ��ũ : �� ���ǵ� ���� �Ǵ� ���
//�ڹ��� �����ӿ�ũ : �� ���ǵ� Ŭ������
//�÷��� �����ӿ�ũ : �����͸� �� �ٷ�� ���ؼ� Ŭ�������� ����ȭ�ؼ� ���� 
//�ڷᱸ���� ���� ���α׷��� ������ �¿�ȴ�. 
//������ ���� ��� : list, stack, queue, tree, hash, graph 
//�˰���(�����͸� ����ó�� ���)

public class Collection_List {
	public static void main(String[] args) {
		//1. List<E>�� ����
		//	cf) ���׸��� �� E : ��Ҷ�� �ǹ̷� �÷��ǿ� ����. 
		//	1)���� ������ �ִ�
		//	2)������ �������� �ߺ� ������ ���
		//1-1. ArrayList -> �˻��� ���� ������ 
		//	�迭 ����� �ڷᱸ��
		
		String[] s = new String[2];
		s[0] = "pen";
		s[1] = "note";
		//s[2] = "note2";	//���� �迭�� ����� ������ ����
		
		//ArrayList ��� ��ü ���� 
		List<String> list = new ArrayList<>();	//�ڵ��� ���������� ���Ͽ� List�� ���� �������ش�. 
		list.add("Hi");
		list.add("Ni Hao");
		list.add("note2");	//����� ������ �ְ� �׶��׶� �������� �Ҵ��ؼ� ������ ���ش�. 
		System.out.println(list);
		
		for(int i = 0 ; i < list.size(); i++)
			System.out.println(list.get(i));
		
		list.add(0, "Hello");
		
		System.out.println(list);
		
		//��ġ ã�� 
		System.out.println(list.indexOf("Hello"));
		//���� 
		list.remove(2);
		System.out.println(list);
		
		list.remove(list.indexOf("note2"));
		System.out.println(list);
		
		for(String s2 : list)
			System.out.println(s2);
		
		//�ݺ��ڸ� �̿��� ��� 
		Iterator<String> it = list.iterator();
		System.out.println("===�ݺ��ڸ� �̿��� ���===");
		while(it.hasNext())
			System.out.println(it.next());
		
		//�ݺ��ڸ� �̿��Ͽ� ����
		//�ε����� ������ �ʰ� �ٷ� ���� ���� 
		
		it = list.iterator(); //�ݺ��� �� �� ����ϸ� �ٽ� �����ؼ� ������־����Ѵ�. 
		while(it.hasNext()) {
			String s1 = it.next();
			if(s1.equals("note"))
				it.remove();
			else
				System.out.println("note�� �����ϴ�.");
		}
		
		System.out.println(list);
		
		//for���� Ȱ���ϴ� ���
		for(Iterator<String> wit = list.iterator(); wit.hasNext(); ) {
			System.out.println(wit.next());
		}
		
		//1-2. LinkedList
		//list ��� �ڷᱸ�� -> �ڷ��� ���԰� ������ ���� �߻��� ��� time complexity�� ����
		//�� ��Ұ� �ڽ��� ���� ����� �ּҿ� ���� ����� �ּҸ� ������ �ִ�.
		//�˻� �� ���� ����
		List<String> list2 = new LinkedList<>();
		list2.add("Pen");
		list2.add("note");
		Iterator<String> it3 = list2.iterator();
		
		while(it3.hasNext())
			System.out.println(it3.next());
		
		//list �ʱ�ȭ
		//������ ���ÿ� �� �ֱ�
		List<String> list3 = Arrays.asList("Pen", "Note");
		list3 = new ArrayList<>(list3);
		System.out.println(list3);
		
		//�������� �� �ֱ� 
		List list4 = new LinkedList();
		list4.add("Hi");
		list4.add(100);
		list4.add(3.14);
		System.out.println(list4);
		
		
	}
}
