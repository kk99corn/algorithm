package progrmmers.level0;

import java.util.Arrays;

/*
programmers
level: 0
title: 배열의 길이를 2의 거듭제곱으로 만들기
url: https://school.programmers.co.kr/learn/courses/30/lessons/181857
*/
public class Array2 {

	public int[] solution(int[] arr) {
		int length = 1;
		while (arr.length > length) {
			length *= 2;
		}

		int[] answer = new int[length];
		System.arraycopy(arr, 0, answer, 0, arr.length);
		return answer;
	}

	public static void main(String[] args) {
		Array2 solution = new Array2();

		int[] arr = {1, 2, 3, 4, 5, 6};
		int[] solution1 = solution.solution(arr);
		System.out.println("result = " + Arrays.toString(solution1));
	}
}
