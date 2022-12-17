package progrmmers.level0;

import java.util.Arrays;

/*
programmers
level: 0
title: n의 배수 고르기
url: https://school.programmers.co.kr/learn/courses/30/lessons/120905
*/
public class MultipleN {

	public int[] solution(int n, int[] numlist) {
		return Arrays.stream(numlist)
				.filter(x -> x % n == 0)
				.toArray();
	}

	public static void main(String[] args) {
		int n = 3;
		int[] numlist = {4, 5, 6, 7, 8, 9, 10, 11, 12};
		MultipleN solution = new MultipleN();
		int[] solution1 = solution.solution(n, numlist);
		System.out.println("result = " + Arrays.toString(solution1));
	}
}
