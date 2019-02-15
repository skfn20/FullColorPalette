package collection.arraylist;

import java.util.ArrayList;

class MyQueue{
	private ArrayList<String> arrayQue = new ArrayList<String>();
	
	public void enQueue(String data) {
		arrayQue.add(data);
	}
	
	public String deQueue() {
		int len = arrayQue.size();
		
		if(len <= 0) {
			System.out.println("큐가 비었습니다.");
			return null;
		}
		
		return arrayQue.remove(0);
	}
}

public class QueTest {
	public static void main(String[] args) {
		
		MyQueue que = new MyQueue();
		
		que.enQueue("A");
		que.enQueue("B");
		que.enQueue("C");
		
		System.out.println(que.deQueue());
		System.out.println(que.deQueue());
		System.out.println(que.deQueue());
	}
}
