package brute_force;

import java.util.Scanner;

/*
 * 자연수 n에 대해 n ≥ 1의 삼각수Tn는 명백한 공식이 있다.
 * Tn = 1 + 2 + 3 + ... + n = n(n+1)/2
 * 1796년, 가우스는 모든 자연수가 최대 3개의 삼각수의 합으로 표현될 수 있다고 증명하였다. 예를 들어,
 *  4 = T1 + T2
 *  5 = T1 + T1 + T2
 *  6 = T2 + T2 or 6 = T3
 * 10 = T1 + T2 + T3 or 10 = T4
 * 자연수가 주어졌을 때, 그 정수가 정확히 3개의 삼각수의 합으로 표현될 수 있는지 없는지를 판단해주는 프로그램을 만들어라. 
 * 단, 3개의 삼각수가 모두 달라야 할 필요는 없다.
 */
public class N10448 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int test = scan.nextInt();
		int N;
		int [] T = new int[45];
		T[0] = 1;
		int cnt = 2;
		
		for(int i = 1; i < 45; i++) {
			T[i] = T[i - 1] + cnt;
			cnt++;
		}
		
		for(int i = 0; i < test; i++) {
			N = scan.nextInt();
			int answer = 0;	
			for(int j = 0; j < 45; j++) {
				for(int k = 0; k < 45; k++) {
					for(int l = 0; l < 45; l++) {
						if(N == T[j] + T[k] + T[l]) {
							answer = 1;
							break;
						}
					}
				}
			}
			
			System.out.println(answer);
			
		}
		
	}

}
