package algorithm;

class Solution24 {
    public String solution(String[] seoul) {
        String answer = "";
        int count=0;
        for (String seo : seoul) {
            count++;
            if (seo.equals("Kim")) {
                answer="김서방은 " + (count-1)+"에 있다";
            }
        }
        return answer;
    }
}
