package progrmmers.level0;

/*
programmers
level: 0
title: 두 수의 나눗셈
url: https://school.programmers.co.kr/learn/courses/30/lessons/120806
*/
public class TwoNumberDivide {

	public int solution(int num1, int num2) {
		return (int) (((double) num1 / num2) * 1000);
	}

	public static void main(String[] args) {
		int n1 = 1;
		int n2 = 16;
		TwoNumberDivide solution = new TwoNumberDivide();
		int solution1 = solution.solution(n1, n2);
		System.out.println("result = " + solution1);
	}
}
