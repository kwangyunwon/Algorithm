package seven;

import java.util.Scanner;

/*
 * N���� ���ڰ� ���� ���� �����ִ�. �� ���ڸ� ��� ���ؼ� ����ϴ� ���α׷��� �ۼ��Ͻÿ�.
 */
public class Step7_2 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int N = scan.nextInt();
		String str = scan.next();
		
		int [] array = new int[N];
		int sum = 0;
		
		for(int i = 0; i < N; i++) {
			array[i] = str.charAt(i) - 48;
		}
		
		for(int i : array) sum += i;
		System.out.println(sum);

	}

}
