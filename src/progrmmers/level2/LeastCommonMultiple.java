package progrmmers.level2;

import java.util.Arrays;

/*
programmers
level: 2
title: N개의 최소공배수
url: https://programmers.co.kr/learn/courses/30/lessons/12953
*/
public class LeastCommonMultiple {

	public int solutionStream(int[] arr) {
		if (arr.length == 1) return arr[0];

		return Arrays.stream(arr)
				.reduce(1, (acc, num) -> acc * num / getCommonDenominator(acc, num));
	}

	public int solution(int[] arr) {
		if (arr.length == 1) return arr[0];

		int answer = arr[0];
		for (int i = 1; i < arr.length; i++) {
			int gcd = getCommonDenominator(answer, arr[i]);
			answer = (answer * arr[i]) / gcd;
		}

		return answer;
	}

	public int getCommonDenominator(int n1, int n2) {
		if (n1 % n2 == 0) return n2;
		return getCommonDenominator(n2, n1 % n2);
	}

	public static void main(String[] args) {
		int[] arr = {2, 6, 8, 14};
		LeastCommonMultiple leastCommonMultiple = new LeastCommonMultiple();
		int solution = leastCommonMultiple.solution(arr);
		System.out.println("solution = " + solution);

		int solution2 = leastCommonMultiple.solutionStream(arr);
		System.out.println("solution = " + solution2);
	}
}
