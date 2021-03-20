package brute_force;

import java.util.Scanner;

/*
 * 상근이는 어렸을 적에 "봄보니 (Bomboni)" 게임을 즐겨했다.
 * 가장 처음에 N×N크기에 사탕을 채워 놓는다. 사탕의 색은 모두 같지 않을 수도 있다. 
 * 상근이는 사탕의 색이 다른 인접한 두 칸을 고른다. 그 다음 고른 칸에 들어있는 사탕을 서로 교환한다. 
 * 이제, 모두 같은 색으로 이루어져 있는 가장 긴 연속 부분(행 또는 열)을 고른 다음 그 사탕을 모두 먹는다.
 * 사탕이 채워진 상태가 주어졌을 때, 상근이가 먹을 수 있는 사탕의 최대 개수를 구하는 프로그램을 작성하시오.
 */
public class N3085 {
	static int max;
	static char[][] board;
	
	public static void rowSwap(int a, int b) {
		char temp;
		temp = board[a][b];
		board[a][b] = board[a][b + 1];
		board[a][b + 1] = temp;
	}
	
	public static void colSwap(int a, int b) {
		char temp;
		temp = board[a][b];
		board[a][b] = board[a + 1][b];
		board[a + 1][b] = temp;
	}
	
	public static void checkCandy() {
		int checkMax;
		
		for(int i = 0; i < board.length; i++) {
			checkMax = 1;
			
			for(int j = 0; j < board.length - 1; j++) {
				if(board[i][j] == board[i][j + 1]) {
					checkMax++;
					if(max < checkMax) max = checkMax;
				}
				else checkMax = 1;
			}
			
		}
		
		for(int i = 0; i < board.length; i++) {
			checkMax = 1;
			
			for(int j = 0; j < board.length - 1; j++) {
				if(board[j][i] == board[j + 1][i]) {
					checkMax++;
					if(max < checkMax) max = checkMax;
				}
				else checkMax = 1;
			}
			
		}
		
	}

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int N = scan.nextInt();
		max = 0;
		board = new char[N][N];
		
		for(int i = 0; i < N; i++) board[i] = scan.next().toCharArray();
		
		for(int i = 0; i < N; i++) {
			for(int j = 0; j < N - 1; j++) {
				if(board[i][j] != board[i][j+1]) {
					rowSwap(i, j);
					checkCandy();
					rowSwap(i, j);
				}
			}
		}
		
		for(int i = 0; i < N; i++) {
			for(int j = 0; j < N - 1; j++) {
				if(board[j][i]!=board[j+1][i]) {
					colSwap(j, i);
					checkCandy();
					colSwap(j, i);
				 }
			}
		}
		
		System.out.println(max);
		
	}

}
