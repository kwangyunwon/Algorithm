package june4;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Comparator;
import java.util.PriorityQueue;

public class N11286 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		
		PriorityQueue<Integer> queue = new PriorityQueue<Integer>(new Comparator<Integer>() {

			@Override
			public int compare(Integer o1, Integer o2) {
				if(Math.abs(o1) > Math.abs(o2) || (Math.abs(o1) == Math.abs(o2) && o1 > o2)) {
					return 1; //우선순위 낮음
				}
				else {
					return -1; //우선순위 높음
				}
			}
		});
		
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
