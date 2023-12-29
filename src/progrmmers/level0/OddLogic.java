package progrmmers.level0;

/*
programmers
level: 0
title: 홀짝에 따라 다른 값 반환하기
url: https://school.programmers.co.kr/learn/courses/30/lessons/181935
*/
public class OddLogic {

	public int solution(int n) {
		int answer = 0;
		if (n % 2 == 1) {
			for (int i = 1; i <= n; i = i + 2) {
				answer += i;
			}
		} else {
			for (int i = 2; i <= n; i = i + 2) {
				answer += (i * i);
			}
		}
		return answer;
	}

	public static void main(String[] args) {
		OddLogic solution = new OddLogic();

		int n = 8;
		int result = solution.solution(n);
		System.out.println("result = " + (result));
	}
}
