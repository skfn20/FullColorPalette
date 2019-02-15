package userexception;
//����� ���� �����
//���� üũ ����

class AgeException extends Exception{
	public AgeException(String message) {
		super(message); // �θ��� ������
	}
}

public class UserExceptionTest {
	static void ticketing(int age) throws AgeException{
		if(age < 0) {
			throw new AgeException("���� �Է� ����");
		}
		System.out.println("Ƽ���� ����");
	}
	
	public static void main(String[] args) {
		try {
			ticketing(-10);
		}catch(AgeException e) {
			System.out.println(e.getMessage());
		}
	}
}
