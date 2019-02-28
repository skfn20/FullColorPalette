package thread;
//���α׷� : �����ڰ� �ۼ��� �ҽ��� �������Ͽ� �����ڵ�� ��ȯ�� �������� 
//���μ��� : ���������� cpu�� ���ؼ� ����� ���� 
//���μ����� ������� : ��ɾ� �ڵ�� ������ 
//multi-process -> �� �̻��� cpu�� ���� ���α׷��� ���ÿ� ����
//multi-program -> �ϳ��� cpu�� ���� ���α׷��� ���ÿ� ���� 


//��Ƽ���α׷����� ����ϴ� �⺻���� thread(cpu�� �ϳ��� �� ���� ���α׷��� ���� ��)
//������� ���μ��� ������ ����Ǵ� ���� ���� ���� 
//��Ƽ ������ : �ϳ��� ���μ��� ������ ���� ���� �����尡 ���� ó�� 
//�̱� ������ : ���� �����尡 ���������� ���� 
//�ڹٴ� ��Ƽ ������� ���� 
//�������� ���� : �ڵ��� ���뼺�� ������ ������ �����ϴ� 
//�������� ���� : ���� �����尡 ���� ���� �� ���� �ڿ��� ����ȭ �ʿ� 
//thread�� �����층
//JVM�� thread �����췯�� �� �����忡�� cpu�� ������ �Ҵ��Ͽ� ���ÿ� �����带 ����
//�ڹٴ� �켱������ ���� �����尡 ���� ����Ǵ� ������ �����층 ����� ��� 

//������ ���� ���
//1)Thread Ŭ������ ���(�ٸ� class�� ��� ���� �� ����.)
class Th1 extends Thread{
	
	@Override
	public void run() {//�����尡 �� ���� �����ָ� �ȴ�. 
		System.out.println("thread Ŭ���� ��� ������");
		for(int i = 0 ; i < 10; i++)
			System.out.println("Thread : " + i);
	}
}

//2)Runnable interface ����(Thread�� Runnable�� implements�ؼ� ����)
class Th2 implements Runnable{
	@Override
	public void run() {
		System.out.println("Runnable interface ���� ������");
		for(int i = 0 ; i < 10; i++)
			System.out.println("Runnable : " + i);
	}
}


public class ThreadTest {
	public static void main(String[] args) {
		//thread instance�� ����
		//1)thread ���
		Th1 th1 = new Th1();
		Th1 th2 = new Th1();
		
		//2)Runnable ���� 
		Th2 th3 = new Th2();
		Thread t = new Thread(th3);
		t.start();
		
		System.out.println("Main Thread");
		
		//thread�� ������ �� �ִ� ��� ���� 
		//�����췯�� ���ؼ� �켱������ ���� run()�� ����ȴ�.
		th1.start();
		
		System.out.println("Main Thread");
		
		th2.start();
		
		
	}
}
