package homework;

import java.util.Scanner;

public class for문1 {
//구구단
	public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
		System.out.println("정수 입력 : >");
		int num = sc.nextInt();
		if(num>=1||num<=9){
			for(int i=1;i<=9;i++)
				System.out.println(num + "*" + i + "=" + num * i);
	}else {
		
		System.out.println("1~9 사이의 양수를 하나 입력하세요 :>");
}

}
}
