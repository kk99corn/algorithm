package progrmmers.level1;

import java.util.Stack;
import java.util.stream.IntStream;

/*
programmers
level: 1
title: 햄버거 만들기
url: https://school.programmers.co.kr/learn/courses/30/lessons/133502
*/
public class Hamburger {

	public int solutionStream(int[] ingredient) {
		Stack<Integer> stack = new Stack<>();
		return (int) IntStream.of(ingredient)
				.filter(i -> {
					stack.push(i);
					int size = stack.size();
					if (size >= 4) {
						if (stack.get(size - 4) == 1
								&& stack.get(size - 3) == 2
								&& stack.get(size - 2) == 3
								&& stack.get(size - 1) == 1) {
							for (int j = 0; j < 4; j++) {
								stack.pop();
							}
							return true;
						}
					}
					return false;
				})
				.count();
	}

	public int solution(int[] ingredient) {
		int answer = 0;

		Stack<Integer> stack = new Stack<>();
		for (int i : ingredient) {
			stack.push(i);

			int size = stack.size();

			if (size >= 4) {
				if (stack.get(size - 4) == 1
						&& stack.get(size - 3) == 2
						&& stack.get(size - 2) == 3
						&& stack.get(size - 1) == 1) {
					answer++;
					for (int j = 0; j < 4; j++) {
						stack.pop();
					}
				}
			}
		}

		return answer;
	}

	public static void main(String[] args) {
		int[] ingredient = {2, 1, 1, 2, 3, 1, 2, 3, 1};
		Hamburger solution = new Hamburger();
		int solution1 = solution.solution(ingredient);
		System.out.println("result = " + (solution1));

		int solution2 = solution.solutionStream(ingredient);
		System.out.println("result = " + (solution2));
	}
}
