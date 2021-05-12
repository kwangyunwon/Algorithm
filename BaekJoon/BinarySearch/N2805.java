package may2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class N2805 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine()," ");
		int N = Integer.parseInt(st.nextToken());
		int M = Integer.parseInt(st.nextToken());
		int [] array = new int[N];
		
		StringTokenizer st2 = new StringTokenizer(br.readLine()," ");
		for(int i = 0; i < N; i++) {
			array[i] = Integer.parseInt(st2.nextToken());
		}
		Arrays.sort(array);
		
		long start = 0;
		long end = array[array.length - 1];
		
		while(start <= end) {
			long tree = 0;
			long mid = (start + end) / 2;
			for(int i = 0; i < N; i++) {
				if(array[i] > mid) {
					tree += array[i] - mid;
				}
			}
			
			if(tree >= M) {
				start = mid + 1;
			}
			else {
				end = mid - 1;
			}
		}
		
		System.out.println(end);
	}

}
