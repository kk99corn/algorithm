package progrmmers.level0;

/*
programmers
level: 0
title: 피자 나눠 먹기 (1)
url: https://school.programmers.co.kr/learn/courses/30/lessons/120814
*/
public class DividePizza1 {

	public int solution(int n) {
		int answer = 1;
		while (7 * answer < n) {
			answer++;
		}
		return answer;
	}

	public static void main(String[] args) {
		int n = 15;
		DividePizza1 solution = new DividePizza1();
		int solution1 = solution.solution(n);
		System.out.println("result = " + (solution1));
	}
}
