package progrmmers.level0;

/*
programmers
level: 0
title: 팩토리얼
url: https://school.programmers.co.kr/learn/courses/30/lessons/120848
*/
public class Factorial {

	public int solution(int n) {
		int answer = 1;
		int x = 1;

		while (x <= n) {
			answer++;
			x *= answer;
		}

		return answer - 1;
	}


	public static void main(String[] args) {
		int n = 3628800;
		Factorial solution = new Factorial();
		int solution1 = solution.solution(n);
		System.out.println("result = " + solution1);
	}
}
