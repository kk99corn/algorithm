package progrmmers.level0;

/*
programmers
level: 0
title: 공 던지기
url: https://school.programmers.co.kr/learn/courses/30/lessons/120843
*/
public class ThrowBall {

	public int solution(int[] numbers, int k) {
		int answer = 1;
		for (int i = 1; i < k; i++) {
			if (answer + 2 > numbers.length) answer = answer - numbers.length;
			answer += 2;
		}
		return answer;
	}

	public static void main(String[] args) {
		int[] numbers = {1, 2, 3, 4, 5, 6};
		int k = 4;
		ThrowBall solution = new ThrowBall();
		int solution1 = solution.solution(numbers, k);
		System.out.println("result = " + solution1);
	}
}
