package classcooperation;

public class Bus {
	int busNumber;		//버스 번호
	int passengerCount;	//승객 수
	int money;			//버스 수입
	
	public Bus(int busNumber) {
		this.busNumber = busNumber;
	}
	
	public void take(int money) {
		this.money += money;
		passengerCount++;
	}
	
	public void showInfo() {
		System.out.println(busNumber + " : " + passengerCount + " , " + money);
	}
}
