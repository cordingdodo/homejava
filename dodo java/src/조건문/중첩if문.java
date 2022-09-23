package 조건문;

import java.util.Scanner;

public class 중첩if문 {

	public static void main(String[] args) {
		//if문  사용하여 점수에 따른 학점 판별 -> 점수에 대한 학점 문자열로 저장
		//A 90~100 B 80~89 C 70~79 D 60~69 나머지 F
		//단 0~100 사이가 아닐 경우는 "점수입력오류!"출력
		System.out.println("점수를 입력하세요. >");
		Scanner sc = new Scanner(System.in);
		int score=sc.nextInt();
		String grade="";
		
	if(0<=score && score<=100){
		if(score>=90){
			grade = "A";
		}else if(score >=80 && score<=89){
			grade = "B";
		}else if(score >=70 && score<=79){
			grade = "C";
		}else if(score >=60 && score<=69){
			grade = "D";
		}else {
			grade = "F";
		}
		System.out.println(score+ "점의 학점 :" +grade);
	} else {
		System.out.println(score+ ": 점수 입력 오류!");
	}

	}
	
}
