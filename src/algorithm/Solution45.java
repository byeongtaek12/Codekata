package algorithm;

class Solution45 {
    public String solution(String s, int n) {
        char[] s1 = s.toCharArray();

        for (int i = 0; i < s1.length; i++) {
            char ch = s1[i];

            if (ch >= 'A' && ch <= 'Z') {
                s1[i] = (char) ((ch - 'A' + n) % 26 + 'A');
            } else if (ch >= 'a' && ch <= 'z') {
                s1[i] = (char) ((ch - 'a' + n) % 26 + 'a');
            }

        }

        return new String(s1);
    }
}
