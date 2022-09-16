package homework;

public class for문2 {
	private static char[] a;

	public static void main(String[] args) {
		//반복문제
	for(int i=0;i<=5;i++){
		System.out.println(i+"번째의 반복문 수행");
	}
	System.out.println();
	System.out.println("************");
	//내림차순 반복문제
	for(int i=5;i>=1;i--){
		System.out.println(i+"번째의 반복문 수행");
	}
	System.out.println();
	System.out.println("************");
	
//	 1에서 10사이의 홀수만 출력하는 예제 
	for(int a=1;a<10;a+=2){
		System.out.println(a);
	}
}


	
}
