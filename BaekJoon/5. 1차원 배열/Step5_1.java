package five;

import java.util.Scanner;

/*
 * N���� ������ �־�����. �̶�, �ּڰ��� �ִ��� ���ϴ� ���α׷��� �ۼ��Ͻÿ�.
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
