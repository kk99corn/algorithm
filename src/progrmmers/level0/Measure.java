package progrmmers.level0;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/*
programmers
level: 0
title: 약수 구하기
url: https://school.programmers.co.kr/learn/courses/30/lessons/120897
*/
public class Measure {

	public int[] solution(int n) {
		List<Integer> measureList = new ArrayList<>();
		for (int i = 1; i <= n; i++) {
			if (n % i == 0) {
				measureList.add(i);
			}
		}

		int[] answer = new int[measureList.size()];
		for (int i = 0; i < measureList.size(); i++) {
			answer[i] = measureList.get(i);
		}
		return answer;
	}

	public static void main(String[] args) {
		int n = 24;
		Measure solution = new Measure();
		int[] solution1 = solution.solution(n);
		System.out.println("result = " + Arrays.toString(solution1));
	}
}
