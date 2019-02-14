package preview;

interface Camera{//ī�޶� ��� �������̽�
	void photo();
}

interface Call{//��ȭ ���
	void calling();
}

interface Clock{//�ð� ���
	void clock();
}

class CellPhone implements Camera, Call, Clock{
	@Override
	public void clock() {
		System.out.println("�ð� ���");
	}
	
	@Override
	public void calling() {
		System.out.println("��ȭ���");
	}
	
	@Override
	public void photo() {
		System.out.println("���� ���");
	}
}

class PhoneUser{
	void call(Call c) {//��ȭ ���
		c.calling();
		System.out.println("��ȭ�� �ɾ����ϴ�.");
	}
	void camera(Camera c) {
		c.photo();
		System.out.println("������ ������ϴ�.");
	}
	void clock(Clock c) {
		c.clock();
		System.out.println("�ð��� Ȯ���մϴ�.");
	}
}

public class Ex19_3_interface {
	public static void main(String[] args) {
		//�ڵ��� �ν��Ͻ� ����
		CellPhone cp = new CellPhone();
		cp.calling();
		cp.clock();
		cp.photo();
		
		Call phone1 = new CellPhone();
		Camera phone2 = new CellPhone();
		Clock phone3 = new CellPhone();
		
		//�������̽� ������
		PhoneUser pu = new PhoneUser();
		pu.call(cp);
		pu.call(phone1);
		System.out.println();
		pu.camera(cp);
		pu.camera(phone2);
		System.out.println();
		pu.clock(cp);
		pu.clock(phone3);
		
	}
}
