package progrmmers.level0;

/*
programmers
level: 0
title: 더 크게 합치기
url: https://school.programmers.co.kr/learn/courses/30/lessons/181939
*/
public class BiggerNumber {

	public int solution(int a, int b) {
		return Math.max(Integer.parseInt(Integer.toString(a) + Integer.toString(b)), Integer.parseInt(Integer.toString(b) + Integer.toString(a)));
	}

	public static void main(String[] args) {
		BiggerNumber solution = new BiggerNumber();

		int a = 89;
		int b = 8;
		int result = solution.solution(a, b);
		System.out.println("result = " + (result));
	}
}
