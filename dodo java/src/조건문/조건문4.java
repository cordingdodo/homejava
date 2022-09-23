package 조건문;

import java.util.Scanner;

public class 조건문4 {

	public static void main(String[] args) {
//		//리아 초등학교에서 1학년부터 4학년까지 중간고사 시험을 보았다. 
//	    4학년은 70점 이상이면 합격, 그 이외의 학년은 60점 이상이면 합격이다. 
//	    이를 판단하는 프로그램을 작성해보자.
	
	System.out.println("학년을 입력하세요. >");
	System.out.println("중간고사 성적을 입력하세요. >");
	Scanner sc = new Scanner(System.in);
	int grade=sc.nextInt();
	int score=sc.nextInt();

	if (grade==4){
		if(score>70){
			System.out.println("합격입니다.");
		}
		System.out.println("떨어졌습니다 ㅠㅠ");
	} 
	if (grade<=3){
		if(score>=60){
			System.out.println("합격입니다.");
		} else {
			System.out.println("떨어졌습니다 ㅠㅠ");
		}
	 }
	 }
	} 
	



