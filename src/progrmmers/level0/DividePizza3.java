package progrmmers.level0;

/*
programmers
level: 0
title: 피자 나눠 먹기 (3)
url: https://school.programmers.co.kr/learn/courses/30/lessons/120816
*/
public class DividePizza3 {

	public int solution(int slice, int n) {
		int answer = 1;
		while (slice * answer < n) {
			answer++;
		}
		return answer;
	}

	public static void main(String[] args) {
		int slice = 7;
		int n = 10;
		DividePizza3 solution = new DividePizza3();
		int solution1 = solution.solution(slice, n);
		System.out.println("result = " + (solution1));
	}
}
