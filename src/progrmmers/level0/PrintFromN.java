package progrmmers.level0;

import java.util.Arrays;

/*
programmers
level: 0
title: n 번째 원소까지
url: https://school.programmers.co.kr/learn/courses/30/lessons/181889
*/
public class PrintFromN {

	public int[] solution(int[] num_list, int n) {
		int[] answer = new int[n];
		for (int i = 0; i < answer.length; i++) {
			answer[i] = num_list[i];
		}
		return answer;
	}

	public static void main(String[] args) {
		PrintFromN solution = new PrintFromN();

		int[] num_list = {1, 2, 3, 100, 99, 98};
		int n = 3;
		int[] result = solution.solution(num_list, n);
		System.out.println("result = " + Arrays.toString(result));
	}
}
