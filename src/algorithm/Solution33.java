package algorithm;

class Solution33 {
    public int solution(int left, int right) {
        int answer = 0;
        int sum = 0;
        for (int i = left; i<=right; i++) {
            if (count(i)%2==0) {
                sum+=i;
            }else {
                sum-=i;
            }
        }
        answer=sum;
        return answer;
    }

    public int count(int x) {
        int count = 0;
        for (int i = 1; i<=x; i++) {
            if (x%i==0) {
                count++;
            }
        }
        return count;
    }
}
