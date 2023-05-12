package progrmmers.level0;

import java.util.Arrays;
import java.util.Stack;

/*
programmers
level: 0
title: 배열 만들기 4
url: https://school.programmers.co.kr/learn/courses/30/lessons/181918
*/
public class MakeArray4 {

	public int[] solution(int[] arr) {
		Stack<Integer> stack = new Stack<>();
		for (int i = 0; i < arr.length; i++) {
			if (stack.isEmpty()) {
				stack.push(arr[i]);
			} else {
				if (stack.peek() < arr[i]) {
					stack.push(arr[i]);
				} else {
					stack.pop();
					i--;
				}
			}
		}

		return stack.stream().mapToInt(Integer::intValue).toArray();
	}

	public static void main(String[] args) {
		MakeArray4 solution = new MakeArray4();

		int[] arr = {1, 4, 2, 5, 3};
		int[] solution1 = solution.solution(arr);
		System.out.println("result = " + Arrays.toString(solution1));
	}
}
