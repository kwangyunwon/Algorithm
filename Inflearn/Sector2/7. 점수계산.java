package Sector2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class test7 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int N = Integer.parseInt(br.readLine());
		
		int[] array = new int[N];
		int[] array2 = new int[N];
		
		int sum = 0;
		
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		
		for(int i = 0; i < N; i++) {
			array[i] = array2[i] = Integer.parseInt(st.nextToken());
		}
		
		for(int i = 0; i < N; i++) {
			if(array[i] == 1) {
				if(i == array.length - 1) {
					sum+= array2[i];
					break;
				}
				if(array[i] == array[i + 1]) {
					array2[i + 1] = array2[i] + 1;
				}
			}
			sum += array2[i];
		}
		
		System.out.println(sum);

	}

}
