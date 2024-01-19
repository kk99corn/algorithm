package progrmmers.level0;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/*
programmers
level: 0
title: 배열 만들기 1
url: https://school.programmers.co.kr/learn/courses/30/lessons/181901
*/
public class MultipleArray {

	public int[] solution(int n, int k) {
		List<Integer> list = new ArrayList<>();
		for (int i = 1; i <= n; i++) {
			if (i % k == 0) list.add(i);
		}

		return list.stream().mapToInt(Integer::intValue).toArray();
	}

	public static void main(String[] args) {
		MultipleArray solution = new MultipleArray();

		int n = 10;
		int k = 3;
		int[] result = solution.solution(n, k);
		System.out.println("result = " + Arrays.toString(result));
	}
}
