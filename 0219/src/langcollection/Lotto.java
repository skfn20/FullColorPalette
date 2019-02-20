package langcollection;

import java.util.Arrays;

public class Lotto {
	
	private int[] lottoNo = new int[6];
	private double randNo;
	private static int count = 100;
	private int lottoweekNo;
	
	public Lotto() {
		int index = 0;
		while(index < lottoNo.length) {
			randNo = Math.random() * 45 + 1;
			int num = (int)Math.floor(randNo);
			if(checkOver(index, num, lottoNo)) {
				lottoNo[index++] = num;
			}
		}
		sort(lottoNo);
		lottoweekNo = count;
		count++;
	}
	
	public static boolean checkOver(int i, int num, int[] arr) {
		for(int j = 0; j < i; j++) {
			if(arr[j] == num) return false;
		}
		
		return true;
	}
	
	public int getlottoweekNo() {
		return lottoweekNo;
	}
	
	static void sort(int array[]) 
    { 
        for (int i = 1; i < array.length; i++) 
        { 
            int x = array[i]; 
  
            int j = Math.abs(Arrays.binarySearch(array, 0, i, x) + 1); 
  
            System.arraycopy(array, j, array, j+1, i-j); 
  
            array[j] = x; 
        } 
    } 
	
	public void showLottoNo() {
		System.out.print(lottoweekNo + "회차 Lotto 당첨 번호는 ");
		
		for(int i = 0; i < lottoNo.length; i++) {
			if(i < 5)
				System.out.print(lottoNo[i] + ", ");
			else
				System.out.println(lottoNo[i] + "입니다.");
		}
	}
	
	public static void main(String[] args) {
		//1 ~ 45까지의 숫자 중 6개의 번호를 골라내서 당첨번호를 만드는 프로그램 
			Lotto mylotto = new Lotto();
			mylotto.showLottoNo();
		
	}
}
