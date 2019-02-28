package thread;

//Thread의 life cycle
//1. new를 통해서 instance화 된 상태
//2. start() method 호출에 의해서 Runnable 상태
//3. thread scheduler에 의해 선택된 thread를 실행하는 running 상태
//4. sleep(), join(), yield() method에 의해서 Blocked 상태 
//5. run()이 완료된 Dead상태

//sleep() : 실행 중인 클래스를 Blocked 상태로 만들기 
//sleep(1000) : 1초 동안 멈춰라(1/1000단위)
//역할 : 우선순위가 낮은 thread가 cpu에 할당받지 못하는 것을 방지해준다. 
//자주 사용되지 않아서 우선순위가 낮은 thread가 실행될 때 조금 더 부드럽게 동작하도록 도와줄 수 있다.
class SleepThread extends Thread{
	@Override
	public void run() {
		System.out.println("카운트 다운 시작");
		for(int i = 0; i < 5; i++) {
			System.out.println(5-i);
			//1초씩 멈추고 싶다.
			try {
				Thread.sleep(1000);	
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		System.out.println("카운트 다운 종료");
	}
}

public class SleepTest {
	public static void main(String[] args) {
		SleepThread sThread = new SleepThread();
		sThread.start();
	}
}
