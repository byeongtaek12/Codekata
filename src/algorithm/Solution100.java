package algorithm;

class Solution100 {
	public int solution(String s) {
		int answer = 0;
		StringBuilder sb = new StringBuilder();

		for (int i = 0; i<s.length(); i++) {
			char s1 = s.charAt(i);

			if (sb.length() > 0 && sb.charAt(sb.length() - 1) == s1) {
				sb.deleteCharAt(sb.length() - 1);
			} else {
				sb.append(s1);
			}
		}

		if (sb.length() == 0) {
			answer = 1;
		}

		return answer;
	}
}
