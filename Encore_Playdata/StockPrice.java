package encore.algorithm;
/*
 * 초 단위로 기록된 주식가격이 담긴 배열 prices가 매개변수로 주어질 때, 
 * 가격이 떨어지지 않은 기간은 몇 초인지를 return 하도록 solution 함수를 완성하세요.
 */
class StockPrice {
    public int[] solution(int[] prices) {
		int [] answer = new int[prices.length];
		int count = 0;
		for(int i = 0; i < prices.length; i++){
            for(int j = i + 1; j < prices.length; j++){
            	count++;
                if(prices[i] <= prices[j]) continue;
                else break;
            }
            answer[i] = count;
            count = 0;
        } 
        return answer;
    }
}