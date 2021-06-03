package june1;

import java.util.Scanner;

public class test {
	
	static int M, N, K;
	
	static int[][] loc;
	static boolean[][] visit;
	
	static int[] dx = {-1, 1, 0, 0};
	static int[] dy = {0, 0, -1, 1};

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int T = scan.nextInt();
		int x, y;
		
		for(int i = 0; i < T; i++) {

			M = scan.nextInt();
			N = scan.nextInt();
			K = scan.nextInt();
			
			loc = new int[M][N];
			visit = new boolean[M][N];
			
			for(int j = 0; j < K; j++) {
	
				loc[scan.nextInt()][scan.nextInt()] = 1;
			}
			
			int cnt = 0;
			
			for(int j = 0; j < M; j++) {
				for(int k = 0; k < N; k++) {
					if(loc[j][k] == 1 && !visit[j][k]) {
						DFS(j, k);
						cnt++;
					}
				}
			}
			System.out.println(cnt);
			
		}

	}
	
	public static void DFS(int x, int y) {
		visit[x][y] = true;
		
		for(int i = 0; i < 4; i++) {
			int xx = x + dx[i];
			int yy = y + dy[i];
			
			if(xx >= 0 && yy >= 0 && xx < M && yy < N) {
				if(loc[xx][yy] == 1 && !visit[xx][yy]) {
					DFS(xx, yy);
				}
			}
		}
	}
}
