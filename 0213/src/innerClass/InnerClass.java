package innerClass;

//stack --> local variables, 매개변수
//heap --> instance
//data --> static variables, static 

class Outer{
	static int a= 10;
	int b = 20;
	static class Sinner{};
	class Inner{};
}

public class InnerClass {
	public static void main(String[] args) {
		Outer.Sinner os = new Outer.Sinner();
		Outer out = new Outer();
		Outer.Inner is = out.new Inner();
		
	}
}
