package thread;

//동기화(synchronized): 공유자원에 대해 한 번에 하나의 thread만 접근 가능
//인스턴스 생성 시 생기는 rock을 thread가 얻은 후에 instance에 접근하고
//작업이 끝나면 rock을 반납한다. 

//티켓팅 예제
class Ticketing{
	//공유된 필드
	int ticketCount = 1;
	synchronized void ticketing() {
		//먼저 동기화된 method를 갖고 있는 thread에게 rock을 주고 rock을 갖고 있는 thread만 접근 가능하다
		String name = Thread.currentThread().getName();
		if(ticketCount > 0) {
			System.out.println(name + "티켓팅 성공");
			ticketCount--;
		}else {
			System.out.println(name + "티켓팅 실패");
		}
		System.out.println(name + "남은 티켓 수 : " + ticketCount);	
	}
}

class TicketThread implements Runnable{
	Ticketing ticket = new Ticketing();
	
	@Override
	public void run() {
		ticket.ticketing(); //티켓팅 메소드 호출 
	}
}
public class ThreadSyncTest {
	public static void main(String[] args) {
		//티켓팅 thread 생성
//		TicketThread th1 = new TicketThread();
//		TicketThread th2 = new TicketThread();
//		TicketThread th3 = new TicketThread();
		//이렇게 하면  각 인스턴스마다 한 장씩 티켓이 생긴다. 
		
		TicketThread th1 = new TicketThread();
		//인스턴스는 하나만 만들고 이 인스턴스에 여러 thread를 만들어주면 ticket은 결국 한 장만 생성
		//이 때 동기화된 method는 동시에 실행 될 수 없다. 
		//method를 통째로 동기화한 경우에는 이 method를 다 실행할 때까지 다른 thread는 
		//동기화된 method를 사용하지 못하여 성능이 떨어진다. 
		
		Thread t1 = new Thread(th1, "th1");
		Thread t2 = new Thread(th1, "th2");
		Thread t3 = new Thread(th1, "th3");
		t1.start();
		t2.start();
		t3.start();
	}
}
