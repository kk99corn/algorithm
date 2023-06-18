package progrmmers.level0;

import java.util.Arrays;
import java.util.stream.Stream;

/*
programmers
level: 0
title: 5명씩
url: https://school.programmers.co.kr/learn/courses/30/lessons/181886
*/
public class Five {

	public String[] solutionStream(String[] names) {
		return Stream.iterate(0, i -> i + 5)
				.limit((names.length - 1) / 5 + 1)
				.map(i -> names[i])
				.toArray(String[]::new);
	}

	public String[] solution(String[] names) {
		String[] answer = new String[(names.length - 1) / 5 + 1];
		int idx = 0;
		for (int i = 0; i < names.length; i = i + 5) {
			answer[idx++] = names[i];
		}
		return answer;
	}

	public static void main(String[] args) {
		Five solution = new Five();

		String[] names = {"nami", "ahri", "jayce", "garen", "ivern", "vex", "jinx"};
		String[] solution1 = solution.solution(names);
		System.out.println("result = " + Arrays.toString(solution1));

		String[] solution2 = solution.solutionStream(names);
		System.out.println("result = " + Arrays.toString(solution2));
	}
}
