package algorithm;

class Solution35 {
    public long solution(int price, long money, int count) {
        long answer = 0;

        for (int i = 1; i<=count; i++) {
            money-= price*i;
        }
        if (money<0) {
            long enough = Math.abs(money);
            answer=enough;
        }else {
            answer=0;
        }
        return answer;
    }
}
