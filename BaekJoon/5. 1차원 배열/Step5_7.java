package five;

import java.util.Scanner;

/*
 * 대학생 새내기들의 90%는 자신이 반에서 평균은 넘는다고 생각한다. 당신은 그들에게 슬픈 진실을 알려줘야 한다.
 * 각 케이스마다 한 줄씩 평균을 넘는 학생들의 비율을 반올림하여 소수점 셋째 자리까지 출력한다.
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
