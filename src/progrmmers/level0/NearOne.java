package progrmmers.level0;

import java.util.stream.IntStream;

/*
programmers
level: 0
title: 가까운 1 찾기
url: https://school.programmers.co.kr/learn/courses/30/lessons/181898
*/
public class NearOne {

	public int solutionStream(int[] arr, int idx) {
		return IntStream.range(idx, arr.length)
				.filter(i -> arr[i] == 1)
				.findFirst()
				.orElse(-1);
	}

	public int solution(int[] arr, int idx) {
		int answer = -1;
		for (int i = idx; i < arr.length; i++) {
			if (arr[i] == 1) {
				answer = i;
				break;
			}
		}
		return answer;
	}

	public static void main(String[] args) {
		NearOne solution = new NearOne();

		int[] arr = {1, 0, 0, 1, 0, 0};
		int idx = 4;
		int answer = solution.solution(arr, idx);
		System.out.println("result = " + (answer));

		int answer2 = solution.solutionStream(arr, idx);
		System.out.println("result = " + (answer2));
	}
}
