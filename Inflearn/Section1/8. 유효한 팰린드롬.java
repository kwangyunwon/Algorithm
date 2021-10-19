package test;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class test8 {

	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		String str = br.readLine();
		
		str = str.toLowerCase();

		System.out.println(Palindrome(str));
	}
	
	public static String Palindrome(String str) {
		
		int lt = 0;
		int rt = str.length() - 1;
		
		while(lt < rt) {
			if(!Character.isAlphabetic(str.charAt(lt))) lt++;
			else if(!Character.isAlphabetic(str.charAt(rt))) rt--;
			else {
				if(str.charAt(lt) != str.charAt(rt)) return "NO";
				else {
					lt++;
					rt--;
				}
			}
		}
		
		return "YES";
	}

}
