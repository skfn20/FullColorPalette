package lambda;

public class CalcTest {
	public static void main(String[] args) {
		Calc cal = (s, v) -> s + v;
		System.out.println(cal.add(10, 20));
	}
}
