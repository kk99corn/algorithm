package progrmmers.level1;

import java.util.Arrays;

/*
programmers
level: 1
title: 없는숫자 더하기
url: https://programmers.co.kr/learn/courses/30/lessons/86051
*/
public class EmptyNumberSum {
	public int solution(int[] numbers) {
		return 45 - Arrays.stream(numbers).sum();
	}

	public static void main(String[] args) {
		int[] numbers = {1, 2, 3, 4, 6, 7, 8, 0};
		EmptyNumberSum emptyNumberSum = new EmptyNumberSum();
		System.out.println(emptyNumberSum.solution(numbers));
	}
}
