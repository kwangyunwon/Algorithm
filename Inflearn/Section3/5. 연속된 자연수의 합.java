package chapter03;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class ContinuousNatural {

	public static void main(String[] args) {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int sum = 0;
		int cnt = 0;
		int mid = 0;
		
		try {
			int M = Integer.parseInt(br.readLine());
			
			mid = M % 2 == 0 ? M/2 : M/2 + 1;
									
			for(int i = 1; i <= mid; i++) {
				for(int j = i; j <= mid; j++) {
					sum += j;
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
