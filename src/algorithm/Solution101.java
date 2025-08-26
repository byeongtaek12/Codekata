package algorithm;

class Solution101 {
	public int solution(int n) {
		int answer = 0;
		String num = Integer.toBinaryString(n);
		int count = 0;
		int j = 1;

		for (int i = 0; i<num.length(); i++) {
			if (num.charAt(i) == '1') {
				count++;
			}
		}

		while (true) {
			n+=j;
			String num1 = Integer.toBinaryString(n);
			if (num1.replace("0", "").length() == count) {
				answer = n;
				break;
			}
		}
		return answer;
	}
}
