package five;

import java.util.Scanner;

/*
 * "OOXXOXXOOO"와 같은 OX퀴즈의 결과가 있다. O는 문제를 맞은 것이고, X는 문제를 틀린 것이다. 
 * 문제를 맞은 경우 그 문제의 점수는 그 문제까지 연속된 O의 개수가 된다. 
 * 예를 들어, 10번 문제의 점수는 3이 된다.
 * "OOXXOXXOOO"의 점수는 1+2+0+0+1+0+0+1+2+3 = 10점이다.
 * OX퀴즈의 결과가 주어졌을 때, 점수를 구하는 프로그램을 작성하시오.
 */
public class Step5_6 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int N = scan.nextInt();
		String[] str = new String[N];
		int sum = 0;
		int count = 1;
		for(int i = 0; i < N; i++) {
			str[i] = scan.next();
		}
		
		char[][] array = new char[N][80];
		
		for(int i = 0; i < N; i++) {
			for(int j = 0; j < str[i].length(); j++) {
				array[i][j] = str[i].charAt(j);
			}
		}
		
		for(int i = 0; i < N; i++) {
			
			for(int j = 0; j < str[i].length(); j++) {
				if(array[i][j] == 'O') {
					if(array[i][j] == array[i][j + 1]) {
						count++;
						sum += count;
					}
					else {
						sum++;
					}
				}
				else {
					count = 1;
				}
			}
			System.out.println(sum);
			sum = 0;
			count = 1;
		}
		
	}

}
