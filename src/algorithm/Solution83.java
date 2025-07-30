package algorithm;

import java.util.*;
class Solution83 {
	public String solution(String new_id) {
		String answer = "";
		StringBuilder sb = new StringBuilder();

		answer = new_id.toLowerCase();
		sb.append(answer);

		for (char a : sb.toString().toCharArray()) {
			if (!(Character.isLetterOrDigit(a) || a == '-' || a == '_' || a == '.')) {
				int aIndex = sb.toString().indexOf(String.valueOf(a));
				sb.deleteCharAt(aIndex);
			}
		}

		while (sb.toString().contains("..")) {
			int fullstopIndex = sb.indexOf("..");
			sb.deleteCharAt(fullstopIndex);
		}

		if (sb.length() != 0 && sb.charAt(0) == '.') {
			sb.deleteCharAt(0);
		}

		if (sb.length() != 0 && sb.charAt(sb.length() - 1) == '.') {
			sb.deleteCharAt(sb.length() - 1);
		}

		if (sb.length() == 0) {
			sb.append("a");
		}

		if (sb.length() >= 16) {
			sb.replace(15,sb.length(), "");
		}

		if (sb.charAt(sb.length() - 1) == '.') {
			sb.deleteCharAt(sb.length() - 1);
		}

		while (sb.length() < 3) {
			sb.append(sb.charAt(sb.length() - 1));
		}

		answer = sb.toString();
		return answer;
	}
}
