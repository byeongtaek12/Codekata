package algorithm;

class Solution36 {
    public boolean solution(String s) {
        boolean answer = true;
        try {
            int s1 = Integer.valueOf(s);
            if (s.length()==4 ||s.length()==6) {
                answer=true;
            }else {
                answer=false;
            }

        }catch(Exception e){
            answer=false;
        }
        return answer;
    }
}
