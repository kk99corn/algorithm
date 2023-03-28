package progrmmers.level2;

import java.util.HashSet;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

/*
programmers
level: 2
title: 연속 부분 수열 합의 개수
url: https://programmers.co.kr/learn/courses/30/lessons/131701
*/
public class SumSequences {

	public int solutionStream(int[] elements) {
		Set<Integer> numberSet = new HashSet<>();

		IntStream.range(0, elements.length)
				.forEach(i -> {
					int sum = 0;
					for (int j = i; j < i + elements.length; j++) {
						sum += elements[j % elements.length];
						numberSet.add(sum);
					}
				});

		return numberSet.size();
	}

	public int solution(int[] elements) {
		Set<Integer> numberSet = new HashSet<>();

		int size = elements.length;
		for (int i = 0; i < size; i++) {
			numberSet.add(elements[i]);

			int temp = elements[i];
			for (int j = 1; j < size; j++) {
				int idx = (i + j >= size) ? i + j - size : i + j;
				temp += elements[idx];
				numberSet.add(temp);
			}
		}

		return numberSet.size();
	}

	public static void main(String[] args) {
		int[] elements = {7, 9, 1, 1, 4};
		SumSequences bigNumber = new SumSequences();
		int solution = bigNumber.solution(elements);
		System.out.println("solution = " + solution);

		int solution2 = bigNumber.solutionStream(elements);
		System.out.println("solution = " + solution2);
	}
}
