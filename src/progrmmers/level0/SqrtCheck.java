package progrmmers.level0;

import java.util.Arrays;

/*
programmers
level: 0
title: 제곱수 판별하기
url: https://school.programmers.co.kr/learn/courses/30/lessons/120909
*/
public class SqrtCheck {

	public int solution(int n) {
		return (Math.sqrt(n) == (int) Math.sqrt(n)) ? 1 : 2;
	}

	public static void main(String[] args) {
		int n = 976;
		SqrtCheck solution = new SqrtCheck();
		int solution1 = solution.solution(n);
		System.out.println("result = " + (solution1));
	}
}
