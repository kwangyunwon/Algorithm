package test;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class test1 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		String str = br.readLine().toLowerCase();
		
		char c = Character.toLowerCase((char)br.read());
		
		int count = 0;
		
		for(int i = 0; i < str.length(); i++) {
			if(c == str.charAt(i)) {
				count++;
			}
		}
		
		System.out.println(count);
		
		br.close();

	}

}
