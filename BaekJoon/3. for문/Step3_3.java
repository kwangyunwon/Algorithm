package three;

import java.util.Scanner;

/*
 * n�� �־����� ��, 1���� n���� ���� ���ϴ� ���α׷��� �ۼ��Ͻÿ�.
 */
public class Step3_3 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int N = scan.nextInt();
		int sum = 0;
		
		for(int i = 1; i <= N; i++) {
			sum += i;
		}
		
		System.out.println(sum);
	}

}
