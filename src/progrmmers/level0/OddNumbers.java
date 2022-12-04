package progrmmers.level0;

import java.util.Arrays;
import java.util.stream.IntStream;

/*
programmers
level: 0
title: 짝수는 싫어요
url: https://school.programmers.co.kr/learn/courses/30/lessons/120813
*/
public class OddNumbers {

	public int[] solution(int n) {
		return IntStream.range(1, n + 1)
				.filter(x -> x % 2 == 1)
				.toArray();
	}

	public static void main(String[] args) {
		int n = 10;
		OddNumbers solution = new OddNumbers();
		int[] solution1 = solution.solution(n);
		System.out.println("result = " + Arrays.toString(solution1));
	}
}
