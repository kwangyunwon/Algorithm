package seven;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Step7_8 {

	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String str = br.readLine();
		
		int result = 0;
		
		for (int i = 0; i < str.length(); i++) {
			if (((str.charAt(i) - 64) >= 1) && ((str.charAt(i) - 64) <= 3)) {
				result += 3;
			}
			else if (((str.charAt(i) - 64) >= 4) && ((str.charAt(i) - 64) <= 6)) {
				result += 4;
			}
			else if (((str.charAt(i) - 64) >= 7) && ((str.charAt(i) - 64) <= 9)) {
				result += 5;
			}
			else if (((str.charAt(i) - 64) >= 10) && ((str.charAt(i) - 64) <= 12)) {
				result += 6;
			}
			else if (((str.charAt(i) - 64) >= 13) && ((str.charAt(i) - 64) <= 15)) {
				result += 7;
			}
			else if (((str.charAt(i) - 64) >= 16) && ((str.charAt(i) - 64) <= 19)) {
				result += 8;
			}
			else if (((str.charAt(i) - 64) >= 20) && ((str.charAt(i) - 64) <= 22)) {
				result += 9;
			}
			else if (((str.charAt(i) - 64) >= 23) && ((str.charAt(i) - 64) <= 26)) {
				result += 10;
			}
		}
		
		System.out.println(result);
		br.close();

	}

}
