package five;

import java.util.Scanner;
/*
 * �� �ڿ��� A�� B�� ���� ��, A%B�� A�� B�� ���� ������ �̴�. ���� ���, 7, 14, 27, 38�� 3���� ���� �������� 1, 2, 0, 2�̴�. 
 * �� 10���� �Է¹��� ��, �̸� 42�� ���� �������� ���Ѵ�. �� ���� ���� �ٸ� ���� �� �� �ִ��� ����ϴ� ���α׷��� �ۼ��Ͻÿ�.
 */
public class Step5_4 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int [] arrayA = new int[10];
		int [] arrayB = new int[10];
		int result = 0;
		for(int i = 0; i < 10; i++) {
			arrayA[i] = scan.nextInt();
			arrayB[i] = arrayA[i] % 42;
		}
		
		for(int i = 0; i < 10; i++) {
			for(int j = i + 1; j <10; j++) {
				if(arrayB[i] == arrayB[j]) arrayB[j] = -1;
			}
		}
		
		for(int i = 0; i < 10; i++) {
			if(arrayB[i] != -1) result++;
		}
		
		System.out.println(result);
	}

}
