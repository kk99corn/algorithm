package progrmmers.level0;

import java.util.Arrays;

/*
programmers
level: 0
title: 머쓱이보다 키 큰 사람
url: https://school.programmers.co.kr/learn/courses/30/lessons/120585
*/
public class Height {

	public int solution(int[] array, int height) {
		return (int) Arrays.stream(array)
				.filter(x -> x > height)
				.count();
	}

	public static void main(String[] args) {
		int[] array = {149, 180, 192, 170};
		int height = 167;
		Height solution = new Height();
		int solution1 = solution.solution(array, height);
		System.out.println("result = " + (solution1));
	}
}
