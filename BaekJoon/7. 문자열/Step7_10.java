package seven;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/*
 * 그룹 단어란 단어에 존재하는 모든 문자에 대해서, 각 문자가 연속해서 나타나는 경우만을 말한다. 예를 들면, ccazzzzbb는 c, a, z, b가 모두 연속해서 나타나고, kin도 k, i, n이 연속해서 나타나기 때문에 그룹 단어이지만, aabbbccb는 b가 떨어져서 나타나기 때문에 그룹 단어가 아니다.
 * 단어 N개를 입력으로 받아 그룹 단어의 개수를 출력하는 프로그램을 작성하시오.
 */
public class Step7_10 {
	
	public static void reset(boolean[] a) {
		for(int i = 0; i < a.length; i++) {
			a[i] = false;
		}
	}

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		String[] str = new String[N];
		
		boolean[] alpha = new boolean[26];
		int count = 0;
		boolean flag;
		reset(alpha);
		for(int i = 0; i < N; i++) {
			str[i] = br.readLine();
			flag = true;
			for(int j = 0; j < str[i].length(); j++) {
				if(alpha[str[i].charAt(j) - 97]) {
					if(str[i].charAt(j) != str[i].charAt(j - 1)) {
						flag = false;
						break;
					}
				}
				else {
					alpha[str[i].charAt(j) - 97] = true;
					
				}
			}
			if(flag) count++;
			reset(alpha);
		}
		
		System.out.println(count);
		
	}

}
