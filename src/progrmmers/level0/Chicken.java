package progrmmers.level0;

/*
programmers
level: 0
title: 치킨 쿠폰
url: https://school.programmers.co.kr/learn/courses/30/lessons/120884
*/
public class Chicken {

	public int solution(int chicken) {
		int answer = 0;

		while (true) {
			answer += chicken / 10;
			chicken = chicken % 10 + chicken / 10;

			if (chicken < 10) break;
		}

		return answer;
	}

	public static void main(String[] args) {
		int chicken = 1081;
		Chicken solution = new Chicken();
		int solution1 = solution.solution(chicken);
		System.out.println("result = " + solution1);
	}
}
