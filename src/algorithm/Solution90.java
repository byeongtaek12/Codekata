package algorithm;

import java.util.*;
class Solution90 {
	public int[] solution(String[] id_list, String[] report, int k) {
		int[] answer = new int[id_list.length];

		Map<String,Integer> idx = new HashMap<>();
		for (int i = 0; i<id_list.length; i++) {
			idx.put(id_list[i], i);
		}

		Set<String> unique = new HashSet<>(Arrays.asList(report));

		Map<String,Set<String>> m = new HashMap<>();
		for (String u : unique) {
			String[] s = u.split(" ");
			String reporter = s[0];
			String reported = s[1];
			m.computeIfAbsent(reported, x -> new HashSet<>()).add(reporter);
		}

		Set<String> suspended = new HashSet<>();
		for (Map.Entry<String,Set<String>> e : m.entrySet()) {
			if (e.getValue().size() >= k) {
				suspended.add(e.getKey());
			}
		}

		for (String bad : suspended) {
			for (String reporter : m.get(bad)) {
				answer[idx.get(reporter)]++;
			}
		}


		return answer;
	}
}
