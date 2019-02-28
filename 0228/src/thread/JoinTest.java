package thread;

//join() : 대기상태에 있는 thread를 호출하여 실행중인 thread를 대기상태로 보낸 후
//		   join()을 호출한 thread를 실행

class JoinThread extends Thread{
	@Override
	public void run() {
		for(int i = 0; i < 10; i++) {
			System.out.println(Thread.currentThread().getName());
		}
		System.out.println("Join_1 완료");
	}
}

class JoinThread2 extends Thread{
	@Override
	public void run() {
		for(int i = 0; i < 10; i++) {
			System.out.println(Thread.currentThread().getName());
		}
		System.out.println("Join_2 완료");
	}
}

public class JoinTest {
	public static void main(String[] args) {
		JoinThread jTh = new JoinThread();
		jTh.setName("Join1");
		JoinThread2 jTh2 = new JoinThread2();
		jTh2.setName("Join2");
		
		jTh.start();
		jTh2.start();
		
		try {
			jTh.join();
			jTh2.join();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
		for(int i = 0; i < 10; i++) {
			System.out.println(Thread.currentThread().getName());
		}
		System.out.println("main 완료");
	}
}
