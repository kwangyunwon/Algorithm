package eight;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/*
 * ���� �׸��� ���� ���������� �̷���� ������ �ִ�. �׸����� ���� �ٿ� ���� �߾��� �� 1���� �����ؼ� �̿��ϴ� �濡 ���ư��鼭 1�� �����ϴ� ��ȣ�� �ּҷ� �ű� �� �ִ�. 
 * ���� N�� �־����� ��, ������ �߾� 1���� N�� ����� �ּ� ������ ���� ������ �� �� �� ���� ���� ����������(���۰� ���� �����Ͽ�)�� ����ϴ� ���α׷��� �ۼ��Ͻÿ�. 
 * ���� ���, 13������ 3��, 58������ 5���� ������.
 */
public class Step8_2 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int N = Integer.parseInt(br.readLine());
		
		int n = 0;
		int home = 1;
		int count = 1;
		if(N == 1) {
			System.out.println(1);
		}
		else {
			while(true) {
				n += 6;
				home += n;
				count++;
				if(N <= home) {
					System.out.println(count);
					break;
				}
			}
		}
		
		br.close();
		
	}
	
}
