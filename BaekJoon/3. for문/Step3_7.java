package three;
/*
 * �� ���� A�� B�� �Է¹��� ����, A+B�� ����ϴ� ���α׷��� �ۼ��Ͻÿ�.
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
