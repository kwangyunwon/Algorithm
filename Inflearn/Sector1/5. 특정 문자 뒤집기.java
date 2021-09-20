package test;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class test5 {
	
	static Stack s = new Stack();
	static StringBuilder sb = new StringBuilder();
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String str = br.readLine();
		
		pushAlpha(str);
		answer(str);
		
		System.out.println(sb);
	}
	
	public static void pushAlpha(String str) {
		for(int i = 0; i < str.length(); i++) {
			if(str.charAt(i) >= 65 && str.charAt(i) <= 122) {
				s.push(str.charAt(i));
			}
		}
	}
	
	public static void answer(String str) {
		for(int i = 0; i < str.length(); i++) {
			if(str.charAt(i) >= 65 && str.charAt(i) <= 122) {
				sb.append(s.pop());
			}else {
				sb.append(str.charAt(i));
			}
		}
	}

}
