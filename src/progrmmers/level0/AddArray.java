package progrmmers.level0;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/*
programmers
level: 0
title: 배열의 원소만큼 추가하기
url: https://school.programmers.co.kr/learn/courses/30/lessons/181861
*/
public class AddArray {

	public int[] solution(int[] arr) {
		List<Integer> list = new ArrayList<>();
		for (int i : arr) {
			for (int j = 0; j < i; j++) {
				list.add(i);
			}
		}

		return list.stream().mapToInt(Integer::intValue).toArray();
	}

	public static void main(String[] args) {
		AddArray solution = new AddArray();

		int[] arr = {6, 1};
		int[] result = solution.solution(arr);
		System.out.println("result = " + Arrays.toString(result));
	}
}
