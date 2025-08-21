package algorithm;

class Solution98 {
	public int[] solution(String s) {
		int[] answer = new int[2];
		int zero = 0;
		int change = 0;
		StringBuilder sb = new StringBuilder();

		while (!s.equals("1")) {
			String s1 = s.replace("0", "");
			int len = s1.length();
			zero += s.length() - len;
			while (len > 0) {
				if (len == 1) {
					sb.append(1);
					break;
				}
				sb.append(len % 2);
				len /= 2;

			}
			sb.reverse();
			s = sb.toString();
			sb.setLength(0);
			change++;
		}

		answer[0] = change;
		answer[1] = zero;

		return answer;
	}
}
