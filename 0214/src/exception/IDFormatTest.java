package exception;

public class IDFormatTest {
	private String userID;
	
	public String getUserID() {
		return userID;
	}
	
	public void setUserID(String userID) throws IDFormationException{
		if(userID == null) {
			throw new IDFormationException("���̵�� null�� �� �����ϴ�.");
		}else if(userID.length() < 8 || userID.length() > 20) {
			throw new IDFormationException("���̵�� 8�� �̻� 20�����Ϸ� ������");
		}
		
		this.userID = userID;
	}
	
	public void setPassword(String password) throws PasswordException{
		if(password == null) {
			throw new PasswordException("password�� null�� �� �����ϴ�.");
		}else if(password.length() <= 5) {
			throw new PasswordException("password�� 6�ڸ� �̻� �Է��ϼ���");
		}else if(password.matches("[a-zA-z]+")) {
			throw new PasswordException("password�� ���ڿ� ������ ���� �Է����ּ���");
		}
	}
	
	public static void main(String[] args) {
		IDFormatTest test = new IDFormatTest();
		
		String userID = null;
		try {
			test.setUserID(userID);
		}catch(IDFormationException e) {
			System.out.println(e.getMessage());
		}
		
		userID = "1234567";
		try {
			test.setUserID(userID);
		}catch(IDFormationException e) {
			System.out.println(e.getMessage());
		}
		
		String password = null;
		try {
			test.setPassword(password);
		}catch(PasswordException e) {
			System.out.println(e.getMessage());
		}
		
		password = "123";
		
		try {
			test.setPassword(password);
		}catch(PasswordException e) {
			System.out.println(e.getMessage());
		}
		
		password = "abcdef";
		
		try {
			test.setPassword(password);
		}catch(PasswordException e) {
			System.out.println(e.getMessage());
		}	}

}
