package progrmmers.level0;

import java.util.Arrays;

/*
programmers
level: 0
title: 중복된 숫자 개수
url: https://school.programmers.co.kr/learn/courses/30/lessons/120583
*/
public class DuplicateNumber {

	public int solution(int[] array, int n) {
		return (int) Arrays.stream(array)
				.filter(x -> x == n)
				.count();
	}

	public static void main(String[] args) {
		int[] array = {1, 1, 2, 3, 4, 5};
		int n = 1;
		DuplicateNumber solution = new DuplicateNumber();
		int solution1 = solution.solution(array, n);
		System.out.println("result = " + (solution1));
	}
}
