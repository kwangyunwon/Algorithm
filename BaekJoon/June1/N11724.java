package june1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class N11724 {
	static int N, M;
	static int[][] array;
	static boolean [] visit;
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		
		N = Integer.parseInt(st.nextToken());
		M = Integer.parseInt(st.nextToken());
		
		array = new int[N + 1][N + 1];
		visit = new boolean[N + 1];
		
		int count = 0;
		
		for(int i = 0; i < M; i++) {
			st = new StringTokenizer(br.readLine(), " ");
			int u = Integer.parseInt(st.nextToken());
			int v = Integer.parseInt(st.nextToken());
			
			array[u][v] = array[v][u] = 1;
		}
		for(int i = 1; i <= N; i++) {
			if(!visit[i]) {
				DFS(i);
				count++;
			}
		}
		
		System.out.println(count);
		
		br.close();
		
	}
	
	public static void DFS(int n) {
		visit[n] = true;
		
		for(int i = 1; i <= N; i++) {
			if(array[n][i] == 1 && !visit[i]) {
				DFS(i);
			}
		}
	}
}
