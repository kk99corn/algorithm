package progrmmers.level0;

import java.util.Arrays;

/*
programmers
level: 0
title: 2의 영역
url: https://school.programmers.co.kr/learn/courses/30/lessons/181894
*/
public class Area2 {

	public int[] solution(int[] arr) {
		Integer s = null, e = null;
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] == 2) {
				if (s == null) {
					s = i;
				} else {
					e = i;
				}
			}
		}

		int[] answer;
		if (s != null && e != null) {
			answer = Arrays.copyOfRange(arr, s, e + 1);
		} else {
			answer = new int[]{-1};
			if (s != null) {
				answer[0] = 2;
			}
		}

		return answer;
	}

	public static void main(String[] args) {
		Area2 solution = new Area2();

		int[] arr = {1, 2, 1, 4, 5, 2, 9};
		int[] solution1 = solution.solution(arr);
		System.out.println("result = " + Arrays.toString(solution1));
	}
}
