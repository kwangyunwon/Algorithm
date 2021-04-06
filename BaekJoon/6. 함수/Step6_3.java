package six;

import java.util.Scanner;

/*
 * 어떤 양의 정수 X의 각 자리가 등차수열을 이룬다면, 그 수를 한수라고 한다. 등차수열은 연속된 두 개의 수의 차이가 일정한 수열을 말한다. N이 주어졌을 때, 1보다 크거나 같고, N보다 작거나 같은 한수의 개수를 출력하는 프로그램을 작성하시오. 
 */
public class Step6_3 {
	
	public static boolean calculation(int n) {
		int [] arrayA = new int[4];
		int [] arrayB = new int[4];
		int i;
		boolean result = false;
		for (i = 0; n > 0; i++) {
			arrayA[i] = n % 10;
			n /= 10;
		}
		
		for(int j = 0; j < i - 1; j++) arrayB[j] = arrayA[j] - arrayA[j + 1];
		
		for(int k = 0; k < i - 2; k++) {
			if(arrayB[k] == arrayB[k + 1]) result = true;
			else result = false;
		}
		
		return result;
	}
	
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int N = scan.nextInt();
		int count = 0;
		
		for(int i = 1; i <= N; i++) {
			if(i < 100) {
				count++;
			}
			else {
				if(calculation(i)) count++; 
			}
		}
		
		System.out.println(count);

	}

}
