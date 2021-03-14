package three;

import java.util.Scanner;

/*
 * 두 정수 A와 B를 입력받은 다음, A+B를 출력하는 프로그램을 작성하시오.
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
