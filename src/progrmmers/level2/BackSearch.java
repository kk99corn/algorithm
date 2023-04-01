package progrmmers.level2;

import java.util.*;
import java.util.stream.IntStream;

/*
programmers
level: 2
title: 뒤에 있는 큰 수 찾기
url: https://programmers.co.kr/learn/courses/30/lessons/154539
*/
public class BackSearch {

	public int[] solutionStream(int[] numbers) {
		int size = numbers.length;
		int[] answer = new int[size];
		Arrays.fill(answer, -1);

		Stack<Integer> stack = new Stack<>();
		IntStream.range(0, size)
				.forEach(i -> {
					while (!stack.isEmpty() && numbers[stack.peek()] < numbers[i]) {
						answer[stack.pop()] = numbers[i];
					}
					stack.push(i);
				});

		return answer;
	}

	public int[] solution(int[] numbers) {
		int size = numbers.length;
		int[] answer = new int[size];
		Arrays.fill(answer, -1);

		Stack<Integer> stack = new Stack<>();
		for (int i = 0; i < size; i++) {
			while (!stack.isEmpty() && numbers[stack.peek()] < numbers[i]) {
				answer[stack.pop()] = numbers[i];
			}
			stack.push(i);
		}

		return answer;
	}

	public static void main(String[] args) {
		int[] numbers = {5, 1, 5, 2, 2, 5, 1, 1, 7, 7, 7, 8, 9};
		BackSearch arrayDivide = new BackSearch();
		int[] solution = arrayDivide.solution(numbers);
		System.out.println("solution = " + Arrays.toString(solution));

		int[] solution2 = arrayDivide.solutionStream(numbers);
		System.out.println("solution = " + Arrays.toString(solution2));
	}
}
