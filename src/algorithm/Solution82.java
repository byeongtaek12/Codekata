package algorithm;

class Solution82 {
	public int[] solution(String[] wallpaper) {
		int[] answer = new int[4];

		for (int i = 0; i<wallpaper.length; i++) {
			if (wallpaper[i].indexOf("#") > -1) {
				answer[0] = i;
				answer[1] = wallpaper[i].indexOf("#");
				break;
			}
		}

		for (int i = 1; i<wallpaper.length; i++) {
			if (wallpaper[i].indexOf("#") > -1) {
				if (wallpaper[i].indexOf("#") < answer[1]) {
					answer[1] = wallpaper[i].indexOf("#");
				}
			}
		}

		for (int i = wallpaper.length - 1; i >= 0; i--) {
			if (wallpaper[i].lastIndexOf("#") > -1) {
				answer[2] = i + 1;
				answer[3] = wallpaper[i].lastIndexOf("#");
				break;
			}
		}

		for (int i = 0; i<wallpaper.length; i++) {
			if (wallpaper[i].lastIndexOf("#") > -1) {
				if (wallpaper[i].lastIndexOf("#") >= answer[3]) {
					answer[3] = wallpaper[i].lastIndexOf("#") + 1;
				}
			}
		}
		return answer;
	}
}
