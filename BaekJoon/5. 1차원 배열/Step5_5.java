package five;

import java.util.Scanner;

/*
 * �����̴� �⸻��縦 ���ƴ�. �����̴� ������ �����ؼ� ���� ��������� �ߴ�. �ϴ� �����̴� �ڱ� ���� �߿� �ִ��� �����. 
 * �� ���� M�̶�� �Ѵ�. �׸��� ���� ��� ������ ����/M*100���� ���ƴ�.
 * ���� ���, �������� �ְ����� 70�̰�, ���������� 50�̾����� ���������� 50/70*100�� �Ǿ� 71.43���� �ȴ�.
 * �������� ������ ���� ������ ���� ������� ��, ���ο� ����� ���ϴ� ���α׷��� �ۼ��Ͻÿ�.
 */
public class Step5_5 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int N = scan.nextInt();
		double max = 0;
		double sum = 0;
		double [] array = new double[N];
		double [] array2 = new double[N];
		
		for(int i = 0; i < N; i++) {
			array[i] = scan.nextInt();
			if(array[i] > max) max = array[i];
		}
		for(int i = 0; i < N; i++) {
			array2[i] = array[i] / max * 100;
			sum += array2[i];
		}
		
		System.out.println(sum / N);
		
	}

}
