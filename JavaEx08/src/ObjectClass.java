
public class ObjectClass {
	
	public String name;
	public int[] iArr;
	
	public ObjectClass(String n, int[] iArr) {
		System.out.println("-- Object Class constructor --");
		this.name = n;
		this.iArr = iArr;
	}
	
	protected void finalize() throws Throwable{
		System.out.println("-- finalize() method --");
		
		super.finalize();
	}
}
