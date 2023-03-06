package progrmmers.level1;

/*
programmers
level: 1
title: 콜라 문제
url: https://school.programmers.co.kr/learn/courses/30/lessons/132267
*/
public class Cola {

	public int solution(int a, int b, int n) {
		int answer = 0;
		while (n >= a) {
			n = n - a + b;
			answer += b;
		}

		return answer;
	}

	public static void main(String[] args) {
		int a = 2;
		int b = 1;
		int n = 20;
		Cola solution = new Cola();
		int solution1 = solution.solution(a, b, n);
		System.out.println("result = " + (solution1));
	}
}
