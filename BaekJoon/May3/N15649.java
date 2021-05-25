package may3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class N15649 {
	
	static int [] array;
	static boolean [] check;

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		int N = Integer.parseInt(st.nextToken());
		int M = Integer.parseInt(st.nextToken());
		
		array = new int [M];
		check = new boolean[N + 1];
		
		recur(N, M, 0);
		
		br.close();
	}
	
	public static void recur(int N, int M, int index) {
		if(index == M) {
			for(int i = 0; i < M; i++) {
				System.out.print(array[i] + " ");
			}
			System.out.println();
			return;
		}
		
		for(int i = 1; i <= N; i++) {
		
			if(!check[i]) {
				check[i] = true;
				array[index] = i;
				recur(N, M, index + 1);
				check[i] = false;
			}
		}
	}
}
