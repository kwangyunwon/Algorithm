package june4;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.PriorityQueue;

public class N1927 {
	
	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		
		PriorityQueue<Integer> queue = new PriorityQueue<Integer>();
		
		for(int i = 0; i < N; i++) {
			int X = Integer.parseInt(br.readLine());
			
			if(X == 0) {
				if(queue.isEmpty()) System.out.println("0");
				else System.out.println(queue.poll());
			}
			else {
				queue.add(X);
			}
		}
		
		br.close();
		
	}
	
}
