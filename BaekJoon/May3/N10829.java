package may3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class N10829 {
	
	static Stack<Integer> stack = new Stack<Integer>();
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		long N = Long.parseLong(br.readLine());
		
		if(N == 0) System.out.println(0);
		else {
			Calc(N);
			while(!stack.isEmpty()) System.out.print(stack.pop());
		}
		
		br.close();
		
	}
	
	public static long Calc(long n) {
		if(n == 0) {
			return 0;
		}
		stack.push((int) (n % 2));
		return Calc(n / 2);
	}

}
