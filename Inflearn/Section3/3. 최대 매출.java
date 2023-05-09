package chapter03;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class TopSales {

	public static void main(String[] args) {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		int max = 0;
		int sum = 0;
		
		try {
			st = new StringTokenizer(br.readLine(), " ");
			int N = Integer.parseInt(st.nextToken());
			int K = Integer.parseInt(st.nextToken());
			
			int[] array = new int[N];
			st = new StringTokenizer(br.readLine(), " ");
			
			for(int i = 0; i < N; i++) {
				array[i] = Integer.parseInt(st.nextToken());
				if(i < K) max += array[i];
			}
			
			sum = max;
			
			for(int i = 0; i < N; i++) {
				if(K + i >= N) break;
				
				sum -= array[i];
				sum += array[K + i];

				if(sum >= max) {
					max = sum;
				}
			}
	
			System.out.println(max);
			
		} catch (IOException e) {
			e.printStackTrace();
		}
	
	}

}
