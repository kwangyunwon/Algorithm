package may2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.StringTokenizer;

public class N12738 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int N = Integer.parseInt(br.readLine());
		ArrayList<Integer> list = new ArrayList<Integer>();
		StringTokenizer st = new StringTokenizer(br.readLine());
		list.add(0);
		for(int i = 0; i < N; i++) {
			int num = Integer.parseInt(st.nextToken());
			
			if(list.get(list.size() - 1) < num) list.add(num);
			else {
				int start = 1;
				int end = list.size() - 1;
				
				while(start < end) {
					int mid = (start + end) / 2;
					
					if(list.get(mid) < num) {
						start = mid + 1;
					}
					else {
						end = mid;
					}
				}
				list.set(end, num);
			}
		}

		System.out.println(list.size() - 1);
		br.close();
	}

}
