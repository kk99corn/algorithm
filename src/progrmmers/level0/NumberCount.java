package progrmmers.level0;

import java.util.Arrays;

/*
programmers
level: 0
title: 짝수 홀수 개수
url: https://school.programmers.co.kr/learn/courses/30/lessons/120824
*/
public class NumberCount {

	public int[] solution(int[] num_list) {
		int[] answer = new int[2];
		for (int n : num_list) {
			if (n % 2 == 0) {
				answer[0]++;
			} else {
				answer[1]++;
			}
		}
		return answer;
	}

	public static void main(String[] args) {
		int[] num_list = {1, 3, 5, 7};
		NumberCount solution = new NumberCount();
		int[] solution1 = solution.solution(num_list);
		System.out.println("result = " + Arrays.toString(solution1));
	}
}
