package progrmmers.level0;

import java.util.Arrays;

/*
programmers
level: 0
title: 숨어있는 숫자의 덧셈 (1)
url: https://school.programmers.co.kr/learn/courses/30/lessons/120851
*/
public class HidingNumberSum {

	public int solution(String my_string) {
		return Arrays.stream(my_string.split(""))
				.filter(s -> {
					try {
						Integer.parseInt(s);
					} catch (Exception e) {
						return false;
					}
					return true;
				})
				.mapToInt(Integer::parseInt)
				.sum();
	}

	public static void main(String[] args) {
		String my_string = "aAb1B2cC34oOp";
		HidingNumberSum solution = new HidingNumberSum();
		int solution1 = solution.solution(my_string);
		System.out.println("result = " + (solution1));
	}
}
