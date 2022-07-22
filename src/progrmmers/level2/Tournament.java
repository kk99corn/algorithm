package progrmmers.level2;

/*
programmers
level: 2
title: 예상 대진표
url: https://programmers.co.kr/learn/courses/30/lessons/12985
*/
public class Tournament {
	public int solution(int n, int a, int b) {
		int answer = 0;
		while (true) {
			a = a / 2 + a % 2;
			b = b / 2 + b % 2;
			answer++;
			if (a == b) return answer;
		}
	}

	public static void main(String[] args) {
		Tournament tournament = new Tournament();
		int solution = tournament.solution(8, 4, 7);
		System.out.println("solution = " + solution);
	}
}
