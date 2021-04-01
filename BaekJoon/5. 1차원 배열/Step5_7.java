package five;

import java.util.Scanner;

/*
 * ���л� ��������� 90%�� �ڽ��� �ݿ��� ����� �Ѵ´ٰ� �����Ѵ�. ����� �׵鿡�� ���� ������ �˷���� �Ѵ�.
 * �� ���̽����� �� �پ� ����� �Ѵ� �л����� ������ �ݿø��Ͽ� �Ҽ��� ��° �ڸ����� ����Ѵ�.
 */
public class Step5_7 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int[] array;
		
		int testcase = scan.nextInt();
		
		for(int i = 0 ; i < testcase ; i++) {
 
			int N = scan.nextInt(); 
			array = new int[N];
			
			double sum = 0; 

			for(int j = 0 ; j < N ; j++) {
				int score = scan.nextInt();
				array[j] = score;
				sum += score; 
			}
			
			double avg = (sum / N) ;
			double count = 0;

			for(int j = 0 ; j < N ; j++) {
				if(array[j] > avg) {
					count++;
				}
			}
			
			System.out.printf("%.3f%%\n",(count/N)*100);
			
		}

	}
	
}
