package ten;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/*
 * 0���� ũ�ų� ���� ���� N�� �־�����. �̶�, N!�� ����ϴ� ���α׷��� �ۼ��Ͻÿ�.
 */
public class Step10_1 {
	static int num = 1;
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int N = Integer.parseInt(br.readLine());
		
		System.out.println(factorial(N));
		
		br.close();
		
	}
	
	public static int factorial(int n) {
		if(n == 0 || n == 1) {
			return num;
		}
		num *= n;
		return factorial(n - 1);
	}

}
