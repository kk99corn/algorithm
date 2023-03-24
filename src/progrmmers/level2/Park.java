package progrmmers.level2;

import java.util.Arrays;

/*
programmers
level: 2
title: 공원 산책
url: https://programmers.co.kr/learn/courses/30/lessons/172928
*/
public class Park {

	public int[] solution(String[] park, String[] routes) {
		int[] answer = new int[2];

		int height = park.length;
		int width = 0;

		for (int i = 0; i < height; i++) {
			width = park[0].length();
			if (park[i].contains("S")) {
				answer[0] = i;
				answer[1] = park[i].indexOf("S");
			}
		}

		for (String r : routes) {
			String[] rInfo = r.split(" ");

			int[] temp = new int[2];
			temp[0] = answer[0];
			temp[1] = answer[1];

			boolean isMove = true;
			switch (rInfo[0]) {
				case "E" -> {
					temp[1] += Integer.parseInt(rInfo[1]);
					if (temp[1] < width) {
						for (int i = answer[1] + 1; i <= temp[1]; i++) {
							if (park[temp[0]].charAt(i) == 'X') {
								isMove = false;
								break;
							}
						}
						if (isMove) answer[1] = temp[1];
					}
				}
				case "W" -> {
					temp[1] -= Integer.parseInt(rInfo[1]);
					if (temp[1] >= 0) {
						for (int i = temp[1]; i < answer[1]; i++) {
							if (park[temp[0]].charAt(i) == 'X') {
								isMove = false;
								break;
							}
						}
						if (isMove) answer[1] = temp[1];
					}
				}
				case "S" -> {
					temp[0] += Integer.parseInt(rInfo[1]);
					if (temp[0] < height) {
						for (int i = answer[0] + 1; i <= temp[0]; i++) {
							if (park[i].charAt(answer[1]) == 'X') {
								isMove = false;
								break;
							}
						}
						if (isMove) answer[0] = temp[0];
					}
				}
				case "N" -> {
					temp[0] -= Integer.parseInt(rInfo[1]);
					if (temp[0] >= 0) {
						for (int i = temp[0]; i < answer[0]; i++) {
							if (park[i].charAt(answer[1]) == 'X') {
								isMove = false;
								break;
							}
						}
						if (isMove) answer[0] = temp[0];
					}
				}
			}
		}

		return answer;
	}

	public static void main(String[] args) {
		String[] park = {"SOO","OOO","OOO"};
		String[] routes = {"E 2","S 2","W 1"};
		Park arrayDivide = new Park();
		int[] solution = arrayDivide.solution(park, routes);
		System.out.println("solution = " + Arrays.toString(solution));
	}
}
