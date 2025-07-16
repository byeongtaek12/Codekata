package algorithm;

class Solution67 {
	public String[] solution(int n, int[] arr1, int[] arr2) {
		String[] answer = new String[n];
		for (int i = 0; i<n; i++) {
			answer[i] = "";
			for (int j = 0; j<n; j++) {
				if (cal(arr1[i], n).charAt(j) != cal(arr2[i], n).charAt(j)) {
					answer[i] += "#";
					continue;
				} else {
					if (cal(arr1[i], n).charAt(j) =='0') {
						answer[i] += " ";
					} else {
						answer[i] += "#";
					}
				}
			}
		}
		return answer;
	}

	private String cal(int x, int n) {
		StringBuilder sb = new StringBuilder();

		while (x > 0) {
			sb.append(x%2);
			x /= 2;
		}

		while (sb.length() < n) {
			sb.append('0');
		}

		return sb.reverse().toString();
	}
}
