package algorithm;

import java.util.*;
class Solution95 {
	public String solution(String s) {
		String answer = "";
		String s0 = s.toLowerCase();
		String[] s1 = s0.split(" ", -1);
		StringBuilder sb = new StringBuilder();

		for (int i = 0; i<s1.length; i++) {
			if (s1[i].length() > 0) {
				sb.append(Character.toUpperCase(s1[i].charAt(0)));
				if (s1[i].length() > 1) {
					sb.append(s1[i].substring(1));
				}
			}

			if (i < s1.length - 1) {
				sb.append(" ");
			}
		}

		answer = sb.toString();
		return answer;
	}
}
