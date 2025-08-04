package algorithm;

import java.util.*;
class Solution86 {
	public String[] solution(String[] players, String[] callings) {
		String[] answer = {};
		Map<String,Integer> m = new HashMap<>();

		for (int i = 0; i<players.length; i++) {
			m.put(players[i], i);
		}

		for (String c: callings) {
			int index = m.get(c);

			if (index == 0) {
				continue;
			}

			String temp = players[index - 1];
			players[index - 1] = c;
			players[index] = temp;

			m.put(c, index - 1);
			m.put(temp, index);
		}

		answer = players;
		return answer;
	}
}
