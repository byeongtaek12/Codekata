package algorithm;

class Solution10 {
    public double solution(int[] numbers) {
        double answer = 0;
        int count = numbers.length;
        for (int number : numbers) {
            answer+=number;
        }
        answer /= count;
        return answer;
    }
}
