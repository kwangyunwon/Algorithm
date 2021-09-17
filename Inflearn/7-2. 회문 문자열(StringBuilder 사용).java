package test;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class test7_2 {

	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		String str = br.readLine();
		
		str = str.toLowerCase();
		
		System.out.println(Palindrome(str));
		
	}
	
	public static String Palindrome(String str) {
		
		String tmp = new StringBuilder(str).reverse().toString();
		
		if(str.equalsIgnoreCase(tmp)) return "YES";
		else return "NO";
			
	}

}
