package three;

import java.util.Scanner;

/*
 * ���� N���� �̷���� ���� A�� ���� X�� �־�����. �̶�, A���� X���� ���� ���� ��� ����ϴ� ���α׷��� �ۼ��Ͻÿ�.
 */
public class Step3_11 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int N = scan.nextInt();
		int X = scan.nextInt();
		int A;
		for(int i = 0; i < N; i++) {
			A = scan.nextInt();
			if(X > A) System.out.print(A + " ");
		}

	}

}
