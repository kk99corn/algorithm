package progrmmers.level0;

import java.util.Arrays;

/*
programmers
level: 0
title: 배열 원소의 길이
url: https://school.programmers.co.kr/learn/courses/30/lessons/120854
*/
public class WordLength {

	public int[] solution(String[] strlist) {
		return Arrays.stream(strlist)
				.mapToInt(String::length)
				.toArray();
	}

	public static void main(String[] args) {
		String[] strlist = {"We", "are", "the", "world!"};
		WordLength solution = new WordLength();
		int[] solution1 = solution.solution(strlist);
		System.out.println("result = " + Arrays.toString(solution1));
	}
}
