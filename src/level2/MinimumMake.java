package level2;

import java.util.Arrays;

/*
programmers
level: 2
title: 최솟값 만들기
url: https://programmers.co.kr/learn/courses/30/lessons/12941
*/
public class MinimumMake {
	public int solution(int[] A, int[] B) {
		int answer = 0;

		Arrays.sort(A);
		Arrays.sort(B);

		for (int i = 0; i < A.length; i++) {
			answer += (A[i] * B[A.length - 1 - i]);
		}
		return answer;
	}

	public static void main(String[] args) {
		int[] A = {1, 4, 2};
		int[] B = {5, 4, 4};

		MinimumMake minimumMake = new MinimumMake();
		int solution = minimumMake.solution(A, B);
		System.out.println("solution = " + solution);
	}
}
