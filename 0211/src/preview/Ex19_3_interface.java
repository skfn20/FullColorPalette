package preview;

interface Camera{//카메라 기능 인터페이스
	void photo();
}

interface Call{//전화 기능
	void calling();
}

interface Clock{//시간 기능
	void clock();
}

class CellPhone implements Camera, Call, Clock{
	@Override
	public void clock() {
		System.out.println("시간 기능");
	}
	
	@Override
	public void calling() {
		System.out.println("전화기능");
	}
	
	@Override
	public void photo() {
		System.out.println("사진 기능");
	}
}

class PhoneUser{
	void call(Call c) {//전화 기능
		c.calling();
		System.out.println("전화를 걸었습니다.");
	}
	void camera(Camera c) {
		c.photo();
		System.out.println("사진을 찍었습니다.");
	}
	void clock(Clock c) {
		c.clock();
		System.out.println("시간을 확인합니다.");
	}
}

public class Ex19_3_interface {
	public static void main(String[] args) {
		//핸드폰 인스턴스 생성
		CellPhone cp = new CellPhone();
		cp.calling();
		cp.clock();
		cp.photo();
		
		Call phone1 = new CellPhone();
		Camera phone2 = new CellPhone();
		Clock phone3 = new CellPhone();
		
		//인터페이스 다형성
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
