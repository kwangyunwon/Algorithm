package three;

import java.util.Scanner;

/*
 * N�� �Է¹��� ��, ������ N���� ����ϴ� ���α׷��� �ۼ��Ͻÿ�. ��� ���Ŀ� ���缭 ����ϸ� �ȴ�.
 */
public class Step3_1 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int N = scan.nextInt();
		
		for(int i = 1; i <= 9; i++) {
			System.out.println(N + " * " + i + " = " + (N * i));
		}

	}

}
