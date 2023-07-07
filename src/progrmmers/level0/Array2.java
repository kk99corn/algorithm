package progrmmers.level0;

import java.util.Arrays;
import java.util.stream.IntStream;

/*
programmers
level: 0
title: 배열의 길이를 2의 거듭제곱으로 만들기
url: https://school.programmers.co.kr/learn/courses/30/lessons/181857
*/
public class Array2 {

	public int[] solutionStream(int[] arr) {
		int length = (int) Math.pow(2, (int) Math.ceil(Math.log(arr.length) / Math.log(2)));
		return IntStream.range(0, length)
				.map(i -> i < arr.length ? arr[i] : 0)
				.toArray();
	}

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

		int[] solution2 = solution.solutionStream(arr);
		System.out.println("result = " + Arrays.toString(solution2));
	}
}
