package progrmmers.level0;

/*
programmers
level: 0
title: n의 배수
url: https://school.programmers.co.kr/learn/courses/30/lessons/181937
*/
public class MultipleOfN {

	public int solution(int num, int n) {
		return (num % n == 0) ? 1 : 0;
	}

	public static void main(String[] args) {
		MultipleOfN solution = new MultipleOfN();

		int num = 98;
		int n = 2;
		int result = solution.solution(num, n);
		System.out.println("result = " + (result));
	}
}
