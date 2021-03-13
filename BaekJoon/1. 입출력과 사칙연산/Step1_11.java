package one;

import java.util.Scanner;

/*
 * (세 자리 수) × (세 자리 수)는 다음과 같은 과정을 통하여 이루어진다.
 *       4 7 2 -- (1)
 *     x 3 8 5 -- (2)
 * -----------
 *     2 3 6 0 -- (3)
 *   3 7 7 6   -- (4)
 * 1 4 1 6     -- (5)
 * -----------
 * 1 8 1 7 2 0 -- (6)
 * (1)과 (2)위치에 들어갈 세 자리 자연수가 주어질 때 (3), (4), (5), (6)위치에 들어갈 값을 구하는 프로그램을 작성하시오.
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
