package progrmmers.level0;

import java.util.Arrays;

/*
programmers
level: 0
title: 배열의 유사도
url: https://school.programmers.co.kr/learn/courses/30/lessons/120903
*/
public class ArraySame {

	public int solution(String[] s1, String[] s2) {
		int answer = 0;
		for (String s : s1) {
			if (Arrays.asList(s2).contains(s)) {
				answer++;
			}
		}

		return answer;
	}

	public static void main(String[] args) {
		String[] s1 = {"a", "b", "c"};
		String[] s2 = {"com", "b", "d", "p", "c"};
		ArraySame solution = new ArraySame();
		int solution1 = solution.solution(s1, s2);
		System.out.println("result = " + (solution1));
	}
}
