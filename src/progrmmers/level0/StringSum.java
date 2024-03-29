package progrmmers.level0;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

/*
programmers
level: 0
title: 문자열 묶기
url: https://school.programmers.co.kr/learn/courses/30/lessons/181855
*/
public class StringSum {

	public int solutionStream(String[] strArr) {
		Map<Integer, Integer> countMap = Arrays.stream(strArr)
				.collect(HashMap::new, (map, str) -> map.put(str.length(), map.getOrDefault(str.length(), 0) + 1), HashMap::putAll);

		return countMap.values().stream()
				.mapToInt(Integer::intValue)
				.max()
				.orElse(0);
	}

	public int solution(String[] strArr) {
		int answer = 0;
		Map<Integer, Integer> countMap = new HashMap<>();
		for (String str : strArr) {
			countMap.put(str.length(), countMap.getOrDefault(str.length(), 0) + 1);
		}
		for (int key : countMap.keySet()) {
			answer = Math.max(answer, countMap.get(key));
		}
		return answer;
	}

	public static void main(String[] args) {
		StringSum solution = new StringSum();

		String[] arr = {"a","bc","d","efg","hi"};
		int solution1 = solution.solution(arr);
		System.out.println("result = " + (solution1));

		int solution2 = solution.solutionStream(arr);
		System.out.println("result = " + (solution2));
	}
}
