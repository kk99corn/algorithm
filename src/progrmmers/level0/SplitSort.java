package progrmmers.level0;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

/*
programmers
level: 0
title: 문자열 잘라서 정렬하기
url: https://school.programmers.co.kr/learn/courses/30/lessons/181866
*/
public class SplitSort {

	public String[] solutionStream(String myString) {
		String[] list = myString.split("(x+)");
		List<String> temp = Arrays.stream(list)
				.filter(s -> !s.isBlank())
				.collect(Collectors.toList());

		String[] answer = temp.toArray(new String[0]);
		Arrays.sort(answer);

		return answer;
	}

	public String[] solution(String myString) {
		String[] list = myString.split("(x+)");
		List<String> temp = new ArrayList<>();
		for (String s : list) {
			if (!s.isBlank()) temp.add(s);
		}

		String[] answer = temp.toArray(new String[0]);
		Arrays.sort(answer);

		return answer;
	}

	public static void main(String[] args) {
		SplitSort solution = new SplitSort();

		String myString = "dxccxbbbxaaaa";
		String[] solution1 = solution.solution(myString);
		System.out.println("result = " + Arrays.toString(solution1));

		String[] solution2 = solution.solutionStream(myString);
		System.out.println("result = " + Arrays.toString(solution2));
	}
}
