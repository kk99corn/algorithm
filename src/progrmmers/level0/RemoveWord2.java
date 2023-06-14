package progrmmers.level0;

import java.util.stream.Collectors;
import java.util.stream.IntStream;

/*
programmers
level: 0
title: 글자 지우기
url: https://school.programmers.co.kr/learn/courses/30/lessons/181900
*/
public class RemoveWord2 {

	public String solutionStream(String my_string, int[] indices) {
		StringBuilder sb = new StringBuilder(my_string);
		IntStream.of(indices)
				.forEach(i -> sb.setCharAt(i, ' '));
		return sb.toString()
				.chars()
				.filter(c -> c != ' ')
				.mapToObj(Character::toString)
				.collect(Collectors.joining());
	}

	public String solution(String my_string, int[] indices) {
		StringBuilder sb = new StringBuilder(my_string);
		for (int i : indices) sb.setCharAt(i, ' ');
		return sb.toString().replaceAll(" ", "");
	}

	public static void main(String[] args) {
		RemoveWord2 solution = new RemoveWord2();

		String my_string = "apporoograpemmemprs";
		int[] indices = {1, 16, 6, 15, 0, 10, 11, 3};
		String solution1 = solution.solution(my_string, indices);
		System.out.println("result = " + (solution1));

		String solution2 = solution.solutionStream(my_string, indices);
		System.out.println("result = " + (solution2));
	}
}
