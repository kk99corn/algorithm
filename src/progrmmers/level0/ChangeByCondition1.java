package progrmmers.level0;

import java.util.Arrays;

/*
programmers
level: 0
title: 조건에 맞게 수열 변환하기 1
url: https://school.programmers.co.kr/learn/courses/30/lessons/181882
*/
public class ChangeByCondition1 {

	public int[] solution(int[] arr) {
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] >= 50 && arr[i] % 2 == 0) {
				arr[i] = arr[i] / 2;
				continue;
			}

			if (arr[i] < 50 && arr[i] % 2 == 1) {
				arr[i] = arr[i] * 2;
				continue;
			}
		}
		return arr;
	}

	public static void main(String[] args) {
		ChangeByCondition1 solution = new ChangeByCondition1();

		int[] arr = {1, 2, 3, 100, 99, 98};
		int[] result = solution.solution(arr);
		System.out.println("result = " + Arrays.toString(result));
	}
}
