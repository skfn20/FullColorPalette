package innerclass;

class Outter2{
	Runnable getRunnable(int i) {
		int num = 100;
		
		return new Runnable() {
		
			@Override 
			public void run() {
				System.out.println(i);
				System.out.println(num);
			}
		};
	}
	Runnable runner = new Runnable() {
		@Override
		public void run() {
			System.out.println("Runnable�� ������ "
					+ "�͸� Ŭ���� ����");
		}
	};
	
}

public class AnonymousInnerTest {
	public static void main(String[] args) {
		Outter2 out= new Outter2();
		Runnable runnble = out.getRunnable(10);
		runnble.run();
		out.runner.run();
	}
}
