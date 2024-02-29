package progrmmers.level0;

/*
programmers
level: 0
title: 주사위 게임 1
url: https://school.programmers.co.kr/learn/courses/30/lessons/181839
*/
public class DiceGame1 {

	public int solution(int a, int b) {
		int answer;
		if (a % 2 == 1 && b % 2 == 1) {
			answer = a * a + b * b;
		} else if (a % 2 == 0 && b % 2 == 0) {
			answer = Math.abs(a - b);
		} else {
			answer = 2 * (a + b);
		}
		return answer;
	}

	public static void main(String[] args) {
		DiceGame1 solution = new DiceGame1();

		int a = 3;
		int b = 3;
		int result = solution.solution(a, b);
		System.out.println("result = " + (result));
	}
}
