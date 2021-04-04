package seven;

import java.util.Scanner;

/*
 * N개의 숫자가 공백 없이 쓰여있다. 이 숫자를 모두 합해서 출력하는 프로그램을 작성하시오.
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
