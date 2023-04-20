package progrmmers.level2;

import java.util.Arrays;

/*
programmers
level: 2
title: 숫자 카드 나누기
url: https://programmers.co.kr/learn/courses/30/lessons/135807
*/
public class NumberCard {

	public int solution(int[] arrayA, int[] arrayB) {
		int answer = 0;

		int a = gcd(arrayA);
		int b = gcd(arrayB);

		boolean isA = true;
		boolean isB = true;

		for (int i = 0; i < arrayA.length; i++) {
			if (arrayA[i] % b == 0) isB = false;
			if (arrayB[i] % a == 0) isA = false;

			if (!isA && !isB) break;
		}

		if (isA && isB) {
			answer = Math.max(a, b);
		} else if (isA) {
			answer = a;
		} else if (isB) {
			answer = b;
		}

		return answer;
	}

	public int gcd(int[] nums) {
		int result = nums[0];
		for (int i = 1; i < nums.length; i++) {
			result = gcd(result, nums[i]);
		}
		return result;
	}

	public int gcd(int a, int b) {
		if (b == 0) {
			return a;
		} else {
			return gcd(b, a % b);
		}
	}

	public static void main(String[] args) {
		int[] arrayA = {10, 17};
		int[] arrayB = {5, 20};
		NumberCard arrayDivide = new NumberCard();
		int solution = arrayDivide.solution(arrayA, arrayB);
		System.out.println("solution = " + (solution));
	}
}
