package algorithm;

import java.util.*;
import java.io.*;

public class Solution112 {
	public static void main(String[] args) throws Exception{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		int answer = 0;

		for (int i = 0; i < n; i++) {

			Map<Character, Integer> m = new HashMap<>();
			boolean bad = false;

			String s = br.readLine().trim();

			for (int j = 0; j < s.length(); j++) {
				char c = s.charAt(j);

				if (m.containsKey(c)) {
					int prev = m.get(c);

					if (j - prev > 1) {
						bad = true;
						break;
					}
					m.put(c, j);
				} else {
					m.put(c, j);
				}
			}

			if (!bad) answer++;
		}

		System.out.println(answer);
	}
}
