package progrmmers.level0;

/*
programmers
level: 0
title: 합성수 찾기
url: https://school.programmers.co.kr/learn/courses/30/lessons/120846
*/
public class CompositeNumber {

	public int solution(int n) {
		int answer = 0;
		for (int i = 1; i <= n; i++) {
			for (int j = 2; j < i; j++) {
				if (i % j == 0) {
					answer++;
					break;
				}
			}
		}
		return answer;
	}

	public static void main(String[] args) {
		int n = 15;
		CompositeNumber solution = new CompositeNumber();
		int solution1 = solution.solution(n);
		System.out.println("result = " + solution1);
	}
}
