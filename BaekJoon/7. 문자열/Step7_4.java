package seven;

import java.util.Scanner;

/*
 * ���ڿ� S�� �Է¹��� �Ŀ�, �� ���ڸ� R�� �ݺ��� �� ���ڿ� P�� ���� �� ����ϴ� ���α׷��� �ۼ��Ͻÿ�. 
 * ��, ù ��° ���ڸ� R�� �ݺ��ϰ�, �� ��° ���ڸ� R�� �ݺ��ϴ� ������ P�� ����� �ȴ�. S���� QR Code "alphanumeric" ���ڸ� ����ִ�.
 * QR Code "alphanumeric" ���ڴ� 0123456789ABCDEFGHIJKLMNOPQRSTUVWXYZ\$%*+-./: �̴�.
 */
public class Step7_4 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int N = scan.nextInt();
		int num;
		String str;
		
		for(int i = 0; i < N; i++) {
			num = scan.nextInt();
			str = scan.next();
			for(int j = 0; j < str.length(); j++) {
				for(int k = 0; k < num; k++) {
					System.out.print(str.charAt(j));
				}
			}
			System.out.println();
		}

	}

}
