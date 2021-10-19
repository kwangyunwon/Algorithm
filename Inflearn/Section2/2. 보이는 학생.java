package Sector2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class test2 {

	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int N = Integer.parseInt(br.readLine());
		
		int[] array = new int[N];
		int cnt = 0;
		int max = 0;
		
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		
		for(int i = 0; i < N; i++) {
			array[i] = Integer.parseInt(st.nextToken());
			if(array[i] > max) {
				max = array[i];
				cnt++;
			}
		}
		
		System.out.println(cnt);
	}

}
