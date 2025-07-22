package algorithm;

class Solution {
	public String solution74(String s, String skip, int index) {
		String answer = "";
		StringBuilder sb = new StringBuilder();

		for (int i = 0; i<s.length(); i++) {
			char ch = s.charAt(i);
			int count = 0;

			while (count < index) {
				ch++;
				if (ch > 'z') {
					ch = 'a';
				}

				if (skip.contains(String.valueOf(ch))) {
					continue;
				}
				count++;
			}
			sb.append(ch);
		}

		return answer = sb.toString();
	}
}
