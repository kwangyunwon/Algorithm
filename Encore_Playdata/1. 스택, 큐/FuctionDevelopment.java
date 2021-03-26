package encore.algorithm;
/*
 * 프로그래머스 팀에서는 기능 개선 작업을 수행 중입니다. 각 기능은 진도가 100%일 때 서비스에 반영할 수 있습니다.
 * 또, 각 기능의 개발속도는 모두 다르기 때문에 뒤에 있는 기능이 앞에 있는 기능보다 먼저 개발될 수 있고, 이때 뒤에 있는 기능은 앞에 있는 기능이 배포될 때 함께 배포됩니다.
 * 먼저 배포되어야 하는 순서대로 작업의 진도가 적힌 정수 배열 progresses와 각 작업의 개발 속도가 적힌 정수 배열 speeds가 주어질 때 각 배포마다 몇 개의 기능이 배포되는지를 return 하도록 solution 함수를 완성하세요.
 */
import java.util.ArrayList;
class FunctionDevelopment {
    public int[] solution(int[] progresses, int[] speeds) {
       
		int[] day = new int[progresses.length];
		ArrayList<Integer> list = new ArrayList<Integer>();
		int count;
		
		// 기능개발의 진도가 100%가 되는데 며칠이 걸리는지 구해서 day안에 넣는다.
		for(int i = 0; i < progresses.length; i++) {
			for(int j = progresses[i]; j < 100; j += speeds[i]) {
				day[i]++;
			}
		}
		
		// 배포의 순서와 날짜를 계산하여 list에 추가한다.
		for(int i = 0; i < day.length; i++) {
			count = 1;
			
			// 이전에 검사를 했는지 확인. 했으면 -1로 지정하여 넘어가도록 함
            if(day[i] != -1) {
            	int temp = day[i];          
	            day[i] = -1;
	            
	            // 배포에 걸리는 일수를 확인하여 몇개의 기능을 배포할 수 있는지 count로 계산
	            for(int j = i + 1; j < day.length; j++) {
	            	
	            	if(temp >= day[j]) {
	    				count++;
	    				day[j] = -1;
	    			}
	    			else {
	    				break;
	    			}
	    		}
	                
	            list.add(count);
            }
		}
		
		int[] answer = new int[list.size()];
		for(int i = 0; i < answer.length; i++) {
			answer[i] = list.get(i);
        }
        
        return answer;
    }
}