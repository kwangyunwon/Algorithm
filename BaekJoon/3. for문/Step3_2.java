package three;

import java.util.Scanner;

/*
 * �� ���� A�� B�� �Է¹��� ����, A+B�� ����ϴ� ���α׷��� �ۼ��Ͻÿ�.
 */
public class Step3_2 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int N = scan.nextInt();
		int a, b;
		
		for(int i = 0; i < N; i++) {
			a = scan.nextInt();
			b = scan.nextInt();
			System.out.println(a + b);
		}

	}

}
