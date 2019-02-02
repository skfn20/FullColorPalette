
public class MainClass {
	public static void main(String[] args) {
		System.out.println("Good\tMorning");
		System.out.println("Good\nMorning");
		System.out.println("'Good Morning'");
		
		System.out.printf("오늘의 기온은 %d도 입니다\n", 10);
		System.out.println("오늘의 기온은 " +10 + "도 입니다.");
		int num = 10;
		System.out.printf("%x\n", num);
		
		String str = "My Java";
		System.out.printf("%s\n", str);
		System.out.printf("소문자 \'%c\'의 대문자는 \'%c\'입니다.\n", 'a', 'b');
	}
}
