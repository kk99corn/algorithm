package progrmmers.level2;

import java.util.*;

/*
programmers
level: 2
title: n^2 배열 자르기
url: https://programmers.co.kr/learn/courses/30/lessons/87390
*/
public class BackSearch {
	// int[] numbers = {9, 1, 5, 3, 6, 2, 1};
	//				   -1, 5, 6, 6, -1, -1
	public int[] solution(int[] numbers) {
		int[] answer = new int[numbers.length];
		answer[numbers.length - 1] = -1;

		return answer;
	}

	public int[] solution2(int[] numbers) {
		int[] answer = new int[numbers.length];
		Arrays.fill(answer, -1);

		Set<Integer> skip = new HashSet<>();

		for (int i = 0; i < numbers.length - 1; i++) {
			int x = numbers[i];

			if (skip.contains(x)) {
				continue;
			}

			skip.add(x);
			for (int j = i + 1; j < numbers.length; j++) {
				if (x < numbers[j]) {
					skip.remove(x);
					answer[i] = numbers[j];
					break;
				}
			}
		}

		return answer;
	}

	public static void main(String[] args) {
		int[] numbers = {5, 1, 5, 2, 2, 5, 1, 1, 7, 7, 7, 8, 9};
		BackSearch arrayDivide = new BackSearch();
		int[] solution = arrayDivide.solution(numbers);
		System.out.println("solution = " + Arrays.toString(solution));
	}
}
