package algorithm;

class Solution17 {
    public long[] solution(long n) {
        long [] answer = new long [String.valueOf(n).length()];
        int i = 0;
        while (n!=0) {
            answer[i]+=n%10;
            n/=10;
            i++;
        }
        return answer;
    }
}
