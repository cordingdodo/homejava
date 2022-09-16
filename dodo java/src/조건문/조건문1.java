package 조건문;

import java.util.Scanner;

public class 조건문1 {

	public static void main(String[] args) {
		//if..else와 프롬프트 대화상자를 사용해 사용자로부터 숫자 하나를 입력받고, 
		//아래 조건에 따라 그 결과를 alert 창에 출력해 보세요.
	Scanner sc = new Scanner(System.in);
	int i = sc.nextInt();
	System.out.println("숫자 하나를 입력하시오>");
	if(i==0){
		System.out.println("0");
	}
	if(i>0){
		System.out.println("1");
		
	}
	if(i<0){
		System.out.println("-1");
	}
	}

}
