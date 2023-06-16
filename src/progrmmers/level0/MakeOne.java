package progrmmers.level0;

import java.util.Arrays;

/*
programmers
level: 0
title: 1로 만들기
url: https://school.programmers.co.kr/learn/courses/30/lessons/181880
*/
public class MakeOne {

	public int solutionStream(int[] num_list) {
		return Arrays.stream(num_list)
				.map(num -> {
					int count = 0;
					while (num != 1) {
						num /= 2;
						count++;
					}
					return count;
				})
				.sum();
	}

	public int solution(int[] num_list) {
		int answer = 0;
		for (int num : num_list) {
			while (num != 1) {
				num /= 2;
				answer++;
			}
		}
		return answer;
	}

	public static void main(String[] args) {
		MakeOne solution = new MakeOne();

		int[] arr = {12, 4, 15, 1, 14};
		int solution1 = solution.solution(arr);
		System.out.println("result = " + (solution1));

		int solution2 = solution.solutionStream(arr);
		System.out.println("result = " + (solution2));
	}
}
