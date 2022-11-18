package progrmmers.level1;

import java.util.*;
import java.util.stream.Collectors;

/*
programmers
level: 1
title: 숫자 짝꿍
url: https://programmers.co.kr/learn/courses/30/lessons/131128
*/
public class NumberCouple {

	public String solution(String X, String Y) {
		StringBuilder answer = new StringBuilder();
		for (int i = 9; i >= 0; i--) {
			int targetCount = Math.min(getNumberCount(X, i), getNumberCount(Y, i));
			if (i == 0 && targetCount > 0 && answer.length() == 0) {
				answer.append("0");
			} else {
				answer.append(String.valueOf(i).repeat(Math.max(0, targetCount)));
			}
		}

		if (answer.length() == 0) answer.append("-1");

		return answer.toString();
	}

	public int getNumberCount(String str, int target) {
		return str.length() - str.replace(Integer.toString(target), "").length();
	}

	public static void main(String[] args) {
		String X = "20055";
		String Y = "2005";
		NumberCouple solution = new NumberCouple();
		String result = solution.solution(X, Y);
		System.out.println("result = " + result);
	}
}
