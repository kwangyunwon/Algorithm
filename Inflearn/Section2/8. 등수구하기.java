package Sector2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class test8 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int N = Integer.parseInt(br.readLine());
		int[] array = new int[N];
		int[] rank = new int[N];
		int count = 1;
		
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		
		for(int i = 0; i < N; i++) array[i] = Integer.parseInt(st.nextToken());
		
		for(int i = 0; i < N; i++) {
			for(int j = 0; j < N; j++) {
				
				if(array[i] < array[j]) {
					count++;
				}
				
			}
			rank[i] = count;
			count = 1;
		}
		
		for(int i : rank) System.out.print(i + " ");
		
	}

}
