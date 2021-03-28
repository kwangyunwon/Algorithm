package brute_force;

import java.util.Scanner;

/*
 * 정보문화진흥원 정보 영재 동아리에서 동아리 활동을 하던 영수와 민혁이는 쉬는 시간을 틈타 숫자야구 게임을 하기로 했다.
 * 영수는 1에서 9까지의 서로 다른 숫자 세 개로 구성된 세 자리 수를 마음속으로 생각한다. (예: 324)
 * 민혁이는 1에서 9까지의 서로 다른 숫자 세 개로 구성된 세 자리 수를 영수에게 묻는다. (예: 123)
 * 민혁이가 말한 세 자리 수에 있는 숫자들 중 하나가 영수의 세 자리 수의 동일한 자리에 위치하면 스트라이크 한 번으로 센다.
 * 숫자가 영수의 세 자리 수에 있긴 하나 다른 자리에 위치하면 볼 한 번으로 센다.
 * 현재 민혁이와 영수는 게임을 하고 있는 도중에 있다. 민혁이가 영수에게 어떤 수들을 물어보았는지, 그리고 각각의 물음에 영수가 어떤 대답을 했는지가 입력으로 주어진다. 
 * 이 입력을 바탕으로 여러분은 영수가 생각하고 있을 가능성이 있는 수가 총 몇 개인지를 알아맞혀야 한다.
 * 영수는 동아리의 규율을 잘 따르는 착한 아이라 민혁이의 물음에 곧이곧대로 정직하게 답한다. 그러므로 영수의 답들에는 모순이 없다.
 * 민혁이의 물음들과 각각의 물음에 대한 영수의 답이 입력으로 주어질 때 영수가 생각하고 있을 가능성이 있는 답의 총 개수를 출력하는 프로그램을 작성하시오.
 */
public class N2503 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int N = scan.nextInt();
		int [] num = new int[N];
		int [] strike = new int[N];
		int [] ball = new int[N];
		int count = 0;
		int a, b, c;
		int st = 0;
		int ba = 0;
		boolean flag;
		
		for(int i = 0; i < N; i++) {
			num[i] = scan.nextInt();
			strike[i] = scan.nextInt();
			ball[i] = scan.nextInt();
		}
		
		for(int i = 100; i <= 987; i++) {
			if(i / 100 == 0 || (i % 100) / 10 == 0 || (i % 100) % 10 == 0) continue;
			if(i / 100 == (i % 100) / 10 || (i % 100) % 10 == i / 100 || (i % 100) / 10 == (i % 100) % 10) continue;
			
			flag = false;
			
			for(int j = 0; j < N; j++) {
				a = num[j] / 100;
				b = (num[j] % 100) / 10;
				c = (num[j] % 100) % 10;
				st = 0;
				ba = 0;
				
				if(i / 100 == a) st++;
				else if(i / 100 == b || i / 100 == c) ba++;
				
				if((i % 100) / 10 == b) st++;
				else if((i % 100) / 10 == a || (i % 100) / 10 == c) ba++;
				
				if((i % 100) % 10 == c) st++;
				else if((i % 100) % 10 == a || (i % 100) % 10 == b) ba++;

				
				if(st == strike[j] && ba == ball[j]) {
					continue;
				}
				else {
					flag = true;
					break;
				}
				
			}
			
			if(!flag) count++;
			
		}
		
		System.out.println(count);
		
	}

}
