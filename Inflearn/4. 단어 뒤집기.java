package test;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class test4 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int N = Integer.parseInt(br.readLine());
		
		for(int i = 0; i < N; i++) {
			System.out.println(reverse(br.readLine()));
		}
		
	}
	
	public static String reverse(String str) {
		String reverseStr = "";
		for(int i = str.length() - 1; i >= 0; i--) {
			reverseStr += str.charAt(i);
		}
		return reverseStr;
	}

}
