package progrmmers.level0;

import java.util.Arrays;

/*
programmers
level: 0
title: 최댓값 만들기 (2)
url: https://school.programmers.co.kr/learn/courses/30/lessons/120862
*/
public class MakeMax {

	public int solution(int[] numbers) {
		Arrays.sort(numbers);
		int x = numbers[numbers.length - 1] * numbers[numbers.length - 2];
		int y = numbers[0] * numbers[1];

		return Integer.max(x, y);
	}

	public static void main(String[] args) {
		int[] n = {1, 2, -3, 4, -5};
		MakeMax solution = new MakeMax();
		int solution1 = solution.solution(n);
		System.out.println("result = " + (solution1));
	}
}
