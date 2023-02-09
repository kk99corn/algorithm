package progrmmers.level0;

import java.util.Arrays;

/*
programmers
level: 0
title: 캐릭터의 좌표
url: https://school.programmers.co.kr/learn/courses/30/lessons/120861
*/
public class CharacterWhere {

	public int[] solution(String[] keyinput, int[] board) {
		int[] answer = {0, 0};
		for (String s : keyinput) {
			switch (s) {
				case "up" -> {
					if (answer[1] >= board[1] / 2) {
						continue;
					}
					answer[1] += 1;
				}
				case "down" -> {
					if (answer[1] <= -(board[1] / 2)) {
						continue;
					}
					answer[1] -= 1;
				}
				case "right" -> {
					if (answer[0] >= board[0] / 2) {
						continue;
					}
					answer[0] += 1;
				}
				default -> {
					if (answer[0] <= -(board[0] / 2)) {
						continue;
					}
					answer[0] -= 1;
				}
			}
		}
		return answer;
	}

	public static void main(String[] args) {
		String[] keyinput = {"left", "right", "up", "right", "right"};
		int[] board = {11, 11};
		CharacterWhere solution = new CharacterWhere();
		int[] solution1 = solution.solution(keyinput, board);
		System.out.println("result = " + Arrays.toString(solution1));
	}
}
