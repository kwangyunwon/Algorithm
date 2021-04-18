package ten;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/*
 * 0보다 크거나 같은 정수 N이 주어진다. 이때, N!을 출력하는 프로그램을 작성하시오.
 */
public class Step10_1 {
	static int num = 1;
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int N = Integer.parseInt(br.readLine());
		
		System.out.println(factorial(N));
		
		br.close();
		
	}
	
	public static int factorial(int n) {
		if(n == 0 || n == 1) {
			return num;
		}
		num *= n;
		return factorial(n - 1);
	}

}
