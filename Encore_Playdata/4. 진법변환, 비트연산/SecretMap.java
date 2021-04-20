package encore.algorithm;

public class SecretMap {

	 public String[] solution(int n, int[] arr1, int[] arr2) {
         String [] arrayArr1 = new String [arr1.length];
         String [] arrayArr2 = new String [arr1.length];
         String [] answer = new String [arr1.length];
	
	
		for(int i=0; i<arr1.length; i++) {
			arrayArr1[i] = Integer.toBinaryString(arr1[i]);
			arrayArr2[i] = Integer.toBinaryString(arr2[i]);
			
			if(arrayArr1[i].length() != n) {
				int p = arrayArr1[i].length();
				for(int k=0; k<n-p; k++) {
					arrayArr1[i] = "0" + arrayArr1[i];
				}
			}
			
			if(arrayArr2[i].length() != n) {
				int p = arrayArr2[i].length();
				for(int k=0; k<n-p; k++) {
					arrayArr2[i] = "0" + arrayArr2[i];
				}
			}
			answer[i] = "";
			
			for(int t=0; t<n; t++) {
				int r = (int)(arrayArr1[i].charAt(t) - '0');
				int b = (int)(arrayArr2[i].charAt(t) - '0');
				String e = r+b==0 ? " " : "#";
				
				answer[i] += e;
			}
		
		}	
		return answer;
	 }
}
