package algorithm;

class Solution11 {
    public String solution(int num) {
        String answer = "Odd";
        if (num % 2 == 0 ) {
            answer="Even";
        }
        return answer;
    }
}
