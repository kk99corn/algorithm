package progrmmers.level0;

/*
programmers
level: 0
title: 주사위의 개수
url: https://school.programmers.co.kr/learn/courses/30/lessons/120845
*/
public class DiceCount {

	public int solution(int[] box, int n) {
		int answer = 1;
		for (int b : box) {
			answer *= (b / n);
		}
		return answer;
	}

	public static void main(String[] args) {
		int[] box = {1, 1, 1};
		int n = 1;
		DiceCount solution = new DiceCount();
		int solution1 = solution.solution(box, n);
		System.out.println("result = " + (solution1));
	}
}
