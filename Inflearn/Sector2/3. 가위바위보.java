package Sector2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class test3 {

	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int N = Integer.parseInt(br.readLine());
		
		
		int[] aArray = new int[N];
		int[] bArray = new int[N];
		
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		for(int i = 0; i < N; i++) aArray[i] = Integer.parseInt(st.nextToken());
		
		st = new StringTokenizer(br.readLine(), " ");
		for(int i = 0; i < N; i++) {
			bArray[i] = Integer.parseInt(st.nextToken());
			
			switch(aArray[i]) {
				case 1:
					switch(bArray[i]) {
						case 1: System.out.println("D");
						break;
						case 2: System.out.println("B");
						break;
						default: System.out.println("A");
					}
					break;
				case 2:
					switch(bArray[i]) {
						case 1: System.out.println("A");
						break;
						case 2: System.out.println("D");
						break;
						default: System.out.println("B");
					}
					break;
				default:
					switch(bArray[i]) {
						case 1: System.out.println("B");
						break;
						case 2: System.out.println("A");
						break;
						default: System.out.println("D");
					}
			}
		}

	}

}
