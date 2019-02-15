package exception;

public class IDFormatTest {
	private String userID;
	
	public String getUserID() {
		return userID;
	}
	
	public void setUserID(String userID) throws IDFormationException{
		if(userID == null) {
			throw new IDFormationException("아이디는 null일 수 없습니다.");
		}else if(userID.length() < 8 || userID.length() > 20) {
			throw new IDFormationException("아이디는 8자 이상 20자이하로 쓰세요");
		}
		
		this.userID = userID;
	}
	
	public void setPassword(String password) throws PasswordException{
		if(password == null) {
			throw new PasswordException("password는 null일 수 없습니다.");
		}else if(password.length() <= 5) {
			throw new PasswordException("password를 6자리 이상 입력하세요");
		}else if(password.matches("[a-zA-z]+")) {
			throw new PasswordException("password는 숫자와 영문을 같이 입력해주세요");
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
