package five;

import java.util.Scanner;

/*
 * 9개의 서로 다른 자연수가 주어질 때, 이들 중 최댓값을 찾고 그 최댓값이 몇 번째 수인지를 구하는 프로그램을 작성하시오.
 */
public class Step5_2 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int[] array = new int[9];
		int index = 0;
		
		for(int i = 0; i < 9; i++) {
			array[i] = scan.nextInt();
		}
		
		int max = 0;
		
		for(int i = 0; i < 9; i++) {
			if(array[i] > max) {
				max = array[i];
				index = i + 1;
			}
		}
		System.out.println(max);
		System.out.println(index);
	}

}
