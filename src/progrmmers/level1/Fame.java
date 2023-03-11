package progrmmers.level1;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/*
programmers
level: 1
title: 명예의 전당 (1)
url: https://school.programmers.co.kr/learn/courses/30/lessons/138477
*/
public class Fame {

	public int[] solution(int k, int[] score) {
		int[] answer = new int[score.length];
		List<Integer> scoreList = new ArrayList<>();

		for (int i = 0; i < score.length; i++) {
			scoreList.add(score[i]);
			Collections.sort(scoreList);

			if (k < scoreList.size()) {
				scoreList.remove(0);
			}
			answer[i] = scoreList.get(0);
		}

		return answer;
	}

	public static void main(String[] args) {
		int k = 3;
		int[] score = {10, 100, 20, 150, 1, 100, 200};
		Fame solution = new Fame();
		int[] solution1 = solution.solution(k, score);
		System.out.println("result = " + Arrays.toString(solution1));
	}
}
