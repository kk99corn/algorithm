package progrmmers.level0;

import java.util.Arrays;

/*
programmers
level: 0
title: 문자 개수 세기
url: https://school.programmers.co.kr/learn/courses/30/lessons/181902
*/
public class CountString {

	public int[] solutionStream(String my_string) {
		return my_string.chars()
				.map(this::getIndex)
				.filter(idx -> idx >= 0 && idx < 52)
				.collect(
						() -> new int[52],
						(arr, idx) -> arr[idx] += 1,
						(arr1, arr2) -> {
							for (int i = 0; i < arr1.length; i++) {
								arr1[i] += arr2[i];
							}
						}
				);
	}

	private int getIndex(int charIdx) {
		if (charIdx >= 65 && charIdx <= 90) {
			return charIdx - 65;
		} else {
			return charIdx - 71;
		}
	}

	public int[] solution(String my_string) {
		int[] answer = new int[52];
		for (int i = 0; i <my_string.length(); i++) {
			int charIdx = my_string.charAt(i);
			if (charIdx >= 65 && charIdx <= 90) {
				answer[charIdx - 65] += 1;
			} else {
				answer[charIdx - 71] += 1;
			}
		}
		return answer;
	}

	public static void main(String[] args) {
		CountString solution = new CountString();
		String my_string = "Programmers";
		int[] solution1 = solution.solution(my_string);
		System.out.println("result = " + Arrays.toString(solution1));

		int[] solution2 = solution.solutionStream(my_string);
		System.out.println("result = " + Arrays.toString(solution2));
	}
}
