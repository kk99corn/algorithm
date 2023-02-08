package progrmmers.level0;

/*
programmers
level: 0
title: 순서쌍의 개수
url: https://school.programmers.co.kr/learn/courses/30/lessons/120836
*/
public class NumberOfOrderedPairs {

	public int solution(int n) {
		int answer = 0;
		for (int i = 1; i <= Math.sqrt(n); i++)
			answer += n % i == 0 ? (n / i == Math.sqrt(n) ? 1 : 2) : 0;
		return answer;
	}

	public static void main(String[] args) {
		int n = 5;
		NumberOfOrderedPairs solution = new NumberOfOrderedPairs();
		int solution1 = solution.solution(n);
		System.out.println("result = " + (solution1));
	}
}
