package algorithm;

class Solution40 {
    public int solution(int n) {
        int answer = 0;
        int sum = 0;
        StringBuilder sb = new StringBuilder();
        while (n>0) {
            sb.append(n%3);
            n/=3;
        }

        char [] n1 = sb.toString().toCharArray();

        for (int i = 0; i<n1.length; i++) {
            int n2 = n1[i]-'0';

            if (!(n2==0)) {
                sum += n2*Math.pow(3,n1.length-1-i);
            }
        }

        answer=sum;
        return answer;
    }
}
