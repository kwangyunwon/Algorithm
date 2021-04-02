package brute_force;

import java.util.Scanner;

/*
 * N개의 정수로 이루어진 수열이 있을 때, 크기가 양수인 부분수열 중에서 그 수열의 원소를 다 더한 값이 S가 되는 경우의 수를 구하는 프로그램을 작성하시오.
 */
public class N1182 {

	static int N, S;
	static int count = 0;
	static int [] Array;
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		N = scan.nextInt();
		S = scan.nextInt();
		Array = new int[N];
		
		for(int i = 0; i < N; i++) {
			Array[i] = scan.nextInt();
		}
		
		solution(0, 0);
		
		if(S == 0) {
			count--;
			System.out.println(count);
		}
		else {
			System.out.println(count);
		}

	}
	
	public static void solution(int index, int value) {
		if(index == N) {
			if(value == S) {
				count++;
			}
			return;
		}
		
		solution(index + 1, value + Array[index]);
		solution(index + 1, value);
	}

}
