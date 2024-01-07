package progrmmers.level0;

import java.util.Arrays;

/*
programmers
level: 0
title: 뒤에서 5등까지
url: https://school.programmers.co.kr/learn/courses/30/lessons/181853
*/
public class SortArrayFront {

	public int[] solution(int[] num_list) {
		Arrays.sort(num_list);
		return Arrays.copyOfRange(num_list, 0, 5);
	}

	public static void main(String[] args) {
		SortArrayFront solution = new SortArrayFront();

		int[] num_list = {12, 4, 15, 46, 38, 1, 14, 56, 32, 10};
		int[] result = solution.solution(num_list);
		System.out.println("result = " + Arrays.toString(result));
	}
}
