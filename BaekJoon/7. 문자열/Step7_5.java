package seven;

import java.util.Scanner;

/*
 * ���ĺ� ��ҹ��ڷ� �� �ܾ �־�����, �� �ܾ�� ���� ���� ���� ���ĺ��� �������� �˾Ƴ��� ���α׷��� �ۼ��Ͻÿ�. 
 * ��, �빮�ڿ� �ҹ��ڸ� �������� �ʴ´�.
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
