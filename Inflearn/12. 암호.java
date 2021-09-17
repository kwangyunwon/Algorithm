package test;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class test12 {

	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int N = Integer.parseInt(br.readLine());
		String str = br.readLine();
		
		str = str.replace('#', '1');
		str = str.replace('*', '0');
		
		for(int i = 0; i < N; i++) {
			System.out.print((char)Integer.parseInt(str.substring(i * 7, (i + 1) * 7), 2));
		}
	
	}

}
