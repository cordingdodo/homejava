package homework;

import java.util.Scanner;

public class for문4 {

	public static void main(String[] args) {
		//0부터 20까지 출력해보자.
		for(int i=0;i<=20;i++){
			System.out.println(i);
		}
		System.out.println();
		System.out.println("******************");
		//0부터 90까지 10단위로 출력해보자.ex. 0, 10, 20, 30, .. , 80, 90
		for(int i=0;i<=90;i+=10){
			System.out.println(i);
			System.out.println();
			System.out.println("******************");
		//0부터 10까지 모두 더한 값을 출력해보자.
			int tot=0;
		for(int a=0;a<=10;a++){
			tot+=a;
			System.out.println(tot);
			//숫자를 5번 입력받고, 입력받을 때마다 더해지는 식을 작성해보자.  
			System.out.println();
			System.out.println("******************");
			System.out.println("숫자를 입력하세요>");
			Scanner sc = new Scanner(System.in);
			
			int sum=0;
			for(int b=0;b<10;b++){
				System.out.print("숫자 5개를 입력하세요:");
				int num=sc.nextInt();
				sum+=num;
				System.out.println("출력:" +sum);
			}
			
		}
		}
		

	    

	}

}
