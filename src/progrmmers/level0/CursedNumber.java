package progrmmers.level0;

/*
programmers
level: 0
title: 저주의 숫자 3
url: https://school.programmers.co.kr/learn/courses/30/lessons/120871
*/
public class CursedNumber {
	public int solution(int n) {
		int answer = 0;
		for (int i = 1; i <= n; i++) {
			answer++;
			while (true) {
				if (!(answer % 3 == 0 || Integer.toString(answer).contains("3"))) break;
				answer++;
			}
		}
		return answer;
	}

	public static void main(String[] args) {
		int n = 15;
		CursedNumber solution = new CursedNumber();
		int solution1 = solution.solution(n);
		System.out.println("result = " + solution1);
	}
}
