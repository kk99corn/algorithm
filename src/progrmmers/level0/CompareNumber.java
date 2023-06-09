package progrmmers.level0;

/*
programmers
level: 0
title: 두 수의 연산값 비교하기
url: https://school.programmers.co.kr/learn/courses/30/lessons/181938
*/
public class CompareNumber {

	public int solution(int a, int b) {
		return Math.max(Integer.parseInt(a + "" + b), 2 * a * b);
	}

	public static void main(String[] args) {
		CompareNumber solution = new CompareNumber();

		int a = 2;
		int b = 91;
		int solution1 = solution.solution(a, b);
		System.out.println("result = " + (solution1));
	}
}
