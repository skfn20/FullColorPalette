package thread;
//프로그램 : 개발자가 작성한 소스를 컴파일하여 실행코드로 변환된 실행파일 
//프로세스 : 실행파일이 cpu에 의해서 실행된 상태 
//프로세스의 구성요소 : 명령어 코드와 데이터 
//multi-process -> 둘 이상의 cpu가 여러 프로그램을 동시에 실행
//multi-program -> 하나의 cpu가 여러 프로그램을 동시에 실행 


//멀티프로그램에서 사용하는 기본적인 thread(cpu가 하나일 때 여러 프로그램을 돌릴 때)
//스레드란 프로세스 내에서 실행되는 세부 실행 단위 
//멀티 스레드 : 하나의 프로세스 내에서 여러 개의 스레드가 병행 처리 
//싱글 스레드 : 여러 스레드가 순차적으로 실행 
//자바는 멀티 스레드로 동작 
//스레드의 장점 : 코드의 재사용성과 데이터 공유가 가능하다 
//스레드의 단점 : 여러 스레드가 동시 실행 시 공유 자원에 동기화 필요 
//thread의 스케쥴링
//JVM의 thread 스케쥴러가 각 스레드에게 cpu를 적절히 할당하여 동시에 스레드를 실행
//자바는 우선순위가 높은 스레드가 먼저 실행되는 선점형 스케쥴링 방식을 사용 

//스레드 생성 방법
//1)Thread 클래스를 상속(다른 class를 상속 받을 수 없다.)
class Th1 extends Thread{
	
	@Override
	public void run() {//스레드가 할 일을 적어주면 된다. 
		System.out.println("thread 클래스 상속 스레드");
		for(int i = 0 ; i < 10; i++)
			System.out.println("Thread : " + i);
	}
}

//2)Runnable interface 구현(Thread도 Runnable을 implements해서 구현)
class Th2 implements Runnable{
	@Override
	public void run() {
		System.out.println("Runnable interface 구현 스레드");
		for(int i = 0 ; i < 10; i++)
			System.out.println("Runnable : " + i);
	}
}


public class ThreadTest {
	public static void main(String[] args) {
		//thread instance를 생성
		//1)thread 상속
		Th1 th1 = new Th1();
		Th1 th2 = new Th1();
		
		//2)Runnable 구현 
		Th2 th3 = new Th2();
		Thread t = new Thread(th3);
		t.start();
		
		System.out.println("Main Thread");
		
		//thread를 실행할 수 있는 대기 상태 
		//스케쥴러에 의해서 우선순위에 따라 run()이 실행된다.
		th1.start();
		
		System.out.println("Main Thread");
		
		th2.start();
		
		
	}
}
