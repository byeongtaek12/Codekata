package algorithm;

class Solution92 {
	public int solution(int n, int w, int num) {
		int answer = 0;
		int h = n % w == 0 ? n / w : n / w + 1;
		int[][] x = new int[h][w];
		int count = 1;
		int [] numIndex = {};

		outer:
		for (int i = h - 1; i >=0; i--) {
			for (int j = 0; j<w; j++) {
				if (count > n) {
					break outer;
				}
				if (i % 2 == 0) {
					x[i][j] = count;
					if (count == num) {
						numIndex = new int[]{i,j};
					}
					count++;
				} else {
					int k = w - 1 - j;
					x[i][k] = count;
					if (count == num) {
						numIndex = new int[]{i,k};
					}
					count++;
				}
			}
		}

		for (int s = 0; s<x.length; s++) {
			for (int z = 0; z<x[0].length; z++) {
				if (z == numIndex[1] && s <= numIndex[0]) {
					if (x[s][z] != 0) {
						answer++;
					}
				}
			}
		}
		return answer;
	}
}
