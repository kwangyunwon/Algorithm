package test;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class test1 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		String str = br.readLine();
		
		String word = "";
		String longWord = "";
		
		int start = 0;
		int i = 0;
		
		for(i = 0; i < str.length(); i++) {
			if(str.charAt(i) == ' ') {
				word = str.substring(start, i);
				start = i + 1;
				if(word.length() > longWord.length()) {
					longWord = word;
				}
			}
		}
		word = str.substring(start, str.length());
		if(word.length() > longWord.length()) {
			longWord = word;
		}
		
		System.out.println(longWord);
	}

}
