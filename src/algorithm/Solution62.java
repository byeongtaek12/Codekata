package algorithm;

import java.util.*;
class Solution62 {
	public int solution(String[] babbling) {
		int answer = 0;
		String[] bab = {"aya", "ye", "woo", "ma"};
		String[] babbling1 = new String [babbling.length];
		for (int i = 0; i < babbling.length; i++) {
			babbling1[i] = babbling[i];
			for (int j = 0; j < bab.length; j++) {
				if (babbling1[i].contains(bab[j] + bab[j])) {
					babbling1[i] = "invalid";
					break;
				}
				babbling1[i] = babbling1[i].replace(bab[j], " ");
			}
		}
		for (String babble : babbling1) {
			if (babble.trim().equals("")) {
				answer++;
			}
		}
		return answer;
	}
}
