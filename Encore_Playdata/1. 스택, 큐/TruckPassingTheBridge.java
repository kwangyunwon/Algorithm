package encore.algorithm;

import java.util.LinkedList;
import java.util.Queue;

/*
 * 트럭 여러 대가 강을 가로지르는 일 차선 다리를 정해진 순으로 건너려 합니다. 
 * 모든 트럭이 다리를 건너려면 최소 몇 초가 걸리는지 알아내야 합니다. 
 * 트럭은 1초에 1만큼 움직이며, 다리 길이는 bridge_length이고 다리는 무게 weight까지 견딥니다.
 * ※ 트럭이 다리에 완전히 오르지 않은 경우, 이 트럭의 무게는 고려하지 않습니다.
 */
public class TruckPassingTheBridge {

	public int solution(int bridge_length, int weight, int[] truck_weights) {
	
		Queue<Integer> q = new LinkedList();
		int answer = 0;
		int currentWeight = 0;
		
		// 트럭이 다리를 지나면서 걸리는 시간을 계산한다.
		for(int i : truck_weights) {
			
			// 다리를 큐로 생각하여 조건에 따라 트럭을 올리고 보낸다.
			while(true) {
				
				// 큐가 비었으면 트럭이 지나갔음을 뜻하므로 다음 트럭을 올린다.
				if(q.isEmpty()) {
					q.add(i);
					currentWeight += i;
					answer++;
					break;
					
				// 트럭이 다리를 지나가면 현재무게에서 뺀다.
				}else if(q.size() == bridge_length) {
					currentWeight -= q.poll();
					
				// 트럭이 다리를 지나려 할 때 조건에 따라 올리거나 대기한다.
				}else {
					
					// 다리가 견디는 무게보다 다리위 트럭들의 무게가 클거같으면 대기시킨다.
					if(currentWeight + i > weight) {
						answer++;
						q.add(0); // 트럭을 보냈으면 다시 견디는 무게는 0으로 지정
					}
					
					// 다리가 견디면 트럭을 올린다.
					else {
						q.add(i);
						currentWeight += i;
						answer++;
						break;
					}
				}
			}
		}
		
		return answer + bridge_length;
	}

}
