package two;

import java.util.Scanner;

/*
 * �� ���� A�� B�� �־����� ��, A�� B�� ���ϴ� ���α׷��� �ۼ��Ͻÿ�.
 */
public class Step2_1 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int A = scan.nextInt();
		int B = scan.nextInt();
		
		if(A > B) System.out.println(">");
		else if( A < B) System.out.println("<");
		else System.out.println("==");
	}
}
