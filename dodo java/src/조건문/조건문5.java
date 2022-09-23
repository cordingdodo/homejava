package 조건문;

import java.util.Scanner;

public class 조건문5 {

	public static void main(String[] args) {
		// 사용자로부터 세 개의 정수를 입력받아,
//		수들의 최대값과 최소값, 합계와 평균을 구해보자.
		System.out.println("정수 3개를 입력하세요>");
		Scanner sc = new Scanner(System.in);
		int a=sc.nextInt();
		int b=sc.nextInt();
		int c=sc.nextInt();
		int tot=a+b+c;
		double avg=3/tot;
		
		int max=a;
		int min=a;
		
		if(b>max) max = b;
		if(c>max) max = c;
		
		if(b<min) min = b;
		if(c<min) min = c;
		
		System.out.println("최댓값은" +max+ "최솟값은" +min+ "입니다.");
		
		

		
		

		

	}

}
//