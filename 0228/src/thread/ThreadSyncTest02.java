package thread;

//동기화 블록 : 메소드 단위가 아니라 원하는 부분만 블록으로 동기화해줄 수 있다.

class SyncBlock implements Runnable{
	int count = 0;
	String name = Thread.currentThread().getName();
	@Override
	public void run() {
		for(int i = 0; i < 1000; i++) {
			synchronized(this) {//동기화 블록
				count++;
			}
			System.out.println(name + ") 동기화 안 된 블록 | 1 증가");
		}
		for(int i = 0; i < 1000; i++) {
			synchronized(this) {//동기화 블록
				count--;
			}
			System.out.println(name+ ") 동기화 안 된 블록 | 1 감소");
		}
	}
	
	int getCount() {
		return count;
	}
}

public class ThreadSyncTest02 {
	public static void main(String[] args) {
		SyncBlock sBlock = new SyncBlock();
		
		Thread th1 = new Thread(sBlock, "th1");
		Thread th2 = new Thread(sBlock, "th2");
		Thread th3 = new Thread(sBlock, "th3");
		
		th1.start();
		th2.start();
		th3.start();
		
		try {
			th1.join();
			th2.join();
			th3.join();
		}catch(InterruptedException e) {
			e.printStackTrace();
		}
		
		System.out.println("메인 count : " + sBlock.getCount());
	}
}
