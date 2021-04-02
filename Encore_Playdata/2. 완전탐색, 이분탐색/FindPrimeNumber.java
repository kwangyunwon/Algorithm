package encore.algorithm;

import java.util.ArrayList;
class FindPrimeNumber {
	
    static boolean[] check = new boolean[7];
	static ArrayList<Integer> list = new ArrayList();
	static int answer = 0;
	
	public int solution(String numbers) {
		String str = "";
		
		// 문자열로 받은 숫자를 재귀메소드를 통해 모든 조합을 list에 저장한다.
		for(int i = 1; i <= numbers.length(); i++) {
			combination(numbers, str, i);
		}
		
		// 모든 조합을 가진 list에서 소수인지 확인하여 answer를 계산한다.
		for(int i : list) {
			primeNumber(i);
		}
		
		return answer;
		
	}
	
	public static void combination(String num, String str, int length) {
		
		// 문자열이 끝에 다다랐을때
		if(str.length() == length) {
			// 중복값 삽입방지
			if(!list.contains(Integer.parseInt(str))) list.add(Integer.parseInt(str));
			return;
		}
		
		// boolean으로 방문을 표시하며 문자열마다의 조합을 재귀함수로 찾아 list에 추가
		for(int j = 0; j < num.length(); j++) {
			if(check[j]) continue;
			str += num.charAt(j);
			check[j] = true;
			combination(num, str, length);
			check[j] = false;
			str = str.substring(0, str.length() - 1);
		}
	}
	
	 public static void primeNumber(int n){
		 
		 // 0, 1은 소수가 아니므로 바로 리턴
		 if(n == 0) return;
		 if(n == 1) return;
		 
		 // 최대 제곱근까지 구하여 소수가 아니면 바로 리턴
		 for(int i=2;i<=Math.sqrt(n);i++){
			 if(n % i == 0) return;
	     }
		 
		 answer++;
	 }
}