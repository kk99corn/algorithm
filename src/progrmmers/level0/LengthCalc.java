package progrmmers.level0;

import java.util.Arrays;

/*
programmers
level: 0
title: 길이에 따른 연산
url: https://school.programmers.co.kr/learn/courses/30/lessons/181879
*/
public class LengthCalc {

	public int solutionStream(int[] num_list) {
		int answer = Arrays.stream(num_list).reduce((a, b) -> a * b).orElse(0);
		if (num_list.length > 10) {
			answer = Arrays.stream(num_list).sum();
		}

		return answer;
	}

	public int solution(int[] num_list) {
		int answer = 0;
		if (num_list.length > 10) {
			for (int i : num_list) {
				answer += i;
			}
		} else {
			answer = 1;
			for (int i : num_list) {
				answer *= i;
			}
		}
		return answer;
	}

	public static void main(String[] args) {
		LengthCalc solution = new LengthCalc();

		int[] num_list = {3, 4, 5, 2, 5, 4, 6, 7, 3, 7, 2, 2, 1};
		int solution1 = solution.solution(num_list);
		System.out.println("result = " + (solution1));

		int solution2 = solution.solutionStream(num_list);
		System.out.println("result = " + (solution2));
	}
}
