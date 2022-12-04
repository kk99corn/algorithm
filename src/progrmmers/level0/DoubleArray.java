package progrmmers.level0;

import java.util.Arrays;

/*
programmers
level: 0
title: 배열 두 배 만들기
url: https://school.programmers.co.kr/learn/courses/30/lessons/120809
*/
public class DoubleArray {

	public int[] solution(int[] numbers) {
		return Arrays.stream(numbers)
				.boxed()
				.mapToInt(n -> n * 2)
				.toArray();
	}

	public static void main(String[] args) {
		int[] numbers = {1, 2, 100, -99, 1, 2, 3};
		DoubleArray solution = new DoubleArray();
		int[] solution1 = solution.solution(numbers);
		System.out.println("result = " + Arrays.toString(solution1));
	}
}
