package five;

import java.util.Scanner;

/*
 * 세 개의 자연수 A, B, C가 주어질 때 A × B × C를 계산한 결과에 0부터 9까지 각각의 숫자가 몇 번씩 쓰였는지를 구하는 프로그램을 작성하시오.
 * 예를 들어 A = 150, B = 266, C = 427 이라면 A × B × C = 150 × 266 × 427 = 17037300 이 되고, 
 * 계산한 결과 17037300 에는 0이 3번, 1이 1번, 3이 2번, 7이 2번 쓰였다.
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
