package progrmmers.level2;

import java.util.Arrays;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.stream.IntStream;

/*
programmers
level: 2
title: 삼각 달팽이
url: https://programmers.co.kr/learn/courses/30/lessons/68645
*/
public class Snail {

	public int[] solutionStream(int n) {
		int[][] matrix = new int[n][n];
		AtomicInteger x = new AtomicInteger(-1);
		AtomicInteger y = new AtomicInteger();
		AtomicInteger num = new AtomicInteger(1);
		IntStream.range(0, n).forEach(i ->
				IntStream.range(i, n).forEach(j -> {
					switch (i % 3) {
						case 0 -> x.getAndIncrement();
						case 1 -> y.getAndIncrement();
						case 2 -> {
							x.getAndDecrement();
							y.getAndDecrement();
						}
					}
					matrix[x.get()][y.get()] = num.getAndIncrement();
				})
		);
		return Arrays.stream(matrix)
				.flatMapToInt(Arrays::stream)
				.filter(number -> number != 0)
				.toArray();
	}

	public int[] solution(int n) {
		int[] answer = new int[(n * (n + 1)) / 2];
		int[][] matrix = new int[n][n];

		int x = -1, y = 0;
		int num = 1;

		for (int i = 0; i < n; i++) {
			for (int j = i; j < n; j++) {
				switch (i % 3) {
					case 0 -> x++;
					case 1 -> y++;
					case 2 -> {
						x--;
						y--;
					}
				}
				matrix[x][y] = num++;
			}
		}

		int k = 0;
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				if (matrix[i][j] == 0)
					break;
				answer[k++] = matrix[i][j];
			}
		}

		return answer;
	}

	public static void main(String[] args) {
		Snail solutions = new Snail();
		int[] solution = solutions.solution(5);
		System.out.println("solution = " + Arrays.toString(solution));

		int[] solution2 = solutions.solutionStream(5);
		System.out.println("solution = " + Arrays.toString(solution2));
	}
}
