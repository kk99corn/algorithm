package progrmmers.level0;

import java.math.BigInteger;

/*
programmers
level: 0
title: 두 수의 합
url: https://school.programmers.co.kr/learn/courses/30/lessons/181846
*/
public class SumAB {

	public String solution(String a, String b) {
		return new BigInteger(a).add(new BigInteger(b)).toString();
	}

	public static void main(String[] args) {
		SumAB solution = new SumAB();
		String solution1 = solution.solution("18446744073709551615", "287346502836570928366");
		System.out.println("result = " + (solution1));
	}
}
