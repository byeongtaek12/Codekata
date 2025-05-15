package algorithm;

class Solution54 {
    public String solution(int a, int b) {
        String answer = "";
        String [] dayOfWeek = {"FRI","SAT","SUN", "MON", "TUE", "WED", "THU"};
        int[] monthDays = {31,29,31,30,31,30,31,31,30,31,30,31};
        int day = 0;

        for (int i = 0; i<a-1; i++) {
            day+=monthDays[i];
        }

        day+= b-1;

        answer = dayOfWeek[day%7];

        return answer;
    }

}