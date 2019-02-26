package generic;

class Generics<K, V>{
	private K key;
	private V value;
	
	public K getKey() {
		return key;
	}
	
	public void setKey(K key) {
		this.key = key;
	}
	
	public V getValue() {
		return value;
	}
	
	public void setValue(V value) {
		this.value = value;
	}
	
	@Override
	public String toString() {
		return "Generics [key=" + key + ", value = " + value + "]";
	}
}

public class GenericEx01 {
	public static void main(String[] args) {
		//학생 정보를 저장하는 인스턴스
		Generics<Integer, String> std = new Generics<>();
		std.setKey(1);	//int형 변수를 넣을 수는 없다. 
		//왜냐하면 generic에는 객체형만 들어갈 수 있으므로 integer형으로 넣어주어야한다.
		std.setValue("홍길동");
		
		System.out.println("[" + std.getKey() + "]");
		System.out.println("[" + std.getValue() + "]");
	}
}
