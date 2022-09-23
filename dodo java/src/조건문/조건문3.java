package 조건문;

import java.util.Scanner;

public class 조건문3 {

	public static void main(String[] args) {
		//정수 한 개를 입력받아서, 그 수가 3의 배수인지 판단해보자.
	System.out.println("정수를 입력하세요. >");
	Scanner sc = new Scanner(System.in);
	int i = sc.nextInt();
	if(i%3==0){
		System.out.println(+i+"는 3의 배수입니다.");
	}
	System.out.println(+i+ "는 3의 배수가 아닙니다.");

	}

}
