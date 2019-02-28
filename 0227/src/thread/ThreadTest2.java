package thread;

class Th3 extends Thread{
	@Override
	public void run() {
		int sum = 0;
		for(int i = 1; i <= 100; i++) {
			sum += i;
			System.out.println("Thread's sum : " + sum);
		}
	}
}

class Th4 implements Runnable{
	@Override
	public void run() {
		int sum = 0;
		for(int i = 101; i <= 200; i++) {
			sum += i;
			System.out.println("Runnable's sum : " + sum);
		}
	}
}

public class ThreadTest2 {
	public static void main(String[] args) {
		Th3 th1 = new Th3();
		Th4 th2 = new Th4();
		
		Thread t = new Thread(th2);
		
		th1.start();
		t.start();
		
	}
}
