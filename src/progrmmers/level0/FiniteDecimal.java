package progrmmers.level0;

/*
programmers
level: 0
title: 유한소수 판별하기
url: https://school.programmers.co.kr/learn/courses/30/lessons/120878
*/
public class FiniteDecimal {

	public int solution(int a, int b) {
		int gcf = getGCF(a, b);
		int x = b / gcf;

		return (1000000000 % x == 0) ? 1 : 2;
	}

	public static int getGCF(int num1, int num2) {
		return (num1 % num2 == 0) ? num2 : getGCF(num2, num1 % num2);
	}

	public static void main(String[] args) {
		int a = 7;
		int b = 20;
		FiniteDecimal solution = new FiniteDecimal();
		int solution1 = solution.solution(a, b);
		System.out.println("result = " + solution1);
	}
}
