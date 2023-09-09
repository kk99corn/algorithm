package progrmmers.level0;

/*
programmers
level: 0
title: n보다 커질 때까지 더하기
url: https://school.programmers.co.kr/learn/courses/30/lessons/181884
*/
public class PlusBetterN {

	public int solution(int[] numbers, int n) {
		int answer = 0;
		for (int number : numbers) {
			answer += number;
			if (n < answer) {
				break;
			}
		}
		return answer;
	}

	public static void main(String[] args) {
		PlusBetterN solution = new PlusBetterN();

		int[] numbers = {34, 5, 71, 29, 100, 34};
		int n = 123;
		int result = solution.solution(numbers, n);
		System.out.println("result = " + (result));
	}
}
