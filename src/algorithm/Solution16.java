package algorithm;

class Solution16{
    public long[] solution(long x, int n) {
        long[] answer = new long[n];
        for (int i = 1; i<=answer.length; i++) {
            answer[i-1]=x+(i-1)*x;
        }
        return answer;
    }
}