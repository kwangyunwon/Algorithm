package eight;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/*
 * 이와 같이 나열된 분수들을 1/1 -> 1/2 -> 2/1 -> 3/1 -> 2/2 -> … 과 같은 지그재그 순서로 차례대로 1번, 2번, 3번, 4번, 5번, … 분수라고 하자.
 * X가 주어졌을 때, X번째 분수를 구하는 프로그램을 작성하시오.
 */
public class Step8_3 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int X = Integer.parseInt(br.readLine());
		
		int n = 0;
		int sum = 0;
		
		while(sum < X) {
			n++;
			sum += n;
		}
		
		if(n % 2 == 0) {
			System.out.println(X - sum + n + "/" + (sum - X + 1));
		}
		else {
			System.out.println((sum - X + 1) + "/" + (X - sum + n));
		}
		
		br.close();

	}

}
