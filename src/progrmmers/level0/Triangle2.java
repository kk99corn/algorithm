package progrmmers.level0;

/*
programmers
level: 0
title: 삼각형의 완성조건 (2)
url: https://school.programmers.co.kr/learn/courses/30/lessons/120868
*/
public class Triangle2 {

	public int solution(int[] sides) {
		int x = Math.max(sides[0], sides[1]);
		int y = Math.min(sides[0], sides[1]);

		int low = x - y;
		int high = x + y;

		return high - low - 1;
	}

	public static void main(String[] args) {
		int[] sides = {3, 6};
		Triangle2 solution = new Triangle2();
		int solution1 = solution.solution(sides);
		System.out.println("result = " + (solution1));
	}
}
