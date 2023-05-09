package chapter03;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class ContinuousSubsequence {

	public static void main(String[] args) {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		
		int sum = 0;
		int cnt = 0;
		
		try {
			st = new StringTokenizer(br.readLine(), " ");
			int N = Integer.parseInt(st.nextToken());
			int M = Integer.parseInt(st.nextToken());
			
			int[] array = new int[N];
			
			st = new StringTokenizer(br.readLine(), " ");
			
			for(int i = 0; i < N; i++) {
				array[i] = Integer.parseInt(st.nextToken());
			}
			
			for(int i = 0; i < N; i++) {
				for(int j = i; j < N; j++) {
					sum += array[j];
					
					if(sum == M) {
						cnt++;
						break;
					}else if(sum > M) {
						break;
					}
				}
				sum = 0;
			}
			
			System.out.println(cnt);
			
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

}
