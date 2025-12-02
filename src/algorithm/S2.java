package algorithm;

class S2 {
	public int solution(String t, String p) {
		int answer = 0;

		for (int i = 0; i<t.length() - p.length() + 1; i++) {
			String s = t.substring(i, p.length() + i);
			long x = Long.valueOf(s);
			long y = Long.valueOf(p);

			if (x <= y) {
				answer++;
			}

		}

		return answer;
	}
}
