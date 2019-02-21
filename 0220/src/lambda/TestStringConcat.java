package lambda;

public class TestStringConcat {
	public static void main(String[] args) {
		String s1 ="Hello";
		String s2 ="Java";
		StringConcatImpl concat = new StringConcatImpl();
		concat.makeString(s1, s2);
		
		//lambda식으로 구현 
		StringConcat concat2 = (s, v) -> System.out.println(s + ", " + v);
		concat2.makeString(s1, s2);
	}
}
