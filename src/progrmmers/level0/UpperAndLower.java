package progrmmers.level0;

import java.util.stream.Collectors;

/*
programmers
level: 0
title: 대문자와 소문자
url: https://school.programmers.co.kr/learn/courses/30/lessons/120893
*/
public class UpperAndLower {

	public String solution(String my_string) {
		return my_string.chars()
				.mapToObj(c -> (c >= 97) ? String.valueOf((char) c).toUpperCase() : String.valueOf((char) c).toLowerCase())
				.collect(Collectors.joining());
	}

	public static void main(String[] args) {
		String my_string = "abCdEfghIJ";
		UpperAndLower solution = new UpperAndLower();
		String solution1 = solution.solution(my_string);
		System.out.println("result = " + (solution1));
	}
}
