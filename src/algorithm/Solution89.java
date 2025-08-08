package algorithm;

import java.util.*;
class Solution89 {
	public int solution(int[] bandage, int health, int[][] attacks) {
		int answer = 0;
		int lastAttack = attacks[attacks.length - 1][0];
		Map<Integer,Integer> m = new HashMap<>();
		int success = 0;
		int HP = health;

		for (int i = 0; i<attacks.length; i++) {
			m.put(attacks[i][0], attacks[i][1]);
		}

		for (int i = 1; i<=lastAttack; i++) {
			if (m.containsKey(i)) {
				health -= m.get(i);
				if (success > 0) {
					success = 0;
				}

				if (health <= 0) {
					health = -1;
					break;
				}
			} else {
				if (HP > health) {
					if (health + bandage[1] > HP) {
						health = HP;
					} else {
						health += bandage[1];
					}
				}
				success++;
				if (success == bandage[0]) {
					success = 0;
					if (HP > health) {
						if (health + bandage[2] > HP) {
							health = HP;
						} else {
							health += bandage[2];
						}
					}
				}
			}
		}

		answer = health;
		return answer;
	}
}
