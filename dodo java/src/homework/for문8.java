package homework;

public class for문8 {

	public static void main(String[] args) {
		// for문을 이용해서 1부터 100까지의 정수 중에서 3의 배수를 구하시오
		for(int i=0;i<=100;i+=3){
			System.out.println(i);

		}
		System.out.println();
		System.out.println("**************");
		//for문을 이용해서 1부터 100까지의 정수 중에서 3의 배수총합을 구하는 코드를 작성하시오.
		int tot=0;
		for(int a=0;a<=100;a+=3){
			tot+=a;
		}
			System.out.println("3의 배수의 합:" +tot);
			System.out.println();
			System.out.println("**************");			
		int sum=0;
		for(int b=1;b<=100;b++){
			if(b%3==0){
			sum+=b;
			
		}
		
		}
		System.out.println("3의 배수의 합 2:" +sum);
	}
}


