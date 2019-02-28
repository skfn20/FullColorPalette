package thread;

//yield(): 자신의 시간을 양보하는 method

class YieldThread implements Runnable{
	@Override
	public void run() {
		for(int i = 0; i < 10; i++) {
			System.out.println("Yield Test");
			Thread.yield();	
		}
	}
}

//yield하지 않은 Thread
class Thread1 implements Runnable{
	@Override
	public void run() {
		for(int i = 0; i < 10; i++) {
			System.out.println("Not Yield Test");	
		}
	}
}

public class YieldTest {
	public static void main(String[] args) {
		YieldThread yTh = new YieldThread();
		Thread th = new Thread(yTh);
		
		Thread1 th1 = new Thread1();
		Thread th2 = new Thread(th1);
		
		th.start();
		th2.start();
	}
}
