package Section2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class test9 {
	
	static int N;
	static int[][] matrix;
	
	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		N = Integer.parseInt(br.readLine());
		int rSum, cSum, dSum;
		int max = 0;
		matrix = new int[N][N];
		
		StringTokenizer st;
		for(int i = 0; i < N; i++) {
			st = new StringTokenizer(br.readLine(), " ");
			for(int j = 0; j < N; j++) {
				matrix[i][j] = Integer.parseInt(st.nextToken());
			}
		}
		
		rSum = rowSum();
		cSum = columnSum();
		dSum = diagonalSum();
		max = Math.max(max, rSum);
		max = Math.max(max, cSum);
		max = Math.max(max, dSum);
		
		System.out.println(max);
		
	}
	
	public static int rowSum() {
		int sum = 0;
		int max = 0;
		for(int i = 0; i < N; i++) {
			for(int j = 0; j < N; j++) {
				sum += matrix[i][j];
			}
			max = Math.max(max, sum);
			sum = 0;
		}
		return max;
	}
	
	public static int columnSum() {
		int sum = 0;
		int max = 0;
		for(int i = 0; i < N; i++) {
			for(int j = 0; j < N; j++) {
				sum += matrix[j][i];
			}
			max = Math.max(max, sum);
			sum = 0;
		}
		return max;
	}
	
	public static int diagonalSum() {
		int sum1 = 0;
		int sum2 = 0;
		int max = 0;
		for(int i = 0; i < N; i++) {
			for(int j = 0; j < N; j++) {
				if(i == j) sum1 += matrix[i][j];
				else continue;
			}
		}
		for(int i = N - 1; i >= 0; i--) {
			for(int j = N - 1; j >= 0; j--) {
				if(i == j) sum2 += matrix[i][j];
				else continue;
			}
		}
		max = Math.max(sum1, sum2);
		return max;
	}
	
	
}
