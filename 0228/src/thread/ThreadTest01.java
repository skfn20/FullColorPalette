package thread;

class Th2 implements Runnable{
	@Override
	public void run() {
		for(int i = 0; i < 5; i++) {
			//Thread.currentThread().getName() -> static method : 현재 돌고 있는 thread의 이름을 얻는다.
			System.out.println(Thread.currentThread().getName()); 
			for(int j = 0; j<100000000; j++) {}
		}
	}
}

public class ThreadTest01 {
	public static void main(String[] args) {
		//thread's priority
		//1~10까지의 우선순위를 가질 수 있다.
		//우선순위가 클 수록 높다.
		
		//첫 번째 thread
		Th2 th1 = new Th2();
		Thread t = new Thread(th1, "thread_1");
		
		t.setPriority(1); //우선 순위 정하기 
		System.out.println("th1의 우선순위 : " + t.getPriority());
		
		//두 번째 thread
		Th2 th2 = new Th2();
		Thread t2 = new Thread(th2, "thread_2");
		
		//우선순위를 정하지 않으면 우선순위가 5로 지정이 된다. 
		System.out.println("th2의 우선순위 : " + t2.getPriority());
		
		Th2 th3 = new Th2();
		Thread t3 = new Thread(th3, "thread_3");
		
		t3.setPriority(10); //우선 순위 정하기 
		System.out.println("th3의 우선순위 : " + t3.getPriority());
		
		t3.start();
		t2.start();
		t.start();
		
	}
}
