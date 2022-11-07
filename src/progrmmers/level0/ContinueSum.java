package progrmmers.level0;

import java.util.Arrays;

/*
programmers
level: 0
title: 연속된 수의 합
url: https://school.programmers.co.kr/learn/courses/30/lessons/120923
*/
public class ContinueSum {
	public int[] solution(int num, int total) {
		int[] answer = new int[num];

		int baseNum = total / num;
		int leftNum = baseNum;
		int rightNum = baseNum;

		int centerIdx = (num - 1) / 2;
		int leftIdx = centerIdx;
		int rightIdx = centerIdx;

		answer[centerIdx] = baseNum;
		for (int i = 0; i < centerIdx; i++) {
			answer[--leftIdx] = --leftNum;
			answer[++rightIdx] = ++rightNum;
		}

		if (num % 2 == 0) {
			answer[rightIdx + 1] = rightNum + 1;
		}

		return answer;
	}

	public static void main(String[] args) {
		int num = 3;
		int total = 12;
		ContinueSum continueSum = new ContinueSum();
		int[] solution = continueSum.solution(num, total);
		System.out.println(Arrays.toString(solution));
	}
}
