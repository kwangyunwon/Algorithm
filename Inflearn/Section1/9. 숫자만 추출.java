package test;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class test9 {

	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		String str = br.readLine();
		
		System.out.println(toInteger(str));
	}
	
	public static int toInteger(String str) {
		
		str = str.replaceAll("[^0-9]", "");
		
		return Integer.parseInt(str);
	}

}
