package progrmmers.level0;

import java.util.stream.IntStream;

/*
programmers
level: 0
title: 첫 번째로 나오는 음수
url: https://school.programmers.co.kr/learn/courses/30/lessons/181896
*/
public class FirstMinusNumber {

	public int solutionStream(int[] num_list) {
		return IntStream.range(0, num_list.length)
				.filter(i -> num_list[i] < 0)
				.findFirst()
				.orElse(-1);
	}

	public int solution(int[] num_list) {
		int answer = -1;
		for (int i = 0; i < num_list.length; i++) {
			if (num_list[i] < 0) {
				answer = i;
				break;
			}
		}
		return answer;
	}

	public static void main(String[] args) {
		FirstMinusNumber solution = new FirstMinusNumber();

		int[] num_list = {12, 4, 15, 46, 38, -2, 15};
		int result = solution.solution(num_list);
		System.out.println("result = " + (result));

		int result2 = solution.solutionStream(num_list);
		System.out.println("result = " + (result2));
	}
}
