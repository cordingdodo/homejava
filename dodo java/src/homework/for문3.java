package homework;

import java.util.Scanner;

public class for문3 {

	public static void main(String[] args) {
		//두 수를 입력받은 후 작은 수~큰 수 사이의 모든 수의 합을 구하는 프로그램을 작성하시오.
	Scanner sc = new Scanner(System.in);
		System.out.println("첫 번째 정수를 입력하시오.");
		int num1 = sc.nextInt();
		System.out.println("두 번째 정수를 입력하시오.");
		int num2 = sc.nextInt();
		
		int sum = 0;
		int max = 0;
		int min = 0;
		
		if(num1>num2){
			max = num1;
			min = num2;
	} else if (num1<num2){
			max = num2;
			min = num1;
	} else {
		System.out.println("잘못 입력하셨습니다.");
		return;
	}
	for (int i=min; i<=max;i++){
		sum += i;
	}
	System.out.printf(+min+"에서" +max+"까지의 합: "+sum);
		}
	}


