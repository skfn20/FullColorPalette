package lambda;

interface PrintString{
	void showString(String str);
}

public class TestLambda {
	public static void main(String[] args) {
		PrintString lambdaStr = s -> System.out.println(s);
		lambdaStr.showString("Hello lambda_1");
		showMyString(lambdaStr);
		
		PrintString reStr = returnString();
		reStr.showString("Hello ");
	}
	
	public static PrintString returnString() {
		return s -> System.out.println(s + "world");
	}
	
	public static void showMyString(PrintString p) {
		p.showString("Hello lmabda_2");
	}
}
