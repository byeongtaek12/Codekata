package algorithm;

class Solution103 {
	public int[] solution(int brown, int yellow) {
		int[] answer = new int[2];
		int sum = brown + yellow;

		for (int i = 3; i * i <=sum; i++) {
			if (sum % i != 0) {
				continue;
			}

			if ((i-2) * (sum/i-2) == yellow) {
				answer[1] = i;
				answer[0] = sum/i;
			}
		}

		return answer;
	}
}
