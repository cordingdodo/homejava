package homework;

import java.util.Scanner;

public class for문7 {

	public static void main(String[] args) {
		//영희가 은행에 500원(원금)을 입금했다. 하루에 1원씩 이자가 붙는다. 
		//5일 후(일수) 잔액은 얼마가 되어 있을까?
		
		int money=500;
		for(int m=0;m<5;m++){
			money++;
		}
		System.out.println("영희의 잔액은 :"  +money);
		
		//위의 문제에서 원금과 예치 일수를 입력받아 처리해보자
		Scanner sc = new Scanner(System.in);
		System.out.println("원금과 예치 일수를 입력하세요:");
		int m=sc.nextInt();
		int d=sc.nextInt();
		
		for(int i=0;i<d;i++){
			m+=i;
			System.out.println(d+ "일 이후의 잔액은" +m+ "원 입니다.");
			
			sc.close();
		}
		
		}

	}


