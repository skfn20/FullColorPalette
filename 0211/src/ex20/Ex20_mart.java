package ex20;

//����ǰ �ڳ�
interface ProductCorner {
	String cornerName = "����ǰ �ڳ�";
	void setProductItem(String...s);
	void getProductItem();
}

//���� �ڳ�
interface MeatCorner{
	String cornerName = "���� �ڳ�";
	void setMeatItem(String...s);
	void getMeatItem();
}

//�Ƿ� �ڳ�
interface ClothCorner{
	String cornerName = "�Ƿ� �ڳ�";
	void setClothItem(String...s);
	void getClothItem();
}

//���� Ŭ����
class HeadOffice{
	private String brandName = "Korea Mart";
	static int branchCount = 0;//���� ��
	
	public String getbrandName() {
		return this.brandName;
	}
	
	public static int getBranchCount() {
		return branchCount;
	}
	
	//��ǰ ���� ���� �޼ҵ�
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

// ��� ��ǰ ���
void display(HeadOffice branch){
	//branch1
	//instanceof : Ŭ������ �ν��Ͻ� ������ true/false�� �˷���
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
		songpaBranch.setMeatItem("�Ұ��", "�������", "�߰��");
		songpaBranch.getMeatItem();
		
		System.out.println(songpaBranch.getBranchCount());
		
		
		
	}

}
