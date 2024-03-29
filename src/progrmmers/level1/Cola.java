package progrmmers.level1;

import java.util.stream.IntStream;

/*
programmers
level: 1
title: 콜라 문제
url: https://school.programmers.co.kr/learn/courses/30/lessons/132267
*/
public class Cola {

	public int solution(int a, int b, int n) {
		int answer = 0;
		while (n >= a) {
			n = n - a + b;
			answer += b;
		}

		return answer;
	}

	public int solution_stream(int a, int b, int n) {
		return IntStream.iterate(n, num -> num >= a, num -> num - a + b)
				.map(num -> b)
				.sum();
	}

	public static void main(String[] args) {
		int a = 2;
		int b = 1;
		int n = 20;
		Cola solution = new Cola();
		int solution1 = solution.solution(a, b, n);
		System.out.println("result = " + (solution1));

		int solution2 = solution.solution_stream(a, b, n);
		System.out.println("result = " + (solution2));
	}
}
