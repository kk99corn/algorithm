package progrmmers.level0;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/*
programmers
level: 0
title: 순서 바꾸기
url: https://school.programmers.co.kr/learn/courses/30/lessons/181891
*/
public class SortShuffle {

	public int[] solution(int[] num_list, int n) {
		List<Integer> list = new ArrayList<>();
		for (int i = n; i < num_list.length; i++) {
			list.add(num_list[i]);
		}
		for (int i = 0; i < n; i++) {
			list.add(num_list[i]);
		}

		return list.stream().mapToInt(Integer::intValue).toArray();
	}

	public static void main(String[] args) {
		SortShuffle solution = new SortShuffle();

		int[] num_list = {2, 1, 6};
		int n = 1;
		int[] result = solution.solution(num_list, n);
		System.out.println("result = " + Arrays.toString(result));
	}
}
