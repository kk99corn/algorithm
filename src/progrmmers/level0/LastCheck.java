package progrmmers.level0;

import java.util.Arrays;

/*
programmers
level: 0
title: 마지막 두 원소
url: https://school.programmers.co.kr/learn/courses/30/lessons/181927
*/
public class LastCheck {

	public int[] solution(int[] num_list) {
		int length = num_list.length;
		int[] answer = new int [length + 1];

		if (num_list[length - 1] > num_list[length - 2]) {
			answer[length] = num_list[length - 1] - num_list[length - 2];
		} else {
			answer[length] = num_list[length - 1] * 2;
		}

		for (int i = 0; i < length; i++) {
			answer[i] = num_list[i];
		}

		return answer;
	}

	public static void main(String[] args) {
		LastCheck solution = new LastCheck();

		int[] num_list = {2, 1, 6};
		int[] result = solution.solution(num_list);
		System.out.println("result = " + Arrays.toString(result));
	}
}
