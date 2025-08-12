package algorithm;

import java.time.*;
import java.time.format.*;
import java.time.temporal.*;
class Solution91 {
	public String solution(String video_len, String pos, String op_start, String op_end, String[] commands) {
		String answer = "";
		DateTimeFormatter mmssFormatter =
			new DateTimeFormatterBuilder()
				.appendPattern("mm:ss")
				.parseDefaulting(ChronoField.HOUR_OF_DAY, 0)
				.toFormatter();
		LocalTime len = LocalTime.parse(video_len, mmssFormatter);
		LocalTime p = LocalTime.parse(pos, mmssFormatter);
		LocalTime ops = LocalTime.parse(op_start, mmssFormatter);
		LocalTime ope = LocalTime.parse(op_end, mmssFormatter);

		final LocalTime ZERO = LocalTime.MIDNIGHT;

		for (String c : commands) {
			if (!(p.isBefore(ops) || p.isAfter(ope))) {
				p = ope;
			}

			if (c.equals("next")) {
				if (p.plusSeconds(10).isAfter(len)) {
					p = len;
				} else {
					p = p.plusSeconds(10);
				}

			} else {
				int s = p.toSecondOfDay();
				if (s < 10) {
					p = ZERO;
				} else {
					p = p.minusSeconds(10);
				}
			}

			if (!(p.isBefore(ops) || p.isAfter(ope))) {
				p = ope;
			}
		}

		answer = p.format(mmssFormatter);
		return answer;
	}
}
