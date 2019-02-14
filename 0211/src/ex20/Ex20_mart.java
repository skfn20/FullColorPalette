package ex20;

//공산품 코너
interface ProductCorner {
	String cornerName = "공산품 코너";
	void setProductItem(String...s);
	void getProductItem();
}

//정육 코너
interface MeatCorner{
	String cornerName = "정육 코너";
	void setMeatItem(String...s);
	void getMeatItem();
}

//의류 코너
interface ClothCorner{
	String cornerName = "의류 코너";
	void setClothItem(String...s);
	void getClothItem();
}

//본사 클래스
class HeadOffice{
	private String brandName = "Korea Mart";
	static int branchCount = 0;//지점 수
	
	public String getbrandName() {
		return this.brandName;
	}
	
	public static int getBranchCount() {
		return branchCount;
	}
	
	//상품 저장 공통 메소드
	//call_by_ref 
	void setItem(String[] item, String...s) {
		for(int i = 0; i < s.length; i++) {
			item[i] = s[i];
		}
	}
	
	void getItem(String[] item) {
		for(int i = 0; i < item.length; i++) {
			if(item[i] == null) break;
			System.out.println(item[i]);
		}
	}
}

class SubCompany1 extends HeadOffice implements ProductCorner, MeatCorner{
	private String[] meat 		= new String[10];
	private String[] product 	= new String[10];
	
	public SubCompany1() {
		branchCount++;
	}
	
	@Override 
	public void setProductItem(String...s) {
		setItem(product, s);
	}
	
	@Override 
	public void getProductItem() {
		getItem(product);
	}
	
	@Override 
	public void setMeatItem(String...s) {
		setItem(meat, s);
	}
	
	
	@Override 
	public void getMeatItem() {
		getItem(meat);
	}
	
}

// 모든 상품 출력
void display(HeadOffice branch){
	//branch1
	//instanceof : 클래스의 인스턴스 형인지 true/false로 알려줌
	if(branch instanceof Branch1){
		sysout(ProductCorner.cornerName);
		Branch1 mybranch = branch;
		((Branch1)branch).get... //down casting
	}
	//branch2
	else if(branch instanceof Branch2){
	
	}
}

public class Ex20_mart {
	public static void main(String[] args) {
		SubCompany1 songpaBranch = new SubCompany1();
		
		songpaBranch.setProductItem("ha", "na", "da", "ba");
		songpaBranch.getProductItem();
		songpaBranch.setMeatItem("소고기", "돼지고기", "닭고기");
		songpaBranch.getMeatItem();
		
		System.out.println(songpaBranch.getBranchCount());
		
		
		
	}

}
