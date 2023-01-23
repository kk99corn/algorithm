package progrmmers.level0;

import java.util.stream.IntStream;

/*
programmers
level: 0
title: 짝수의 합
url: https://school.programmers.co.kr/learn/courses/30/lessons/120831
*/
public class EvenSum {

	public int solution(int n) {
		return IntStream.range(0, n + 1)
				.filter(x -> x % 2 == 0)
				.sum();
	}

	public static void main(String[] args) {
		int age = 10;
		EvenSum solution = new EvenSum();
		int solution1 = solution.solution(age);
		System.out.println("result = " + (solution1));
	}
}
