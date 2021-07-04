package june5;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class N1976 {

	static int[] p;
	
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		
		int N = Integer.parseInt(br.readLine());
		int M = Integer.parseInt(br.readLine());
		
		p = new int[N + 1];
		
		for(int i = 1; i <= N; i++) {
			p[i] = i;
		}
		
		for(int i = 1; i <= N; i++) {
			st = new StringTokenizer(br.readLine(), " ");
			for(int j = 1; j <= N; j++) {
				int num = Integer.parseInt(st.nextToken());
				if(num == 1) merge(i, j);
			}
		}
		
		st = new StringTokenizer(br.readLine(), " ");
		
		int start = find(Integer.parseInt(st.nextToken()));
		boolean flag = true;
		
		for(int i = 1; i < M; i++) {
			int end = find(Integer.parseInt(st.nextToken()));
			if(start != end) {
				flag = false;
				break;
			}
			start = end;
		}
		
		if(flag) System.out.println("YES");
		else System.out.println("NO");
	}
	
	public static void merge(int a, int b) {
		a = find(a);
		b = find(b);
		if(a == b) return;
		p[b] = a;
	}
	
	public static int find(int n) {
		if(n == p[n]) return n;
		p[n] = find(p[n]);
		return p[n];
	}

}
