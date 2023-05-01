package progrmmers.level0;

import java.util.Arrays;
import java.util.Stack;
import java.util.stream.IntStream;

/*
programmers
level: 0
title: 배열 만들기 6
url: https://school.programmers.co.kr/learn/courses/30/lessons/181859
*/
public class MakeArray6 {

	public int[] solutionStream(int[] arr) {
		Stack<Integer> stack = new Stack<>();

		int[] answer = IntStream.of(arr)
				.filter(n -> {
					if (stack.isEmpty()) {
						stack.push(n);
						return false;
					} else {
						int top = stack.peek();
						if (top == n) {
							stack.pop();
							return true;
						} else {
							stack.push(n);
							return false;
						}
					}
				})
				.toArray();

		return stack.isEmpty() ? answer : stack.stream().mapToInt(Integer::intValue).toArray();
	}

	public int[] solution(int[] arr) {
		Stack<Integer> stack = new Stack<>();
		int[] answer = {-1};

		for (int n : arr) {
			if (stack.isEmpty()) {
				stack.push(n);
			} else {
				int top = stack.peek();
				if (top == n) {
					stack.pop();
				} else {
					stack.push(n);
				}
			}
		}

		if (!stack.isEmpty()) answer = stack.stream().mapToInt(Integer::intValue).toArray();
		return answer;
	}

	public static void main(String[] args) {
		int[] arr = {0, 1, 1, 1, 0};
		MakeArray6 solution = new MakeArray6();
		int[] solution1 = solution.solution(arr);
		System.out.println("result = " + Arrays.toString(solution1));

		int[] solution2 = solution.solutionStream(arr);
		System.out.println("result = " + Arrays.toString(solution2));
	}
}
