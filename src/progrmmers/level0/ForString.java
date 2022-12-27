package progrmmers.level0;

import java.util.Arrays;
import java.util.stream.Collectors;

/*
programmers
level: 0
title: 문자 반복 출력하기
url: https://school.programmers.co.kr/learn/courses/30/lessons/120825
*/
public class ForString {

	public String solution(String my_string, int n) {
		return Arrays.stream(my_string.split(""))
				.map(s -> new StringBuilder().append(String.valueOf(s).repeat(Math.max(0, n))))
				.collect(Collectors.joining());
	}

	public static void main(String[] args) {
		String my_string = "hello";
		int n = 3;
		ForString solution = new ForString();
		String solution1 = solution.solution(my_string, n);
		System.out.println("result = " + (solution1));
	}
}
