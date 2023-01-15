package progrmmers.level0;

import java.util.Arrays;

/*
programmers
level: 0
title: 배열의 평균값
url: https://school.programmers.co.kr/learn/courses/30/lessons/120817
*/
public class ArrayAvg {

	public double solution(int[] numbers) {
		return Arrays.stream(numbers).sum() / (double) numbers.length;
	}

	public static void main(String[] args) {
		int[] numbers = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
		ArrayAvg solution = new ArrayAvg();
		double solution1 = solution.solution(numbers);
		System.out.println("result = " + (solution1));
	}
}
