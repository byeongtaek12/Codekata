package algorithm;

class Solution71 {
	public int solution(int n) {
		int answer = 0;
		for (int i = 2; i <= n; i++) {
			if (isPrime(i)) {
				answer++;
			}
		}
		return answer;
	}

	private boolean isPrime(int n) {
		for (int i = 2; i * i <= n; i++) {
			if (n % i == 0) {
				return false;
			}
		}
		return true;
	}
}
