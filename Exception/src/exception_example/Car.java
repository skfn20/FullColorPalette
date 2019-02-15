package exception_example;

public class Car {
	private int speed;
	private String name;
	
	//������ 
	public Car(String name, int speed) {
		this.setName(name);
		this.speed = speed;
	}

	public int getSpeed() {
		return speed;
	}

	public void setSpeed(int speed) throws CarSpeedException{
		if(speed <= 50) {
			throw new CarSpeedException("�ӵ��� �����ϴ�.");
		}else if(speed >= 100){
			throw new CarSpeedException("�ӵ��� �����ϴ�.");
		}else {
			this.speed = speed;
		}
	}
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	void speedUp(){
		if(speed > 100) {
			try{
				throw new CarSpeedException("�ӵ��� �ʹ� �����ϴ�.");
			}catch(CarSpeedException e) {
				System.out.println(e.getMessage());
			}
		}
		System.out.println("�ڵ��� �ӵ��� �ø��ϴ�.");
		speed += 5;
	}
	
	void speedDown(){
		if(speed < 50) {
			try {
				throw new CarSpeedException("�ӵ��� �ʹ� �����ϴ�.");
			}catch(CarSpeedException e) {
				System.out.println(e.getMessage());
			}
		}

		System.out.println("�ڵ��� �ӵ��� ����ϴ�.");
		speed -= 5;
	}
}
