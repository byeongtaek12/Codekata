package algorithm;

class Solution41 {
    public String solution(String s) {
        String answer = "";
        char[] s1 = s.toCharArray();
        boolean s2 = true;

        for (int i = 0; i < s1.length; i++) {
            if (Character.isLetter(s1[i])) {
                if (s2) {
                    s1[i] = Character.toUpperCase(s1[i]);
                    s2 = false;
                } else {
                    s1[i] = Character.toLowerCase(s1[i]);
                    s2 = true;
                }
            }
            else {
                s2 = true;
            }

        }

        answer = new String(s1);
        return answer;
    }
}