package 조건문;

import java.util.Scanner;

public class 조건문6 {

	public static void main(String[] args) {
		//돈(money) 5천원 이상일 경우 "택시 타기" 출력 미만일 경우 "버스 타기" 출력
	System.out.println("돈 잔액은? >");
	Scanner sc = new Scanner(System.in);
	int m=sc.nextInt();
	if(m>=5000){
		System.out.println("택시 타고 가기");
	}
	if(m<5000){
		System.out.println("버스 타고 가기");
	}
	System.out.println("집도착!!");

	}

}
