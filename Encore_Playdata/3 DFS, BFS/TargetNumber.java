package encore.algorithm;

public class TargetNumber {

	class Solution {
	    public int solution(int[] numbers, int target) {
	        int answer = 0;
	        
	        answer += DFS(numbers[0], 1, numbers, target);
			answer += DFS(-numbers[0], 1, numbers, target);
	        
	        return answer;
	    }
	    
	    public int DFS(int n, int index, int [] array, int target) {
			if(index == array.length) {
				if(target == n) return 1;
				else return 0;
			}
			
			int plus = n + array[index];
			int minus = n - array[index];
			int ans = 0;
			
			ans += DFS(plus, index + 1, array, target);
			ans += DFS(minus, index + 1, array, target);
			
			return ans;
		}
	}

}
