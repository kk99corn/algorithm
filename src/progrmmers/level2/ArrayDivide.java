package progrmmers.level2;

import java.util.Arrays;

/*
programmers
level: 2
title: n^2 배열 자르기
url: https://programmers.co.kr/learn/courses/30/lessons/87390
*/
public class ArrayDivide {
	public int[] solution(int n, long left, long right) {
		int[] answer = new int[(int) (right - left + 1)];

		int num = 0;
		long idx = 0L;
		int answerIdx = 0;

		long start = left / n;
		if (left % n == 0) start--;
		idx = n * start;

		for (int i = (int) start; i < n; i++) {
			num = i + 1;
			for (int j = 0; j < n; j++) {
				if (idx >= left && idx <= right) {
					answer[answerIdx] = num;
					answerIdx++;
				}
				if (right < idx) {
					return answer;
				}
				if (j >= i) {
					num++;
				}
				idx++;
			}
		}

		return answer;
	}

	public static void main(String[] args) {
		ArrayDivide arrayDivide = new ArrayDivide();
		int[] solution = arrayDivide.solution(3, 2, 5);
		System.out.println("solution = " + Arrays.toString(solution));
	}
}
