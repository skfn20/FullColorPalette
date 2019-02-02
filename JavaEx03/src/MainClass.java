import java.util.Arrays;
import java.util.Scanner;

public class MainClass {
public static void main(String[] args) {
	System.out.println("Hi");
	System.out.println(5 >3 ? 2 : 1);
	int x= 3;
	if(x==3)
		System.out.println("Your right!!");
	
	int y = 20;
	
	System.out.println("x > y : " +(x > y)); 
	
	int[] arr1 = new int[5];
	for(int i = 0; i<5; i++) {
		arr1[i]=0;
	}
		
	System.out.println("arr1.length : " + arr1.length);
	System.out.println("arr1 : " + Arrays.toString(arr1));
	System.out.println("arr1 : " + arr1);
	
	int[] arr2={1, 2, 3, 4, 5};
	
	arr2 = Arrays.copyOf(arr1,  arr1.length);
	System.out.println("arr2 : " + Arrays.toString(arr2));
	System.out.println("arr2 : " + arr2);

	int[][] arrMul = new int[3][2];
	arrMul[0][0] = 10;
	arrMul[0][1] = 100;
	arrMul[1][0] = 20;
	arrMul[1][1] = 300;
	arrMul[2][0] = 30;
	arrMul[2][1] = 200;
	
	System.out.println("arrMul : " + Arrays.toString(arrMul));
	System.out.println("arrMul[0] : " + Arrays.toString(arrMul[0]));
	
	String[] name = {"박찬호", "이승엽", "박병호"};
	int[] score = new int[3];
	Scanner scanner = new Scanner(System.in);
	System.out.printf("%s의 점수를 입력하세요 : ", name[0]);
	score[0] = scanner.nextInt();
	
	System.out.printf("%s의 점수를 입력하세요 : ", name[1]);
	score[1] = scanner.nextInt();
	
	System.out.printf("%s의 점수를 입력하세요 : ", name[2]);
	score[2] = scanner.nextInt();
	
	double avg=0;
	
	for(int i = 0; i<3; i++) {
		System.out.printf("%s 점수 : %d\n", name[i], score[i]);
		avg += (double)score[i];
	}
	scanner.close();
	
	avg = avg /3.0;
	
	System.out.printf("전체 학생의 평균은 %f입니다. \n", avg);
	
}
}
