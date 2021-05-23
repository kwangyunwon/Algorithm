package may3;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class N11729 {
	
	static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
	
	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int N = Integer.parseInt(br.readLine());
		
		int K = (int) (Math.pow(2, N) - 1);
		
		bw.write(K + "\n");
		
		Hanoi(N, 1, 2, 3);
		
		bw.flush();
		bw.close();
		br.close();
	}
	
	public static void Hanoi(int N, int A, int B, int C) throws IOException {
		if(N == 0) {
			return;
		}
		Hanoi(N - 1, A, C, B);
		bw.write(A + " " + C + "\n");
		Hanoi(N - 1, B, A, C);
	}
}
