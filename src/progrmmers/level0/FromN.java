package progrmmers.level0;

import java.util.Arrays;

/*
programmers
level: 0
title: n 번째 원소부터
url: https://school.programmers.co.kr/learn/courses/30/lessons/181892
*/
public class FromN {

	public int[] solution(int[] num_list, int n) {
		int[] answer = new int[num_list.length - (n - 1)];
		for (int i = 0; i < answer.length; i++) {
			answer[i] = num_list[n + i - 1];
		}
		return answer;
	}

	public static void main(String[] args) {
		FromN solution = new FromN();

		int[] num_list = {2, 1, 6};
		int n = 3;
		int[] result = solution.solution(num_list, n);
		System.out.println("result = " + Arrays.toString(result));
	}
}
