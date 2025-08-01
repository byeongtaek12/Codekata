package algorithm;

import java.util.*;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
class Solution85 {
	public int[] solution(String today, String[] terms, String[] privacies) {
		int[] answer = {};
		DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy.MM.dd");
		LocalDate todayDate = LocalDate.parse(today, formatter);

		Map<String,Integer> m = new HashMap<>();
		for (String t : terms) {
			String[] part = t.split(" ");
			m.put(part[0],Integer.valueOf(part[1]));
		}

		List<Integer> list = new ArrayList<>();
		for (int i = 0; i<privacies.length; i++) {
			String[] part = privacies[i].split(" ");

			LocalDate startDate = LocalDate.parse(part[0], formatter);
			String type = part[1];

			LocalDate expireDate = startDate.plusMonths(m.get(type));
			if (!expireDate.isAfter(todayDate)) {
				list.add(i+1);
			}
		}

		answer = list.stream().mapToInt(Integer::intValue).toArray();

		return answer;
	}
}
