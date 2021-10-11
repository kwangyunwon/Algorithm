package Sector2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class test6 {
	
	static boolean[] primeArray;

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int N = Integer.parseInt(br.readLine());
		int[] array = new int[N];
		int max = 0;
		
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		for(int i = 0; i < N; i++) {
			String num = st.nextToken();
			int reverseNum = Integer.parseInt(new StringBuilder(num).reverse().toString());
			array[i] = reverseNum;
			max = Math.max(max, reverseNum);
		}
		
		primeArray = new boolean[max + 1];
		
		findPrime(max);
		
		for(int i : array) {
			if(primeArray[i] == false) System.out.println(i);
		}

	}
	
	public static void findPrime(int N) {
		primeArray[0] = primeArray[1] = true;
		
		if(N < 2) return;
		
		for(int i = 0; i < Math.sqrt(N); i++) {
			if(primeArray[i] == true) continue;
			
			for(int j = i * i; j <=  N; j+=i) {
				primeArray[j] = true;
			}
		}
	}

}
