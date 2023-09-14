package progrmmers.level0;

import java.util.Arrays;

/*
programmers
level: 0
title: 조건에 맞게 수열 변환하기 3
url: https://school.programmers.co.kr/learn/courses/30/lessons/181835
*/
public class ChangeByCondition {

	public int[] solution(int[] arr, int k) {
		for (int i = 0; i < arr.length; i++) {
			if (k % 2 == 1) {
				arr[i] = arr[i] * k;
			} else {
				arr[i] = arr[i] + k;
			}
		}
		return arr;
	}

	public static void main(String[] args) {
		ChangeByCondition solution = new ChangeByCondition();

		int[] arr = {1, 2, 3, 100, 99, 98};
		int k = 3;
		int[] result = solution.solution(arr, k);
		System.out.println("result = " + Arrays.toString(result));
	}
}
