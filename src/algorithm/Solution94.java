package algorithm;

import java.util.*;
class Solution94 {
	public String solution(String s) {
		String answer = "";
		String[] s1 = s.split(" ");
		int[] i1 = new int[s1.length];

		for (int i = 0; i<s1.length; i++) {
			i1[i] = Integer.valueOf(s1[i]);
		}

		Arrays.sort(i1);

		boolean all = true;
		outer:
		for (int i = 0; i<i1.length - 1; i++) {
			for (int j = i+1; j<i1.length; j++) {
				if (i1[i] != i1[j]) {
					all = false;
					if (!all) {
						break outer;
					}
				}
			}
		}

		if (all) {
			answer = i1[0] + " " + i1[1];
		} else {
			answer = i1[0] + " " + i1[i1.length - 1];
		}

		return answer;
	}
}
