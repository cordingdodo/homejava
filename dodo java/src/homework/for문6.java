package homework;

import java.util.Scanner;

public class for��6 {

	public static void main(String[] args) {
//1900��� �¾ ���� 1    /    2000��� �¾ ����  3  1900��� �¾ ���� 2/2000��� �¾ ���� 4
		System.out.println("1900��� �¾ ���� 1/2000��� �¾ ���� 3/1900��� �¾ ���� 2/2000��� �¾ ���� 4 ���ڸ��Է��Ͻÿ�:>");
		Scanner sc = new Scanner(System.in);
		int y=sc.nextInt();
		switch (y){
		case 1: case 3:
			System.out.println("����� �����Դϴ�.");
			break;
		case 2: case 4:
			System.out.println("����� �����Դϴ�.");
			break;
		default:
			System.out.println("�߸� �Է��ϼ̽��ϴ�.");

		}
		
	}

}
