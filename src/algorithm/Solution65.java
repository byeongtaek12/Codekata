class Solution65 {
	public int solution(String s) {
		int answer = 0;
		int xcount = 1;
		int notxcount = 0;
		char [] s1 = s.toCharArray();
		char x = s1[0];
		for (int i = 0; i<s1.length-1; i++) {
			if (s1[i] != x){
				continue;
			}
			for (int j= i + 1; j<s1.length; j++) {
				if (s1[i]!=s1[j]) {
					notxcount++;
					if (xcount == notxcount) {
						answer++;
						if (s1[j+1] != s1.length+1) {
							x = s1[j+1];
						}
						break;
					}else {
						if (s1[i+1]!=x) {
							notxcount++;
						}else {
							xcount++;
						}
					}
				}else {
					if (s1[i]==x) {
						xcount++;
					}else {
						notxcount++;
					}
				}
			}
		}


		return answer;
	}
}