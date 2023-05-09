package chapter03;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class CommonElement {

	public static void main(String[] args) {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		
		try {
			int[] array1 = new int[Integer.parseInt(br.readLine())];
			
			st = new StringTokenizer(br.readLine(), " ");
			
			for(int i = 0; i < array1.length; i++) {
				array1[i] = Integer.parseInt(st.nextToken());
			}
			
			int[] array2 = new int[Integer.parseInt(br.readLine())];
			
			st = new StringTokenizer(br.readLine(), " ");
			
			for(int i = 0; i < array2.length; i++) {
				array2[i] = Integer.parseInt(st.nextToken());
			}
			
			Arrays.sort(array1);
			Arrays.sort(array2);
			
			int idx = 0;
			
			for(int i = 0; i < array1.length; i++) {
				for(int j = idx; j < array2.length; j++) {
					if(array1[i] == array2[j]) {
						System.out.print(array1[i] + " ");
						idx = j;
						break;
					}
				}
			}
			
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

}
