package newproject;

public class SubCompany1 extends MainCompany implements ArgCorner, ProductCorner{
	
	public void setProduct(String...s) {
		int i = 0;
		for(String item : s) {
			items[i] = item;
			i++;
		} 
	}
	public void getProduct() {
		for(String item : items)
			System.out.println(item);
	}
	
	public static void main(String[] args) {
		SubCompany1 songpa = new SubCompany1();
		
		songpa.setProduct("me", "na", "he", "ga");
		songpa.getProduct();
	}
}
