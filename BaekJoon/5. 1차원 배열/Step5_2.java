package five;

import java.util.Scanner;

/*
 * 9���� ���� �ٸ� �ڿ����� �־��� ��, �̵� �� �ִ��� ã�� �� �ִ��� �� ��° �������� ���ϴ� ���α׷��� �ۼ��Ͻÿ�.
 */
public class Step5_2 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int[] array = new int[9];
		int index = 0;
		
		for(int i = 0; i < 9; i++) {
			array[i] = scan.nextInt();
		}
		
		int max = 0;
		
		for(int i = 0; i < 9; i++) {
			if(array[i] > max) {
				max = array[i];
				index = i + 1;
			}
		}
		System.out.println(max);
		System.out.println(index);
	}

}
