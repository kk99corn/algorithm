package progrmmers.level0;

import java.util.Arrays;
import java.util.stream.Collectors;

/*
programmers
level: 0
title: 문자열 정렬하기 (2)
url: https://school.programmers.co.kr/learn/courses/30/lessons/120911
*/
public class StringSort {

	public String solution(String my_string) {
		return Arrays.stream(my_string.split(""))
				.map(String::toLowerCase)
				.sorted()
				.collect(Collectors.joining());
	}

	public static void main(String[] args) {
		String my_string = "Bcad";
		StringSort solution = new StringSort();
		String solution1 = solution.solution(my_string);
		System.out.println("result = " + solution1);
	}
}
