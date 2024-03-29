package progrmmers.level0;

import java.util.Arrays;

/*
programmers
level: 0
title: 문자열 여러 번 뒤집기
url: https://school.programmers.co.kr/learn/courses/30/lessons/181913
*/
public class ReverseString2 {

	public String solutionStream(String my_string, int[][] queries) {
		StringBuilder sb = new StringBuilder(my_string);
		return Arrays.stream(queries)
				.reduce(sb, (s, query) -> s.replace(query[0], query[1] + 1, new StringBuilder(s.substring(query[0], query[1] + 1)).reverse().toString()), (s1, s2) -> s1)
				.toString();
	}

	public String solution(String my_string, int[][] queries) {
		StringBuilder sb = new StringBuilder(my_string);
		for (int[] query : queries) {
			sb.replace(query[0], query[1] + 1, new StringBuilder(sb.substring(query[0], query[1] + 1)).reverse().toString());
		}
		return sb.toString();
	}

	public static void main(String[] args) {
		ReverseString2 solution = new ReverseString2();

		String my_string = "rermgorpsam";
		int[][] queries = {{2, 3}, {0, 7}, {5, 9}, {6, 10}};
		String solution1 = solution.solution(my_string, queries);
		System.out.println("result = " + (solution1));

		String solution2 = solution.solutionStream(my_string, queries);
		System.out.println("result = " + (solution2));
	}
}
