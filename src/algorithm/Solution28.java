package algorithm;

class Solution28 {
    public int solution(int[] numbers) {
        int answer = 0;
        boolean check;
        int [] num = new int []{0,1,2,3,4,5,6,7,8,9};
        for (int nu : num) {
            check=false;
            for (int number : numbers) {
                if (nu==number) {
                    check=true;
                    continue;
                }
            }
            if (!check) {
                answer+=nu;
            }
        }
        return answer;
    }
}
