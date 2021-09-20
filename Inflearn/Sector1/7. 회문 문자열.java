package test;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class test7 {

	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		String str = br.readLine();
		
		str = str.toLowerCase();
		
		System.out.println(Palindrome(str));
		
	}
	
	public static String Palindrome(String str) {
		String answer = "YES";
		int lt = 0;
		int rt = str.length() - 1;
		while(lt < rt) {
			if(str.charAt(lt) != str.charAt(rt)) {
				answer = "NO";
				break;
			}
			lt++;
			rt--;
		}
		return answer;
	}

}
