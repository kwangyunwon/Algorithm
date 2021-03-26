package five;

import java.util.Scanner;

/*
 * �� ���� �ڿ��� A, B, C�� �־��� �� A �� B �� C�� ����� ����� 0���� 9���� ������ ���ڰ� �� ���� ���������� ���ϴ� ���α׷��� �ۼ��Ͻÿ�.
 * ���� ��� A = 150, B = 266, C = 427 �̶�� A �� B �� C = 150 �� 266 �� 427 = 17037300 �� �ǰ�, 
 * ����� ��� 17037300 ���� 0�� 3��, 1�� 1��, 3�� 2��, 7�� 2�� ������.
 */
public class Step5_3 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int[] array = {0, 0, 0, 0, 0, 0, 0, 0, 0, 0};
		int num = 1;
		num *= scan.nextInt() * scan.nextInt() * scan.nextInt();
		
		for(int i = num; i > 0; i /= 10) {
			switch(i % 10) {
			case 0 : array[0]++;
			break;
			case 1 : array[1]++;
			break;
			case 2 : array[2]++;
			break;
			case 3 : array[3]++;
			break;
			case 4 : array[4]++;
			break;
			case 5 : array[5]++;
			break;
			case 6 : array[6]++;
			break;
			case 7 : array[7]++;
			break;
			case 8 : array[8]++;
			break;
			default : array[9]++;
			break;
			}
		}
		
		for(int i : array) System.out.println(i);
	}

}
