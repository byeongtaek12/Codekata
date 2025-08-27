package algorithm;

class Solution104 {
	public long solution(int n) {
		long answer = 0;
		long zero = 1;
		long one = 1;

		if (n == 1) {
			return answer = 1;
		}

		for (int i = 2; i<=n; i++) {

			answer = (zero + one) % 1234567;
			zero = one;
			one = answer;
		}

		return answer;
	}
}
