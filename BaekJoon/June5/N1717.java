package june5;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class N1717 {
	
	static int[] p;

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		
		int n = Integer.parseInt(st.nextToken());
		int m = Integer.parseInt(st.nextToken());
		
		p = new int[n + 1];
		
		for(int i = 0; i <= n; i++) {
			p[i] = i;
		}
		
		for(int i = 0; i < m; i++) {
			st = new StringTokenizer(br.readLine(), " ");
			int op = Integer.parseInt(st.nextToken());
			int a = Integer.parseInt(st.nextToken());
			int b = Integer.parseInt(st.nextToken());
			
			if(op == 0) merge(a, b);
			else {
				if(find(a) == find(b)) System.out.println("YES");
				else System.out.println("NO");
			}
		}
		
		br.close();

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
