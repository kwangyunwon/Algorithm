package five;

import java.util.Scanner;

/*
 * "OOXXOXXOOO"�� ���� OX������ ����� �ִ�. O�� ������ ���� ���̰�, X�� ������ Ʋ�� ���̴�. 
 * ������ ���� ��� �� ������ ������ �� �������� ���ӵ� O�� ������ �ȴ�. 
 * ���� ���, 10�� ������ ������ 3�� �ȴ�.
 * "OOXXOXXOOO"�� ������ 1+2+0+0+1+0+0+1+2+3 = 10���̴�.
 * OX������ ����� �־����� ��, ������ ���ϴ� ���α׷��� �ۼ��Ͻÿ�.
 */
public class Step5_6 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int N = scan.nextInt();
		String[] str = new String[N];
		int sum = 0;
		int count = 1;
		for(int i = 0; i < N; i++) {
			str[i] = scan.next();
		}
		
		char[][] array = new char[N][80];
		
		for(int i = 0; i < N; i++) {
			for(int j = 0; j < str[i].length(); j++) {
				array[i][j] = str[i].charAt(j);
			}
		}
		
		for(int i = 0; i < N; i++) {
			
			for(int j = 0; j < str[i].length(); j++) {
				if(array[i][j] == 'O') {
					if(array[i][j] == array[i][j + 1]) {
						count++;
						sum += count;
					}
					else {
						sum++;
					}
				}
				else {
					count = 1;
				}
			}
			System.out.println(sum);
			sum = 0;
			count = 1;
		}
		
	}

}
