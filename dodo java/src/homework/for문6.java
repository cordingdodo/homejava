package homework;

import java.util.Scanner;

public class for문6 {

	public static void main(String[] args) {
//1900년대 태어난 남자 1    /    2000년대 태어난 남자  3  1900년대 태어난 여자 2/2000년대 태어난 여자 4
		System.out.println("1900년대 태어난 남자 1/2000년대 태어난 남자 3/1900년대 태어난 여자 2/2000년대 태어난 여자 4 숫자를입력하시오:>");
		Scanner sc = new Scanner(System.in);
		int y=sc.nextInt();
		switch (y){
		case 1: case 3:
			System.out.println("당신은 남자입니다.");
			break;
		case 2: case 4:
			System.out.println("당신은 여자입니다.");
			break;
		default:
			System.out.println("잘못 입력하셨습니다.");

		}
		
	}

}
