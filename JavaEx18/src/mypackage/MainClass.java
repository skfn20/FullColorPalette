package mypackage;

public class MainClass {

	public static void main(String[] args) {
		String str = "JAVA";
		str +="_8";
		
		System.out.println(str);
	
		StringBuffer sf = new StringBuffer("Java");
		sf.append("_8");
		
		System.out.println(sf.length());
		sf.insert(sf.length()-3, "---");
		System.out.println(sf);
		sf.delete(3, 6);
		System.out.println(sf);
		
		StringBuilder sb = new StringBuilder("Java World!!");
		System.out.println(sb);
		sb.append("hi");
		System.out.println(sb );
	}
}
