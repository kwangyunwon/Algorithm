package test;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class test5_2 {
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String str = br.readLine();
		
		System.out.println(solution(str));
	}
	
	public static String solution(String str) {
		String answer = "";
		char[] array = str.toCharArray();
		int lt = 0;
		int rt = array.length - 1;
		while(lt < rt) {
			if(!Character.isAlphabetic(array[lt])) lt++;
			else if(!Character.isAlphabetic(array[rt])) rt--;
			else {
				char temp;
				temp = array[lt];
				array[lt] = array[rt];
				array[rt] = temp;
				lt++;
				rt--;
			}
		}
		answer = String.valueOf(array);
		return answer;
	}

}
