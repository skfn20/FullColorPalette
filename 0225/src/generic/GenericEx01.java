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
		//�л� ������ �����ϴ� �ν��Ͻ�
		Generics<Integer, String> std = new Generics<>();
		std.setKey(1);	//int�� ������ ���� ���� ����. 
		//�ֳ��ϸ� generic���� ��ü���� �� �� �����Ƿ� integer������ �־��־���Ѵ�.
		std.setValue("ȫ�浿");
		
		System.out.println("[" + std.getKey() + "]");
		System.out.println("[" + std.getValue() + "]");
	}
}
