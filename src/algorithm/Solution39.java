package algorithm;

class Solution39 {
    public int[] solution(int n, int m) {
        int[] answer = new int [2];
        answer[0]= max(n,m);
        answer[1]= answer[0] * (n/answer[0] * m/answer[0]);

        return answer;
    }

    public int max(int x, int y) {
        while (y!=0) {
            int temp=y;
            y=x%y;
            x=temp;
        }
        return x;
    }
}
