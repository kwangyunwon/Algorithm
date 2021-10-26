package Section2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class test11 {

	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int N = Integer.parseInt(br.readLine());
		
		int[][] table = new int[N][5];
		int max = Integer.MIN_VALUE;
		int maxIdx = 0;
		
		StringTokenizer st;
		
		for(int i = 0; i < N; i++) {
			st = new StringTokenizer(br.readLine(), " ");
			for(int j = 0; j < 5; j++) {
				table[i][j] = Integer.parseInt(st.nextToken());
			}
		}
		
		for(int i = 0; i < N; i++) {
			int cnt = 0;
			for(int j = 0; j < N; j++) {
				for(int k = 0; k < 5; k++) {
					if(table[i][k] == table[j][k]) {
						cnt++;
						break;
					}
				}
			}
			if(cnt > max) {
				max = cnt;
				maxIdx = i + 1;
			}
		}
		
		System.out.println(maxIdx);

	}

}
