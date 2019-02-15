package exception_example;

public class Car {
	private int speed;
	private String name;
	
	//생성자 
	public Car(String name, int speed) {
		this.setName(name);
		this.speed = speed;
	}

	public int getSpeed() {
		return speed;
	}

	public void setSpeed(int speed) throws CarSpeedException{
		if(speed <= 50) {
			throw new CarSpeedException("속도가 느립니다.");
		}else if(speed >= 100){
			throw new CarSpeedException("속도가 빠릅니다.");
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
				throw new CarSpeedException("속도가 너무 빠릅니다.");
			}catch(CarSpeedException e) {
				System.out.println(e.getMessage());
			}
		}
		System.out.println("자동차 속도를 올립니다.");
		speed += 5;
	}
	
	void speedDown(){
		if(speed < 50) {
			try {
				throw new CarSpeedException("속도가 너무 느립니다.");
			}catch(CarSpeedException e) {
				System.out.println(e.getMessage());
			}
		}

		System.out.println("자동차 속도를 늦춥니다.");
		speed -= 5;
	}
}
