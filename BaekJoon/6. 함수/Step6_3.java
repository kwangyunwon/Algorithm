package six;

import java.util.Scanner;

/*
 * � ���� ���� X�� �� �ڸ��� ���������� �̷�ٸ�, �� ���� �Ѽ���� �Ѵ�. ���������� ���ӵ� �� ���� ���� ���̰� ������ ������ ���Ѵ�. N�� �־����� ��, 1���� ũ�ų� ����, N���� �۰ų� ���� �Ѽ��� ������ ����ϴ� ���α׷��� �ۼ��Ͻÿ�. 
 */
public class Step6_3 {
	
	public static boolean calculation(int n) {
		int [] arrayA = new int[4];
		int [] arrayB = new int[4];
		int i;
		boolean result = false;
		for (i = 0; n > 0; i++) {
			arrayA[i] = n % 10;
			n /= 10;
		}
		
		for(int j = 0; j < i - 1; j++) arrayB[j] = arrayA[j] - arrayA[j + 1];
		
		for(int k = 0; k < i - 2; k++) {
			if(arrayB[k] == arrayB[k + 1]) result = true;
			else result = false;
		}
		
		return result;
	}
	
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int N = scan.nextInt();
		int count = 0;
		
		for(int i = 1; i <= N; i++) {
			if(i < 100) {
				count++;
			}
			else {
				if(calculation(i)) count++; 
			}
		}
		
		System.out.println(count);

	}

}
