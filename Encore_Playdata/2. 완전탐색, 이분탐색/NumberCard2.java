package encore.algorithm;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Arrays;
import java.util.StringTokenizer;

public class NumberCard2 {

	static int[] array;
	
	public static void main(String[] args) throws Exception {
		
		//Scanner와 system.out.println사용시 시간이 초과하기 때문에 buffered reader와 writer사용
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		int num;
		int N = Integer.parseInt(br.readLine());
		array = new int[N];
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		// 상근이의 숫자카드를 array에 저장 후 정렬
 		for(int i = 0; i < N; i++) {
			array[i] = Integer.parseInt(st.nextToken());
		}
		
		Arrays.sort(array);
		
		int M = Integer.parseInt(br.readLine());
		st = new StringTokenizer(br.readLine());
		
		// 각 정수를 입력받아 이분탐색으로 해당 정수의 개수를 저장하는데, 중복된 값이 있을수 있으니 아래에서 위로 위에서 아래로 두번에 걸쳐 검사한다.
		for(int i = 0; i < M; i++) {
			num = Integer.parseInt(st.nextToken());
			bw.append((upper(num) - lower(num)) + " ");
		}
		bw.close();
		br.close();
	}
	
	public static int lower(int num) {
		int left = 0;
		int right = array.length;
		int mid;
		// 이분탐색으로 해당정수를 알아내 반환한다.
		while(left < right) {
			mid = (left + right) / 2;
			if(num <= array[mid]) right = mid;
			else left = mid + 1;
		}
		return left;
	}
	
	public static int upper(int num) {
		int left = 0;
		int right = array.length;
		int mid;
		// 이분탐색으로 해당정수를 알아내 반환한다.
		while(left < right) {
			mid = (left + right) / 2;
			if(num >= array[mid]) left = mid + 1;
			else right = mid;
		}
		return left;
	}

}
