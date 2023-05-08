package progrmmers.level0;

import java.util.Arrays;

/*
programmers
level: 0
title: 무작위로 K개의 수 뽑기
url: https://school.programmers.co.kr/learn/courses/30/lessons/181858
*/
public class PickK {

	public int[] solution(int[] arr, int k) {
		int[] answer = new int[k];
		int[] distinctArr = Arrays.stream(arr).distinct().toArray();

		Arrays.fill(answer, -1);
		System.arraycopy(distinctArr, 0, answer, 0, Math.min(k, distinctArr.length));

		return answer;
	}

	public static void main(String[] args) {
		PickK solution = new PickK();

		int[] arr = {0, 1, 1, 2, 2, 3};
		int k = 3;
		int[] solution1 = solution.solution(arr, k);
		System.out.println("result = " + Arrays.toString(solution1));
	}
}
