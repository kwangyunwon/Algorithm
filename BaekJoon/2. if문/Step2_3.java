package two;

import java.util.Scanner;

/*
 * ������ �־����� ��, �����̸� 1, �ƴϸ� 0�� ����ϴ� ���α׷��� �ۼ��Ͻÿ�.
 * ������ ������ 4�� ����̸鼭, 100�� ����� �ƴ� �� �Ǵ� 400�� ����� ���̴�.
 * ���� ���, 2012���� 4�� ����̸鼭 100�� ����� �ƴ϶� �����̴�.
 * 900���� 100�� ����̰� 400�� ����� �ƴϱ� ������ ������ �ƴϴ�.
 * ������, 2000���� 400�� ����̱� ������ �����̴�.
 */
public class Step2_3 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int leapYear = scan.nextInt();
		
		if(leapYear % 4 == 0) {
			if((leapYear % 100 != 0) || (leapYear % 400 == 0)) {
				System.out.println("1");
			}
			else System.out.println("0");
			
		}
		else System.out.println("0");
		

	}

}
