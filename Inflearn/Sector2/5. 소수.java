package Sector2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class test5 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
			
		int N = Integer.parseInt(br.readLine());
		boolean flag = true;
		
		int[] array = new int[N + 1];
		int count = 0;
		
		for(int i = 2; i <= N; i++) {
			if(array[i] == 0) {
				count++;
				for(int j = i; j <= N; j += i) array[j] = 1;
			}
		}
		
		System.out.println(count);

	}

}
