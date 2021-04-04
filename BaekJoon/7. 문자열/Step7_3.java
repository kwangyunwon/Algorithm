package seven;

import java.util.Scanner;

/*
 * ���ĺ� �ҹ��ڷθ� �̷���� �ܾ� S�� �־�����. ������ ���ĺ��� ���ؼ�, �ܾ ���ԵǾ� �ִ� ��쿡�� ó�� �����ϴ� ��ġ��, ���ԵǾ� ���� ���� ��쿡�� -1�� ����ϴ� ���α׷��� �ۼ��Ͻÿ�.
 */
public class Step7_3 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String str = scan.next();
		
		int [] alphabet = new int[26];
		
		for(int i = 0; i < 26; i++) {
			alphabet[i] = -1;
		}
		
		for(int i = 0; i < str.length(); i++) {
			if(alphabet[str.charAt(i) - 97] != -1) continue;
			alphabet[str.charAt(i) - 97] = i;
		}
		
		for(int i : alphabet) System.out.print(i + " ");
	}

}
