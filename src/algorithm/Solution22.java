package algorithm;

class Solution22 {
    public long solution(long a, long b) {
        long answer = 0;
        answer = (Math.abs(b-a)+1)*(a+b)/2;
        return answer;
    }
}
