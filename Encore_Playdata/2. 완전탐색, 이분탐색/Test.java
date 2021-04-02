package encore.algorithm;
import java.util.ArrayList;
import java.util.Arrays;

class Test {
    public int[] solution(int[] answers) {
        int [] a = new int[10000];
		int [] b = new int[10000];
		int [] c = new int[10000];
		int cntA = 0;
		int cntB = 0;
		int cntC = 0;
		int [] aa = {1, 2, 3, 4, 5};
		int [] bb = {2, 1, 2, 3, 2, 4, 2, 5};
		int [] cc = {3, 3, 1, 1, 2, 2, 4, 4, 5, 5};
		
		ArrayList<Integer> list = new ArrayList();
		
		int [] count = {0, 0, 0};
		
		// 패턴 넣는과정
		for(int i = 0; i < answers.length; i++) {
			if(cntA == 5) cntA -= 5;
			if(cntB == 8) cntB -= 8;
			if(cntC == 10) cntC -= 10;
			a[i] = aa[cntA++];
			b[i] = bb[cntB++];
			c[i] = cc[cntC++];
		}
		
		// 맞은 점수를 배열에 저장
		for(int i = 0; i < answers.length; i++) {
			if(answers[i] == a[i]) count[0]++;
			if(answers[i] == b[i]) count[1]++;
			if(answers[i] == c[i]) count[2]++;
		}
		
		int [] count2 = count.clone();
		Arrays.sort(count2);
		int max = count2[2];
		
		// 최대값 비교하여 list에 저장
		for(int i = 0; i < count.length; i++) {
			if(count[i] == max) list.add(i + 1);
		}
		
		int[] answer = new int[list.size()];
		
		// list에 인덱스값을 answer에 저장
		for(int i = 0; i < answer.length; i++) {
			answer[i] = list.get(i);
		}
        
        return answer;
    }
}