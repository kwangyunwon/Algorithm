package one;

import java.util.Scanner;

/*
 * (�� �ڸ� ��) �� (�� �ڸ� ��)�� ������ ���� ������ ���Ͽ� �̷������.
 *       4 7 2 -- (1)
 *     x 3 8 5 -- (2)
 * -----------
 *     2 3 6 0 -- (3)
 *   3 7 7 6   -- (4)
 * 1 4 1 6     -- (5)
 * -----------
 * 1 8 1 7 2 0 -- (6)
 * (1)�� (2)��ġ�� �� �� �ڸ� �ڿ����� �־��� �� (3), (4), (5), (6)��ġ�� �� ���� ���ϴ� ���α׷��� �ۼ��Ͻÿ�.
 */
public class Eleven {

	public static void main(String[] args) {
		int a = 0;
		int b = 0;
		int c[] = new int[3];
		Scanner scan = new Scanner(System.in);
		a = scan.nextInt();
		b = scan.nextInt();
		c[0] = b / 100;
		c[1] = (b - c[0] * 100) / 10;
		c[2] = (b - c[0] * 100) - c[1] * 10;
		System.out.println(a * c[2]);
		System.out.println(a * c[1]);
		System.out.println(a * c[0]);
		System.out.println(a * b);
	}

}
