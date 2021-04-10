package encore.algorithm;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class Virus {
	static int computer, connection;
	static int [][] network;
	static boolean[] visit;
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		
		computer = Integer.parseInt(br.readLine());
		connection = Integer.parseInt(br.readLine());
		
		network = new int[computer + 1][computer + 1];
		visit = new boolean[computer + 1];
		int start, end;
		
		for(int i = 0; i < connection; i++) {
			st = new StringTokenizer(br.readLine(), " ");
			start = Integer.parseInt(st.nextToken());
			end = Integer.parseInt(st.nextToken());
			network[start][end] = network[end][start] = 1;
		}
		System.out.println(BFS(1));
		br.close();
		
	}
	
	public static int BFS(int n) {
		Queue<Integer> q = new LinkedList<Integer>();
		q.offer(n);
		visit[n] = true;
		int count = 0;
		
		while(!q.isEmpty()) {
			int a = q.poll();
			for(int i = 1; i <= computer; i++) {
				if(network[a][i] == 1 && !visit[i]) {
					count++;
					q.offer(i);
					visit[i] = true;
				}
			}
		}
		return count;
	}

}
