package algorithm;

class Solution65 {
	public int solution(String s) {
		int answer = 0;
		int same = 0;
		int diff = 0;
		char[] chars = s.toCharArray();
		char x = chars[0];

		for (int i = 0; i < chars.length; i++) {
			if (chars[i] == x) {
				same++;
			} else {
				diff++;
			}

			if (same == diff) {
				answer++;
				if (i + 1 < chars.length) {
					x = chars[i + 1];
				}
				same = 0;
				diff = 0;
			}
		}

		if (same != diff) {
			answer++;
		}

		return answer;
	}
}
