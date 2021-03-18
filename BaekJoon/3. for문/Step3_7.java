package three;
/*
 * 두 정수 A와 B를 입력받은 다음, A+B를 출력하는 프로그램을 작성하시오.
 */
import java.util.Scanner;

public class Step3_7 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		int N = scan.nextInt();
		int a, b;
		
		for(int i = 1 ; i <= N; i++) {
			a = scan.nextInt();
			b = scan.nextInt();
			System.out.println("Case #" + i + ": " + (a+b));
		}

	}

}
