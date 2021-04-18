package eight;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/*
 * �̿� ���� ������ �м����� 1/1 -> 1/2 -> 2/1 -> 3/1 -> 2/2 -> �� �� ���� ������� ������ ���ʴ�� 1��, 2��, 3��, 4��, 5��, �� �м���� ����.
 * X�� �־����� ��, X��° �м��� ���ϴ� ���α׷��� �ۼ��Ͻÿ�.
 */
public class Step8_3 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int X = Integer.parseInt(br.readLine());
		
		int n = 0;
		int sum = 0;
		
		while(sum < X) {
			n++;
			sum += n;
		}
		
		if(n % 2 == 0) {
			System.out.println(X - sum + n + "/" + (sum - X + 1));
		}
		else {
			System.out.println((sum - X + 1) + "/" + (X - sum + n));
		}
		
		br.close();

	}

}
