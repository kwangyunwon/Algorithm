package chapter03;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class PlusTwoArray {

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
			
			int[] array3 = new int[array1.length + array2.length];
			
			System.arraycopy(array1, 0, array3, 0, array1.length);
			System.arraycopy(array2, 0, array3, array1.length, array2.length);
			
			Arrays.sort(array3);
			
			for(int i = 0; i < array3.length; i++) {
				System.out.print(array3[i] + " ");
			}
			
		} catch (IOException e) {
			e.printStackTrace();
		}

	}

}
