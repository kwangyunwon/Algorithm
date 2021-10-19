package test;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class test2 {
	
	public static String solution(String str) {
		String str2 = "";
		
		for(char c : str.toCharArray()) {
			if(c >= 97 && c <= 122) str2 += (char)(c - 32);
			else str2 += (char)(c + 32);	
		}
		
		return str2;
	}

	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		String str = br.readLine();
		
		System.out.println(solution(str));
		
	}

}