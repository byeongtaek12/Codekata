package algorithm;

class Solution19 {
    public long solution(long n) {
        long answer = -1;
        int i = 1;
        while (i*i<=n) {
            if (i*i==n) {
                answer= ++i*i;
            }i++;
        }
        return answer;
    }
}
