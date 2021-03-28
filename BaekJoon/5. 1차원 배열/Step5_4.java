package five;

import java.util.Scanner;
/*
 * 두 자연수 A와 B가 있을 때, A%B는 A를 B로 나눈 나머지 이다. 예를 들어, 7, 14, 27, 38을 3으로 나눈 나머지는 1, 2, 0, 2이다. 
 * 수 10개를 입력받은 뒤, 이를 42로 나눈 나머지를 구한다. 그 다음 서로 다른 값이 몇 개 있는지 출력하는 프로그램을 작성하시오.
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
