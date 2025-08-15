package algorithm;

import java.util.*;
class Solution93 {
	public int solution(String[] friends, String[] gifts) {
		int answer = 0;
		Map<String,Integer> reqCount = new HashMap<>();
		Map<String,Integer> recCount = new HashMap<>();
		Map<String,Map<String,Integer>> to = new HashMap<>();
		Map<String,Integer> maxCount = new HashMap<>();

		for (String g : gifts) {
			String[] user = g.split(" ");
			if (!reqCount.containsKey(user[0])) {
				reqCount.put(user[0], 1);
			} else {
				reqCount.put(user[0], reqCount.get(user[0]) + 1);
			}

			if (!recCount.containsKey(user[1])) {
				recCount.put(user[1], 1);
			} else {
				recCount.put(user[1], recCount.get(user[1]) + 1);
			}

			to.computeIfAbsent(user[0], v -> new HashMap<>()).merge(user[1], 1, Integer::sum);
		}

		for (int i = 0; i<friends.length - 1; i++) {
			for (int j = i+1; j<friends.length; j++) {
				to.computeIfAbsent(friends[i], v -> new HashMap<>()).putIfAbsent(friends[j],0);
				to.computeIfAbsent(friends[j], v -> new HashMap<>()).putIfAbsent(friends[i],0);
			}
		}

		for (int i = 0; i<friends.length - 1; i++) {
			for (int j = i+1; j<friends.length; j++) {
				int A = to.get(friends[i]).get(friends[j]);
				int B = to.get(friends[j]).get(friends[i]);
				if (A > B) {
					if (maxCount.containsKey(friends[i])) {
						maxCount.put(friends[i], maxCount.get(friends[i]) + 1);
					} else {
						maxCount.put(friends[i], 1);
					}
				} else if (A < B) {
					if (maxCount.containsKey(friends[j])) {
						maxCount.put(friends[j], maxCount.get(friends[j]) + 1);
					} else {
						maxCount.put(friends[j], 1);
					}
				} else {
					int giftScoreI = reqCount.getOrDefault(friends[i],0) - recCount.getOrDefault(friends[i],0);
					int giftScoreJ = reqCount.getOrDefault(friends[j],0) - recCount.getOrDefault(friends[j],0);
					if (giftScoreI > giftScoreJ) {
						if (maxCount.containsKey(friends[i])) {
							maxCount.put(friends[i], maxCount.get(friends[i]) + 1);
						} else {
							maxCount.put(friends[i], 1);
						}
					} else if (giftScoreI < giftScoreJ) {
						if (maxCount.containsKey(friends[j])) {
							maxCount.put(friends[j], maxCount.get(friends[j]) + 1);
						} else {
							maxCount.put(friends[j], 1);
						}
					}
				}
			}
		}

		int max = 0;
		for (String key : maxCount.keySet()) {
			if (maxCount.get(key) > max) {
				max = maxCount.get(key);
			}
		}

		answer = max;
		return answer;
	}
}
