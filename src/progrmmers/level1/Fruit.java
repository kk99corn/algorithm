package progrmmers.level1;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

/*
programmers
level: 1
title: 과일 장수
url: https://school.programmers.co.kr/learn/courses/30/lessons/135808
*/
public class Fruit {

	public int solution(int k, int m, int[] score) {
		int answer = 0;
		List<Integer> scoreList = Arrays.stream(score).boxed()
				.sorted(Collections.reverseOrder())
				.collect(Collectors.toList());

		for (int i = 0; i < scoreList.size(); i = i + m) {
			if (i + m > scoreList.size()) break;
			answer += scoreList.get(i + m - 1) * m;
		}

		return answer;
	}

	public static void main(String[] args) {
		int k = 3;
		int m = 4;
		int[] score = {1, 2, 3, 1, 2, 3, 1};
		Fruit solution = new Fruit();
		int solution1 = solution.solution(k, m, score);
		System.out.println("result = " + (solution1));
	}
}
