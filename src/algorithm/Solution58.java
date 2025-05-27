package algorithm;

import java.util.*;
class Solution58 {
    public int solution(int[] nums) {
        int answer = 0;
        int sum = 0;

        for (int i = 0; i<nums.length - 2; i++) {
            for (int j = i+1; j<nums.length - 1; j++) {
                for (int k = j+1; k<nums.length; k++) {
                    sum = nums[i]+nums[j]+nums[k];
                    if (isPrime(sum)) {
                        answer++;
                    }
                }
            }
        }

        return answer;
    }
    public boolean isPrime(int sum) {
        boolean p = false;
        int count = 0;
        for (int i = 1; i<sum; i++) {
            if (sum % i == 0) {
                count++;
            }
        }
        if (count ==1) {
            p = true;
        }
        return p;
    }
}
