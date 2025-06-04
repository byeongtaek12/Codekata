package algorithm;

class Solution60 {
	public int solution(int number, int limit, int power) {
		int answer = 0;
		for (int i = 0; i<number; i++) {
			if (calculate(i+1)>limit) {
				answer+=power;
			}else{
				answer += calculate(i+1);
			}
		}
		return answer;
	}

	public int calculate(int x) {
		if (x==1) {
			return 1;
		}
		int count = 0;
		for (int i = 1; i*i<=x; i++) {
			if (x % i == 0) {
				if (i*i==x) {
					count++;
				}else {
					count+=2;
				}
			}
		}
		return count;
	}
}
