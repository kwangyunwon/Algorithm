package june4;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Collections;
import java.util.PriorityQueue;

public class N11279 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		
		PriorityQueue<Integer> queue = new PriorityQueue<Integer>(Collections.reverseOrder());
		
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
