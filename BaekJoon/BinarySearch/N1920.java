package may2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class N1920 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int N = Integer.parseInt(br.readLine());
		int [] A = new int[N];
		
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		
		for(int i = 0; i < N; i++) {
			A[i] = Integer.parseInt(st.nextToken());
		}
		
		Arrays.sort(A);
		
		int M = Integer.parseInt(br.readLine());
		int [] B = new int[M];
		
		StringTokenizer st2 = new StringTokenizer(br.readLine(), " ");
		
		for(int i = 0; i < M; i++) {
			System.out.println(binarySearch(A, 0, A.length - 1, Integer.parseInt(st2.nextToken())));
		}
		
		br.close();
	}
	
	public static int binarySearch(int [] array, int start, int end, int n) {
		int mid = (start + end) / 2;
		if(start > end) return 0;
		if(n == array[mid]) return 1;
		else if(n > array[mid]) return binarySearch(array, mid + 1, end, n);
		else return binarySearch(array, start, mid - 1, n);
	}
}
