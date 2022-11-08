package progrmmers.level0;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/*
programmers
level: 0
title: 평행
url: https://school.programmers.co.kr/learn/courses/30/lessons/120875
*/
public class Parallel {

	public int solution(int[][] dots) {
		int answer = 0;

		for (int i = 1; i <= 3; i++) {
			List<Integer> idxList = new ArrayList<>(Arrays.asList(1, 2, 3));
			idxList.remove(Integer.valueOf(i));

			int[] dot1 = dots[0];
			int[] dot2 = dots[i];

			int[] dot3 = dots[idxList.get(0)];
			int[] dot4 = dots[idxList.get(1)];

			double inclination1, inclination2;

			inclination1 = (dot1[1] - dot2[1]) / (double) (dot1[0] - dot2[0]);
			inclination2 = (dot3[1] - dot4[1]) / (double) (dot3[0] - dot4[0]);

			if (inclination1 == inclination2) {
				answer = 1;
				break;
			}
		}

		return answer;
	}

	public static void main(String[] args) {
		int[][] dots = {{1, 4}, {9, 2}, {3, 8}, {11, 6}};
		Parallel solution = new Parallel();
		int result = solution.solution(dots);
		System.out.println("result = " + result);
	}
}
