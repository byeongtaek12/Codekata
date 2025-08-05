package algorithm;

import java.util.*;
class Solution87 {
	public int[] solution(String[] park, String[] routes) {
		int[] answer = new int[2];
		int[] start = new int[2];
		List<int[]> l = new ArrayList<>();

		for (int i = 0; i<park.length; i++) {
			if (park[i].contains("S")) {
				int index = park[i].indexOf("S");
				start[0] = i;
				start[1] = index;
			}
		}

		for (int i = 0; i<park.length; i++) {
			if (park[i].contains("X")) {
				int from = 0;
				while (true) {
					int index = park[i].indexOf("X", from);
					if (index == -1) {
						break;
					}
					l.add(new int[]{i,index});
					from = index + 1;
				}
			}
		}

		for (String r : routes) {
			String[] s = r.split(" ");
			int temp = Integer.valueOf(s[1]);
			int y = start[0];
			int x = start[1];
			boolean ok = true;
			for (int i = 0; i<temp; i++) {
				if (s[0].equals("E") ) {
					x++;
				} else if (s[0].equals("W")) {
					x--;
				} else if (s[0].equals("N")) {
					y--;
				} else {
					y++;
				}

				int yy = y;
				int xx = x;

				if (y < 0 || y >= park.length || x < 0 || x >= park[0].length() ||
					l.stream().anyMatch(a -> a[0] == yy && a[1] == xx)) {
					ok = false;
					break;
				}
			}

			if (ok) {
				start[0] = y;
				start[1] = x;
			}
		}
		answer = start;
		return answer;
	}
}
