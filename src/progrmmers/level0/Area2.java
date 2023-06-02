package progrmmers.level0;

import java.util.Arrays;
import java.util.stream.IntStream;

/*
programmers
level: 0
title: 2의 영역
url: https://school.programmers.co.kr/learn/courses/30/lessons/181894
*/
public class Area2 {

	public int[] solutionStream(int[] arr) {
		int s = IntStream.range(0, arr.length)
				.filter(i -> arr[i] == 2)
				.findFirst()
				.orElse(-1);

		int e = IntStream.range(s + 1, arr.length)
				.filter(i -> arr[i] == 2)
				.findFirst()
				.orElse(-1);

		if (s != -1 && e != -1) {
			return Arrays.copyOfRange(arr, s, e + 1);
		} else {
			return (s != -1) ? new int[]{2} : new int[]{-1};
		}
	}

	public int[] solution(int[] arr) {
		Integer s = null, e = null;
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] == 2) {
				if (s == null) {
					s = i;
				} else {
					e = i;
				}
			}
		}

		int[] answer;
		if (s != null && e != null) {
			answer = Arrays.copyOfRange(arr, s, e + 1);
		} else {
			answer = new int[]{-1};
			if (s != null) {
				answer[0] = 2;
			}
		}

		return answer;
	}

	public static void main(String[] args) {
		Area2 solution = new Area2();

		int[] arr = {1, 2, 1, 4, 5, 2, 9};
		int[] solution1 = solution.solution(arr);
		System.out.println("result = " + Arrays.toString(solution1));

		int[] solution2 = solution.solutionStream(arr);
		System.out.println("result = " + Arrays.toString(solution2));
	}
}
