package progrmmers.level0;

import java.util.Arrays;

/*
programmers
level: 0
title: 배열 뒤집기
url: https://school.programmers.co.kr/learn/courses/30/lessons/120821
*/
public class ReverseArray {

	public int[] solution(int[] num_list) {
		int size = num_list.length;
		int[] answer = new int[size];

		for (int i = 0; i < size; i++) {
			answer[i] = num_list[size - i - 1];
		}
		return answer;
	}

	public static void main(String[] args) {
		int[] num_list = {1, 2, 3, 4, 5};
		ReverseArray solution = new ReverseArray();
		int[] solution1 = solution.solution(num_list);
		System.out.println("result = " + Arrays.toString(solution1));
	}
}
