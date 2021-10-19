package Sector2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class test4 {

	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int N = Integer.parseInt(br.readLine());
		
		int[] array = new int[N];
		
		for(int i = 0; i < N; i++) {
			if(i > 1) array[i] = array[i - 1] + array[i - 2];
			else array[i] = 1;
			
			System.out.print(array[i] + " ");
		}
		
	}

}
