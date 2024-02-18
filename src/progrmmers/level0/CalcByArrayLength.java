package progrmmers.level0;

import java.util.Arrays;

/*
programmers
level: 0
title: 배열의 길이에 따라 다른 연산하기
url: https://school.programmers.co.kr/learn/courses/30/lessons/181854
*/
public class CalcByArrayLength {

	public int[] solution(int[] arr, int n) {
		int[] answer = new int[arr.length];
		for (int i = 0; i < arr.length; i++) {
			answer[i] = arr[i];
			if (arr.length % 2 == 0 && i % 2 == 1) answer[i] += n;
			if (arr.length % 2 == 1 && i % 2 == 0) answer[i] += n;
		}
		return answer;
	}

	public static void main(String[] args) {
		CalcByArrayLength solution = new CalcByArrayLength();

		int[] arr = {49, 12, 100, 276, 33};
		int n = 27;
		int[] result = solution.solution(arr, n);
		System.out.println("result = " + Arrays.toString(result));
	}
}
