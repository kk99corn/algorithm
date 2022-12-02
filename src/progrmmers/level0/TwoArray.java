package progrmmers.level0;

import java.util.Arrays;

/*
programmers
level: 0
title: 2차원으로 만들기
url: https://school.programmers.co.kr/learn/courses/30/lessons/120842
*/
public class TwoArray {

	public int[][] solution(int[] num_list, int n) {
		int[][] answer = new int[num_list.length / n][n];
		for (int i = 0; i < num_list.length; i++) {
			answer[i / n][i % n] = num_list[i];
		}
		return answer;
	}


	public static void main(String[] args) {
		int[] num_list = {1, 2, 3, 4, 5, 6, 7, 8};
		int n = 2;
		TwoArray solution = new TwoArray();
		int[][] solution1 = solution.solution(num_list, n);
		System.out.println("result = " + Arrays.toString(solution1));
		for (int i = 0; i < solution1.length; i++) {
			System.out.println(Arrays.toString(solution1[i]));
		}
	}
}
