package classcooperation;

public class Student {
	public String		studentName;	//�л� �̸�
	public int			grade;			//�г�
	public int			money;			//�л��� ������ �ִ� ��
	private static int	serialNum = 100;//�й�
	public int			studentID;
	
	//student class ������(�̸�, ��)
	public Student(String studentName, int money) {
		this.studentName = studentName;
		this.money = money;
		studentID = serialNum;
		serialNum++;
	}
	
	//������ Ž
	public void takeBus(Bus bus) {
		bus.take(1000);
		this.money -= 1000;
	}
	
	//����ö�� Ž
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
	
	//������ �ν��Ͻ� ������ ���� ���� ������
	public void showInfo() {
		System.out.println(studentName + "���� ���� ���� " + money + "�Դϴ�.");
	}
}
