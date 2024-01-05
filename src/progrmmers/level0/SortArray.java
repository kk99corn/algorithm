package progrmmers.level0;

import java.util.Arrays;

/*
programmers
level: 0
title: 뒤에서 5등 위로
url: https://school.programmers.co.kr/learn/courses/30/lessons/181852
*/
public class SortArray {

	public int[] solution(int[] num_list) {
		Arrays.sort(num_list);
		return Arrays.copyOfRange(num_list, 5, num_list.length);
	}

	public static void main(String[] args) {
		SortArray solution = new SortArray();

		int[] num_list = {12, 4, 15, 46, 38, 1, 14, 56, 32, 10};
		int[] result = solution.solution(num_list);
		System.out.println("result = " + Arrays.toString(result));
	}
}
