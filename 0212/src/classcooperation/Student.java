package classcooperation;

public class Student {
	public String		studentName;	//학생 이름
	public int			grade;			//학년
	public int			money;			//학생이 가지고 있는 돈
	private static int	serialNum = 100;//학번
	public int			studentID;
	
	//student class 생성자(이름, 돈)
	public Student(String studentName, int money) {
		this.studentName = studentName;
		this.money = money;
		studentID = serialNum;
		serialNum++;
	}
	
	//버스를 탐
	public void takeBus(Bus bus) {
		bus.take(1000);
		this.money -= 1000;
	}
	
	//지하철을 탐
	public void takeSubway(Subway subway) {
		subway.take(1500);
		this.money -= 1500;
	}
	
	public static int getSerialNum() {
		return serialNum;
	}
	
	public static void setSerialNum(int serialNum) {
		Student.serialNum = serialNum;
	}
	
	//생성된 인스턴스 변수의 남은 돈을 보여줌
	public void showInfo() {
		System.out.println(studentName + "님의 남은 돈은 " + money + "입니다.");
	}
}
