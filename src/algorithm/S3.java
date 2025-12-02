package algorithm;

class S3 {
	public String solution(String s) {
		String answer = "";
		char [] c = s.toCharArray();
		int j = 0;

		for (int i = 0; i<c.length; i++) {
			if (Character.isLetter(c[i])) {
				if (j % 2 == 0) {
					c[i] = Character.toUpperCase(c[i]);
				} else {
					c[i] = Character.toLowerCase(c[i]);
				}
				j++;
			} else {
				j = 0;
			}

		}

		answer = new String(c);

		return answer;
	}
}
