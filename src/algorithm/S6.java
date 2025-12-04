package algorithm;

class S6 {
	public int[] solution(int[] answers) {
		int[] answer = {};
		int[] one = {1,2,3,4,5};
		int[] two = {2,1,2,3,2,4,2,5};
		int[] three = {3,3,1,1,2,2,4,4,5,5};
		int on = 0;
		int tw = 0;
		int th = 0;

		for (int i = 0; i<answers.length; i++) {
			if (one[i % 5] == answers[i]) {
				on++;
			}

			if (two[i % 8] == answers[i]) {
				tw++;
			}

			if (three[i % 10] == answers[i]) {
				th++;
			}
		}

		int[] a = {on,tw,th};
		int max = a[0];

		for (int j = 0; j<a.length; j++) {
			if (a[j] > max) {
				max = a[j];
			}
		}

		int cnt = 0;

		for (int k = 0; k<a.length; k++) {
			if (a[k] == max) {
				cnt++;
			}
		}

		int [] ans = new int[cnt];
		int idx = 0;

		for (int s = 0; s<a.length; s++) {
			if (a[s] == max) {
				ans[idx] = s + 1;
				idx++;
			}
		}

		answer = ans;

		return answer;
	}
}
