package progrmmers.level0;

/*
programmers
level: 0
title: 직사각형 넓이 구하기
url: https://school.programmers.co.kr/learn/courses/30/lessons/120860
*/
public class RectangleArea {
	public int solution(int[][] dots) {
		int x = 0;
		int y = 0;

		int[] mainDot = dots[0];
		for (int[] dot : dots) {
			if (mainDot[0] == dot[0]) y = Math.abs(mainDot[1] - dot[1]);
			if (mainDot[1] == dot[1]) x = Math.abs(mainDot[0] - dot[0]);
		}

		return x * y;
	}

	public static void main(String[] args) {
		int[][] dots = {{1, 1}, {2, 1}, {2, 2}, {1, 2}};
		RectangleArea solution = new RectangleArea();
		int solution1 = solution.solution(dots);
		System.out.println("result = " + solution1);
	}
}
