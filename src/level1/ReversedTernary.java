package level1;

/*
programmers
level: 1
title: 3진법 뒤집기
url: https://programmers.co.kr/learn/courses/30/lessons/68935
*/
public class ReversedTernary {
	// StringBuilder 활용 풀이
	public int solution(int n) {
		// 1. n(10진수) -> 3진법 변환
		StringBuilder ternaryStr = new StringBuilder(Integer.toString(n, 3));

		// 2. 문자열 반전
		StringBuilder reversedTernaryStr = ternaryStr.reverse();

		// 3. 반전 문자열 10진수 변환
		return Integer.parseInt(reversedTernaryStr.toString(), 3);
	}

	// 최초 풀이
	public int solution_old(int n) {
		// 1. n(10진수) -> 3진법 변환
		String ternaryStr = Integer.toString(n, 3);

		// 2. 문자열 반전
		StringBuilder reversedTernaryStr = new StringBuilder();
		for (int i = ternaryStr.length() - 1; i >= 0; i--) {
			reversedTernaryStr.append(ternaryStr.charAt(i));
		}

		// 3. 반전 문자열 10진수 변환
		return Integer.parseInt(reversedTernaryStr.toString(), 3);
	}

	public static void main(String[] args) {
		ReversedTernary reversedTernary = new ReversedTernary();
		int result = reversedTernary.solution(45);
		System.out.println("result = " + result);
	}
}
