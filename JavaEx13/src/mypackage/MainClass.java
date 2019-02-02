package mypackage;

import mypackage.OuterClass.SinnerClass;

public class MainClass {
	
	public static void main(String[] args) {
		OuterClass oc = new OuterClass();
		System.out.println("oc.num : " + oc.num);
		System.out.println("oc.str1 : " + oc.str1  );
		
		System.out.println();
		
		OuterClass.InnerClass in = oc.new InnerClass();
		System.out.println(in.num);
		System.out.println(in.str2);
		
		OuterClass.SinnerClass si = new OuterClass.SinnerClass();
		System.out.println(si.num);
		System.out.println(si.str3);
		
		
	}
	

}
