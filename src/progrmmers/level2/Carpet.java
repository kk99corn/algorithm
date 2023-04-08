package progrmmers.level2;

import java.util.Arrays;
import java.util.stream.IntStream;

/*
programmers
level: 2
title: 카펫
url: https://programmers.co.kr/learn/courses/30/lessons/42842
*/
public class Carpet {

	public int[] solutionStream(int brown, int yellow) {
		int sum = brown + yellow;
		return IntStream.rangeClosed(3, sum)
				.filter(i -> sum % i == 0 && sum / i >= 3)
				.mapToObj(i -> new int[] {Math.max(i, sum / i), Math.min(i, sum / i)})
				.filter(dimensions -> yellow == (dimensions[0] - 2) * (dimensions[1] - 2))
				.findFirst()
				.orElse(new int[2]);
	}

	public int[] solution(int brown, int yellow) {
		int[] answer = new int[2];
		int sum = brown + yellow;

		for (int i = 3; i < sum; i++) {
			int j = sum / i;

			if (sum % i == 0 && j >= 3) {
				int width = Math.max(i, j);
				int height = Math.min(i, j);

				if (yellow == (width - 2) * (height - 2)) {
					answer[0] = width;
					answer[1] = height;
					return answer;
				}
			}
		}
		return answer;
	}

	public static void main(String[] args) {
		Carpet carpet = new Carpet();
		int[] solution = carpet.solution(24, 24);
		System.out.println("solution = " + Arrays.toString(solution));

		int[] solution2 = carpet.solutionStream(24, 24);
		System.out.println("solution = " + Arrays.toString(solution2));
	}
}
