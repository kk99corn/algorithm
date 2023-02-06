package progrmmers.level0;

import java.util.Arrays;

/*
programmers
level: 0
title: 삼각형의 완성조건 (1)
url: https://school.programmers.co.kr/learn/courses/30/lessons/120889
*/
public class Triangle {

	public int solution(int[] sides) {
		Arrays.sort(sides);
		return ((sides[0] + sides[1]) > sides[2]) ? 1 : 2;
	}

	public static void main(String[] args) {
		int[] sides = {3, 6, 2};
		Triangle solution = new Triangle();
		int solution1 = solution.solution(sides);
		System.out.println("result = " + (solution1));
	}
}
