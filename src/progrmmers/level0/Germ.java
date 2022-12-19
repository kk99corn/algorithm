package progrmmers.level0;

import java.util.Arrays;

/*
programmers
level: 0
title: 세균 증식
url: https://school.programmers.co.kr/learn/courses/30/lessons/120910
*/
public class Germ {

	public int solution(int n, int t) {
		int answer = n;
		for (int i = 0; i < t; i++) {
			answer *= 2;
		}
		return answer;
	}

	public static void main(String[] args) {
		int n = 7;
		int t = 15;
		Germ solution = new Germ();
		int solution1 = solution.solution(n, t);
		System.out.println("result = " + (solution1));
	}
}
