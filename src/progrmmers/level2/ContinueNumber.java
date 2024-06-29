package progrmmers.level2;

import java.util.Arrays;

/*
programmers
level: 2
title: 연속된 부분 수열의 합
url: https://programmers.co.kr/learn/courses/30/lessons/178870
*/
public class ContinueNumber {

	public int[] solution(int[] sequence, int k) {
		int start = 0, end = 0, currentSum = 0;
		int minLength = Integer.MAX_VALUE;
		int[] result = new int[2];

		while (end < sequence.length) {
			currentSum += sequence[end];

			while (currentSum > k && start <= end) {
				currentSum -= sequence[start];
				start++;
			}

			if (currentSum == k) {
				if ((end - start + 1) < minLength) {
					minLength = end - start + 1;
					result[0] = start;
					result[1] = end;
				}
			}

			end++;
		}

		return result;
	}

	public static void main(String[] args) {
		ContinueNumber continueNumber = new ContinueNumber();
		int[] sequence = {1, 1, 1, 2, 3, 4, 5};
		int k = 5;
		int[] solution = continueNumber.solution(sequence, k);
		System.out.println("solution = " + Arrays.toString(solution));
	}
}
