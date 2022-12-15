package progrmmers.level0;

import java.util.Arrays;
import java.util.regex.Pattern;

/*
programmers
level: 0
title: 문자열 정렬하기 (1)
url: https://school.programmers.co.kr/learn/courses/30/lessons/120850
*/
public class StringSort2 {

	public int[] solution(String my_string) {
		return Arrays.stream(my_string.split(""))
				.filter(s -> Pattern.matches("[0-9]", s))
				.sorted()
				.mapToInt(Integer::parseInt)
				.toArray();
	}

	public static void main(String[] args) {
		String my_string = "hi12392";
		StringSort2 solution = new StringSort2();
		int[] solution1 = solution.solution(my_string);
		System.out.println("result = " + Arrays.toString(solution1));
	}
}
