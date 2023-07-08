package progrmmers.level0;

/*
programmers
level: 0
title: 공배수
url: https://school.programmers.co.kr/learn/courses/30/lessons/181936
*/
public class CommonMultiple {

	public int solution(int number, int n, int m) {
		return (number % n == 0 && number % m == 0) ? 1 : 0;
	}

	public static void main(String[] args) {
		CommonMultiple solution = new CommonMultiple();

		int number = 60;
		int n = 2;
		int m = 3;
		int solution1 = solution.solution(number, n, m);
		System.out.println("result = " + (solution1));
	}
}
