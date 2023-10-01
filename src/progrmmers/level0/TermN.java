package progrmmers.level0;

import java.util.Arrays;

/*
programmers
level: 0
title: n개 간격의 원소들
url: https://school.programmers.co.kr/learn/courses/30/lessons/181888
*/
public class TermN {

	public int[] solution(int[] num_list, int n) {
		int l = num_list.length;
		int[] answer = new int[l / n + (l % n == 0 ? 0 : 1)];
		int x = 0;
		for (int i = 0; i < l; i++) {
			if (i % n == 0) {
				answer[x] = num_list[i];
				x++;
			}
		}
		return answer;
	}

	public static void main(String[] args) {
		TermN solution = new TermN();

		int[] num_list = {4, 2, 6, 1, 7, 6};
		int n = 2;
		int[] result = solution.solution(num_list, n);
		System.out.println("result = " + Arrays.toString(result));
	}
}
