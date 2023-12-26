package progrmmers.level0;

import java.util.Arrays;

/*
programmers
level: 0
title: 배열 비교하기
url: https://school.programmers.co.kr/learn/courses/30/lessons/181856
*/
public class CompareArray {

	public int solution(int[] arr1, int[] arr2) {
		int a, b;
		if (arr1.length == arr2.length) {
			a = Arrays.stream(arr1).sum();
			b = Arrays.stream(arr2).sum();
		} else {
			a = arr1.length;
			b = arr2.length;
		}

		return Integer.compare(a, b);
	}

	public static void main(String[] args) {
		CompareArray solution = new CompareArray();

		int[] arr1 = {100, 17, 84, 1};
		int[] arr2 = {55, 12, 65, 36};
		int result = solution.solution(arr1, arr2);
		System.out.println("result = " + (result));
	}
}
