package algorithm;

import java.util.*;
class Solution68 {
	public int[] solution(String[] name, int[] yearning, String[][] photo) {
		int[] answer = new int [photo.length];
		Map<String, Integer> map = new HashMap<>();
		int sum = 0;
		int j = 0;

		for (int i = 0; i<name.length; i++) {
			map.put(name[i], yearning[i]);
		}

		for (String [] pho : photo) {
			for (int i = 0; i<pho.length; i++) {
				if (map.containsKey(pho[i])) {
					sum += map.get(pho[i]);
				}
			}
			answer[j] = sum;
			sum = 0;
			j++;
		}
		return answer;
	}
}
