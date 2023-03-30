package progrmmers.level2;

import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;

/*
programmers
level: 2
title: 귤 고르기
url: https://programmers.co.kr/learn/courses/30/lessons/138476
*/
public class Orange {

	public int solutionStream(int k, int[] tangerine) {
		Map<Integer, Integer> map = Arrays.stream(tangerine)
				.boxed()
				.collect(Collectors.toMap(Function.identity(), t -> 1, Integer::sum));

		List<Integer> keyList = map.keySet().stream()
				.sorted((o1, o2) -> map.get(o2).compareTo(map.get(o1)))
				.collect(Collectors.toList());

		int[] sum = new int[1];
		return (int) keyList.stream()
				.takeWhile(key -> {
					sum[0] += map.get(key);
					return k >= sum[0];
				})
				.count();
	}

	public int solution(int k, int[] tangerine) {
		int answer = 0;

		Map<Integer, Integer> map = new HashMap<>();
		for (int t : tangerine) {
			map.put(t, map.getOrDefault(t, 0) + 1);
		}

		List<Integer> keyList = new ArrayList<>(map.keySet());
		keyList.sort((o1, o2) -> map.get(o2).compareTo(map.get(o1)));

		int sum = 0;
		for (int key : keyList) {
			answer++;
			sum += map.get(key);

			if (k <= sum) {
				break;
			}
		}

		return answer;
	}

	public static void main(String[] args) {
		int k = 6;
		int[] tangerine = {1, 3, 2, 5, 4, 5, 2, 3};
		Orange biggestNumber = new Orange();
		int solution = biggestNumber.solution(k, tangerine);
		System.out.println("solution = " + solution);

		int solution2 = biggestNumber.solutionStream(k, tangerine);
		System.out.println("solution = " + solution2);
	}
}
