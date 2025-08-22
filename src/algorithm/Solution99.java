package algorithm;

class Solution99 {
	public int solution(int n) {
		int answer = 0;

		for (int i = 1; i * i <=n; i++) {
			if (n % i == 0) {
				int j = n / i;
				if (i % 2 != 0) {
					answer++;
				}

				if (i!= j && j % 2 != 0) {
					answer++;
				}
			}
		}
		return answer;
	}
}
