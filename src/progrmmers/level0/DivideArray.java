package progrmmers.level0;

import java.util.Arrays;

/*
programmers
level: 0
title: 배열 자르기
url: https://school.programmers.co.kr/learn/courses/30/lessons/120833
*/
public class DivideArray {

	public int[] solution(int[] numbers, int num1, int num2) {
		return Arrays.stream(numbers, num1, (num2 + 1)).toArray();
	}

	public static void main(String[] args) {
		int[] numbers = {1, 2, 3, 4, 5};
		int num1 = 1;
		int num2 = 3;
		DivideArray solution = new DivideArray();
		int[] solution1 = solution.solution(numbers, num1, num2);
		System.out.println("result = " + Arrays.toString(solution1));
	}
}
