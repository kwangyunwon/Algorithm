package Section2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class test12 {

	public static void main(String[] args) throws IOException {
		 
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		
		int N = Integer.parseInt(st.nextToken());
		int M = Integer.parseInt(st.nextToken());
		
		int[][] exam = new int[M][N];
		int count = 0;
		
		for(int i = 0; i < M; i++) {
			st = new StringTokenizer(br.readLine(), " ");
			for(int j = 0; j < N; j++) {
				exam[i][j] = Integer.parseInt(st.nextToken());
			}
		}
		
		for(int i = 1; i <= N; i++) {
			for(int j = 1 ; j <= N; j++) {
				int cnt = 0;
				for(int k = 0; k < M; k++) {
					int pi = 0; 
					int pj = 0;
					for(int l = 0; l < N; l++) {
						if(exam[k][l] == i) pi = l;
						if(exam[k][l] == j) pj = l;
					}
					if(pi < pj) cnt++;
				}
				if(cnt == M) count++;
			}
		}
		System.out.println(count);
		
	}

}
