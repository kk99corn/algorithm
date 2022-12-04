package progrmmers.level0;

import java.util.Arrays;

/*
programmers
level: 0
title: 중앙값 구하기
url: https://school.programmers.co.kr/learn/courses/30/lessons/120811
*/
public class SelectCenter {

	public int solution(int[] array) {
		Arrays.sort(array);
		return array[(array.length - 1) / 2];
	}

	public static void main(String[] args) {
		int[] array = {1, 2, 7, 10, 11};
		SelectCenter solution = new SelectCenter();
		int solution1 = solution.solution(array);
		System.out.println("result = " + (solution1));
	}
}
