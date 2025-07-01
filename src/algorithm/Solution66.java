package algorithm;

import java.util.*;

class Solution66 {
	public int[] solution(String[] keymap, String[] targets) {
		int[] answer = new int [targets.length];
		int key1 = 0;
		int key2 = 0;
		List<char []> charT = new ArrayList<>();
		List<char []> charK = new ArrayList<>();


		for (String target : targets) {
			charT.add(target.toCharArray());
		}
		for (String key : keymap) {
			charK.add(key.toCharArray());
		}

		for (int i = 0; i<charT[0].length; i++) {
			for (int j = 0; j<charK[0].length; j++) {
				for (int k = 0; k<charK[1].length; k++) {
					if (charT[0][i] == charK[0][j]) {

					}
				}
			}
		}

		return answer;
	}
}
