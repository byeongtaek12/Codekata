package algorithm;

class S7 {
	public int[] solution(int[] lottos, int[] win_nums) {
		int[] answer = new int[2];
		int cnt = 0;
		int zeroCnt = 0;

		for (int l : lottos) {
			if (l == 0) {
				zeroCnt++;
			}
			for (int w : win_nums) {
				if (l == w) {
					cnt++;
					break;
				}
			}
		}

		answer[0] = cnt+zeroCnt == 0 ? 6 : 7 - (cnt+zeroCnt);
		answer[1] = cnt == 0 ? 6 : 7 - cnt;
		return answer;
	}
}
