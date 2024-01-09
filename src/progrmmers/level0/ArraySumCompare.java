package progrmmers.level0;

/*
programmers
level: 0
title: 홀수 vs 짝수
url: https://school.programmers.co.kr/learn/courses/30/lessons/181887
*/
public class ArraySumCompare {

	public int solution(int[] num_list) {
		int a = 0, b = 0;
		for (int i = 0; i < num_list.length; i++) {
			if (i % 2 == 0) {
				a += num_list[i];
			} else {
				b += num_list[i];
			}
		}

		return Math.max(a, b);
	}

	public static void main(String[] args) {
		ArraySumCompare solution = new ArraySumCompare();

		int[] num_list = {4, 2, 6, 1, 7, 6};
		int result = solution.solution(num_list);
		System.out.println("result = " + (result));
	}
}
