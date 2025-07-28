package algorithm;

import java.util.*;
class Solution80 {
	public String solution(String[] survey, int[] choices) {
		String answer = "";
		StringBuilder sb = new StringBuilder();
		Map<Character,Integer> map = new HashMap<>();
		map.put('R',0);
		map.put('T',0);
		map.put('C',0);
		map.put('F',0);
		map.put('J',0);
		map.put('M',0);
		map.put('A',0);
		map.put('N',0);
		Map<Integer,Integer> score = Map.of(1,3, 2,2, 3,1, 4,0, 5,1, 6,2, 7,3);

		for (int i = 0; i<survey.length; i++) {
			int j = 0;
			if (choices[i] > 4) {
				map.merge(survey[i].charAt(j+1), score.get(choices[i]), Integer::sum);
			} else if (choices[i] < 4) {
				map.merge(survey[i].charAt(j), score.get(choices[i]), Integer::sum);
			} else {
				map.merge(survey[i].charAt(j), score.get(choices[i]), Integer::sum);
				map.merge(survey[i].charAt(j+1), score.get(choices[i]), Integer::sum);
			}
		}

		if (map.get('R') > map.get('T')) {
			sb.append('R');
		} else if (map.get('R') < map.get('T')) {
			sb.append('T');
		} else {
			if ('R' < 'T') {
				sb.append('R');
			} else {
				sb.append('T');
			}
		}

		if (map.get('C') > map.get('F')) {
			sb.append('C');
		} else if (map.get('C') < map.get('F')) {
			sb.append('F');
		} else {
			if ('C' < 'F') {
				sb.append('C');
			} else {
				sb.append('F');
			}
		}

		if (map.get('J') > map.get('M')) {
			sb.append('J');
		} else if (map.get('J') < map.get('M')) {
			sb.append('M');
		} else {
			if ('J' < 'M' ) {
				sb.append('J');
			} else {
				sb.append('M');
			}
		}

		if (map.get('A') > map.get('N')) {
			sb.append('A');
		} else if (map.get('A') < map.get('N')) {
			sb.append('N');
		} else {
			if ('A' < 'N') {
				sb.append('A');
			} else {
				sb.append('N');
			}
		}
		answer = sb.toString();
		return answer;
	}
}