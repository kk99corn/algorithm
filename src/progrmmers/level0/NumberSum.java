package progrmmers.level0;

import java.util.Arrays;

/*
programmers
level: 0
title: 자릿수 더하기
url: https://school.programmers.co.kr/learn/courses/30/lessons/120906
*/
public class NumberSum {

	public int solution(int n) {
		return Arrays.stream(Integer.toString(n).split(""))
				.mapToInt(Integer::parseInt)
				.sum();
	}

	public static void main(String[] args) {
		int n = 1234;
		NumberSum solution = new NumberSum();
		int solution1 = solution.solution(n);
		System.out.println("result = " + (solution1));
	}
}
