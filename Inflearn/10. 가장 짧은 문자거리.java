package test;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class test10 {

	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		
		String str = st.nextToken();
		char alpha = st.nextToken().charAt(0);
		
		for(int i : minDistance(str, alpha)) System.out.print(i + " ");
	}
	
	public static int[] minDistance(String str, char c) {
		int[] array = new int[str.length()];
		
		int p = 1000;
		
		for(int i = 0; i < str.length(); i++) {
			if(str.charAt(i) == c) p = 0;
			else p++;
			array[i] = p;
		}
		
		p = 1000;
		
		for(int i = str.length() - 1; i >= 0; i--) {
			if(str.charAt(i) == c) p = 0;
			else p++;
			if(array[i] > p) array[i] = p;
		}
		
		return array;
	}

}
