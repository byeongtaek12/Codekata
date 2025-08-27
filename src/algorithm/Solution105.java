package algorithm;

class Solution105 {
	public int solution(int[] arr) {
		int answer = 0;
		int l = arr[0];

		for (int i = 1; i<arr.length; i++) {
			l = lcm(l,arr[i]);
		}
		answer = l;

		return answer;
	}
	private int lcm(int a, int b) {
		return a / gcd(a,b) * b;
	}

	private int gcd(int a, int b) {
		while (b != 0) {
			int temp = a % b;
			a = b;
			b = temp;
		}
		return a;
	}
}
