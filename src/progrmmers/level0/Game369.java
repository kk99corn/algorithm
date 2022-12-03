package progrmmers.level0;

import java.util.Arrays;

/*
programmers
level: 0
title: 369게임
url: https://school.programmers.co.kr/learn/courses/30/lessons/120891
*/
public class Game369 {

	public int solution(int order) {
		return (int) Arrays.stream(Integer.toString(order).split(""))
				.mapToInt(Integer::parseInt)
				.filter(s -> s != 0 && s % 3 == 0)
				.boxed()
				.count();
	}

	public static void main(String[] args) {
		int order = 10;
		Game369 solution = new Game369();
		int solution1 = solution.solution(order);
		System.out.println("result = " + solution1);
	}
}
