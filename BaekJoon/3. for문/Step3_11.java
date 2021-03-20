package three;

import java.util.Scanner;

/*
 * 정수 N개로 이루어진 수열 A와 정수 X가 주어진다. 이때, A에서 X보다 작은 수를 모두 출력하는 프로그램을 작성하시오.
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
