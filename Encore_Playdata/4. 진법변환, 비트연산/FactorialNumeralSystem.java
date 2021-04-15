package encore.algorithm;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class FactorialNumeralSystem {
	static int sum;
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		while(true) {
			String str = br.readLine();
			if(Integer.parseInt(str) == 0) {
				break;
			}
			int len = str.length();
			int[] array = new int[len];
			int j = 0;
			int result = 0;
			
			for(int i = len - 1; i >= 0; i--) {
				array[i] = str.charAt(j) - 48;
				j++;
			}
			
			for(int i = 0; i < len; i++) {
				sum = 1;
				result += array[i] * factorial(i + 1);
			}
			System.out.println(result);
		}
		br.close();
		
	}
	
	public static int factorial(int n) {
		
		if(n == 0 || n == 1) {
			return sum;
		}
		sum *= n;
		return factorial(n - 1);
	}

}
