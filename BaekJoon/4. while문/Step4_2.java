package four;

import java.util.Scanner;

public class Step4_2 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int a, b;
		while(scan.hasNext()) {
			a = scan.nextInt();
			b = scan.nextInt();
			System.out.println(a + b);
		}

	}

}
