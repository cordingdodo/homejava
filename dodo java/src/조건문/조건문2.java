package 조건문;

import java.util.Scanner;

public class 조건문2 {
	public static void main(String[] args) {
//정수 한 개를 입력받아서, 그 수가 50 이상의 수인지 50미만의 수인지 판단해보자.
	System.out.println("정수를 입력하세요.");
	Scanner sc = new Scanner(System.in);
	int i = sc.nextInt();
	if (i>50){
		System.out.println("50 이상의 수입니다.");
	} else if (i<50){
		System.out.println("50 미만의 수입니다.");
	}
	System.out.println();
	System.out.println();
	System.out.println();
	

	
}
}
