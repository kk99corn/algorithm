package progrmmers.level0;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/*
programmers
level: 0
title: 배열 조각하기
url: https://school.programmers.co.kr/learn/courses/30/lessons/181893
*/
public class ArrayPiece {

	public int[] solution(int[] arr, int[] query) {
		List<Integer> list = new ArrayList<>(Arrays.asList(Arrays.stream(arr).boxed().toArray(Integer[]::new)));
		for (int i = 0; i < query.length; i++) {
			if (i % 2 == 0) {
				list.subList(query[i] + 1, list.size()).clear();
			} else {
				list.subList(0, query[i]).clear();
			}
		}
		return list.stream().mapToInt(Integer::intValue).toArray();
	}

	public static void main(String[] args) {
		int[] arr = {0, 1, 2, 3, 4, 5};
		int[] query = {4, 1, 2};
		ArrayPiece solution = new ArrayPiece();
		int[] solution1 = solution.solution(arr, query);
		System.out.println("result = " + Arrays.toString(solution1));
	}
}
