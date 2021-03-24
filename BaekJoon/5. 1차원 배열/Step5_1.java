package five;

import java.util.Scanner;

/*
 * N개의 정수가 주어진다. 이때, 최솟값과 최댓값을 구하는 프로그램을 작성하시오.
 */
public class Step5_1 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int N = scan.nextInt();
		int[] array = new int[N];
		
		for(int i = 0; i < N; i++) array[i] = scan.nextInt();
		
		int max = array[0];
		int min = array[0];
		
		for(int i = 1; i < N; i++) {
			if(array[i] >= max) max = array[i];
			if(array[i] <= min) min = array[i];
		}
		System.out.println(min + " " + max);

	}

}
