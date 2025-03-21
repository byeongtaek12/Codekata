package algorithm;

class Solution26 {
    public int solution(int[] absolutes, boolean[] signs) {
        int answer = 123456789;
        int sum=0;
        for (int i = 0; i<absolutes.length; i++) {
            if (signs[i] == false) {
                absolutes[i]=-absolutes[i];
            }
            sum+=absolutes[i];
        }
        answer=sum;
        return answer;
    }
}
