package algorithm;

class Solution65 {
	public int solution(String s) {
		int answer = 0;
		int xcount = 0;
		int notxcount = 0;
		char [] s1 = s.toCharArray();
		for (int i = 0; i<s1.length-1; i++) {
			if (s1[i]!=s1[i+1]) {
				answer++;
			}else {

			}

		}


		return answer;
	}
}
