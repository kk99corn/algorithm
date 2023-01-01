package progrmmers.level0;

import java.util.Arrays;

/*
programmers
level: 0
title: 최댓값 만들기 (1)
url: https://school.programmers.co.kr/learn/courses/30/lessons/120847
*/
public class MakeMax1 {

	public int solution(int[] numbers) {
		Arrays.sort(numbers);
		return numbers[numbers.length - 1] * numbers[numbers.length - 2];
	}

	public static void main(String[] args) {
		int[] n = {0, 31, 24, 10, 1, 9};
		MakeMax1 solution = new MakeMax1();
		int solution1 = solution.solution(n);
		System.out.println("result = " + (solution1));
	}
}
