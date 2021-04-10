package encore.algorithm;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class DFSandBFS {
	static int N, M, V;
	static boolean [] visit;
	static int [][] graph;

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		
		N = Integer.parseInt(st.nextToken());
		M = Integer.parseInt(st.nextToken());
		V = Integer.parseInt(st.nextToken());
		
		graph = new int[N + 1][N + 1];
		visit = new boolean[N + 1];
		
		int start, end;
		
		for(int i = 0; i < M; i++) {
			st = new StringTokenizer(br.readLine(), " ");
			start = Integer.parseInt(st.nextToken());
			end = Integer.parseInt(st.nextToken());
			graph[start][end] = graph[end][start] = 1;
		}
		
		DFS(V);
		System.out.println();
		reset();
		BFS(V);
		
		
	}
	
	public static void reset() {
		for(int i = 1; i <= N; i++) {
			visit[i] = false;
		}
	}
	
	public static void DFS(int n) {
		visit[n] = true;
		System.out.print(n + " ");
		
		for(int i = 1; i <= N; i++) {
			if(graph[n][i] == 1 && !visit[i]) {
				DFS(i);
			}
		}
	}
	
	public static void BFS(int n) {
		Queue<Integer> q = new LinkedList<Integer>();
		q.offer(n);
		visit[n] = true;
		
		while(!q.isEmpty()) {
			int a = q.poll();
			System.out.print(a + " ");
			for(int i = 1; i <= N; i++) {
				if(graph[a][i] == 1 && !visit[i]) {
					q.offer(i);
					visit[i] = true;
				}
			}
		}
	}

}
