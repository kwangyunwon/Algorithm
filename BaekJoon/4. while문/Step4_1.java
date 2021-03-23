package four;

import java.util.Scanner;

/*
 * 두 정수 A와 B를 입력받은 다음, A+B를 출력하는 프로그램을 작성하시오.
 */
public class Step4_1 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int a, b;
		while(true) {
			a = scan.nextInt();
			b = scan.nextInt();
			if(a == 0 || b == 0) break;
			System.out.println(a + b);
		}
		
	}

}
