package seven;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Step7_7 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		int x = Integer.parseInt(st.nextToken());
		int y = Integer.parseInt(st.nextToken());
		
		int a, b;
		a = ((x % 10) * 100) + ((x % 100) - (x % 10)) + (x / 100);
		b = ((y % 10) * 100) + ((y % 100) - (y % 10)) + (y / 100);
		
		if(a > b) System.out.println(a);
		else System.out.println(b);
		
		br.close();
	}

}
