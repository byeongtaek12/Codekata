package algorithm;

class Solution12 {
    public double solution(int[] arr) {
        double answer = 0;
        for (int ar : arr) {
            answer+=ar;
        }
        answer /= arr.length;
        return answer;
    }
}
