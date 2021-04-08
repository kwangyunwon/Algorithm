package seven;

import java.util.Scanner;

/*
 * 알파벳 대소문자로 된 단어가 주어지면, 이 단어에서 가장 많이 사용된 알파벳이 무엇인지 알아내는 프로그램을 작성하시오. 
 * 단, 대문자와 소문자를 구분하지 않는다.
 */
public class Step7_5 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String str = scan.next();
		int [] alphabet = new int[26];
		int max = 0;
		int index = 0;
		int count = 0;
		str = str.toLowerCase();
		
		for(int i = 0; i < str.length(); i++) {
			alphabet[str.charAt(i) - 97]++;
			if(alphabet[str.charAt(i) - 97] >= max) {
				max = alphabet[str.charAt(i) - 97];
				index = str.charAt(i) - 32;
			}
		}
		
		char c = (char)index;
		
		for(int i : alphabet) if(max == i) count++;
		
		if(count >= 2) System.out.println("?");
		else System.out.println(c);

	}

}
