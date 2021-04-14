package seven;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/*
 * �׷� �ܾ�� �ܾ �����ϴ� ��� ���ڿ� ���ؼ�, �� ���ڰ� �����ؼ� ��Ÿ���� ��츸�� ���Ѵ�. ���� ���, ccazzzzbb�� c, a, z, b�� ��� �����ؼ� ��Ÿ����, kin�� k, i, n�� �����ؼ� ��Ÿ���� ������ �׷� �ܾ�������, aabbbccb�� b�� �������� ��Ÿ���� ������ �׷� �ܾ �ƴϴ�.
 * �ܾ� N���� �Է����� �޾� �׷� �ܾ��� ������ ����ϴ� ���α׷��� �ۼ��Ͻÿ�.
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
