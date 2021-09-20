package test;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class test8_2 {

	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		String str = br.readLine();

		System.out.println(Palindrome(str));
	}
	
	public static String Palindrome(String str) {
		
		str = str.toLowerCase().replaceAll("[^a-z]", "");
		System.out.println(str);
		String tmp = new StringBuilder(str).reverse().toString();
		
		if(str.equals(tmp)) return "YES";
		else return "NO";
	}

}
