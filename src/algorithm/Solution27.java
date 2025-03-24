package algorithm;

class Solution27 {
    public String solution(String phone_number) {
        String answer = "";
        StringBuilder sb = new StringBuilder();
        sb.append(phone_number);
        for (int i = 0; i<phone_number.length()-4;i++) {
            sb.replace(i,i+1, "*");
        }
        answer=sb.toString();
        return answer;
    }
}
