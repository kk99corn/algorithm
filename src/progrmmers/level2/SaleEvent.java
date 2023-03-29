package progrmmers.level2;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.stream.IntStream;

/*
programmers
level: 2
title: 할인 행사
url: https://programmers.co.kr/learn/courses/30/lessons/131127
*/
public class SaleEvent {
	public int solutionStream(String[] want, int[] number, String[] discount) {
		int wantSize = 0;

		Map<String, Integer> wantMap = new HashMap<>();
		for (int i = 0; i < want.length; i++) {
			wantMap.put(want[i], number[i]);
			wantSize += number[i];
		}

		int finalWantSize = wantSize;
		return (int) IntStream.range(0, discount.length - wantSize + 1)
				.mapToObj(i -> {
					Map<String, Integer> tempMap = new HashMap<>(wantMap);
					IntStream.range(i, i + finalWantSize)
							.filter(j -> tempMap.containsKey(discount[j]))
							.filter(j -> tempMap.getOrDefault(discount[j], 0) > 0)
							.forEach(j -> tempMap.put(discount[j], tempMap.get(discount[j]) - 1));
					return tempMap.values().stream().mapToInt(Integer::intValue).sum();
				})
				.filter(sum -> sum == 0)
				.count();
	}

	public int solution(String[] want, int[] number, String[] discount) {
		int answer = 0;
		int wantSize = 0;

		Map<String, Integer> wantMap = new HashMap<>();
		for (int i = 0; i < want.length; i++) {
			wantMap.put(want[i], number[i]);
			wantSize += number[i];
		}

		for (int i = 0; i <= discount.length - wantSize; i++) {
			Map<String, Integer> tempMap = new HashMap<>(wantMap);
			for (int j = i; j < i + wantSize; j++) {
				if (tempMap.containsKey(discount[j])) {
					if (tempMap.getOrDefault(discount[j], 0) > 0) {
						tempMap.put(discount[j], tempMap.get(discount[j]) - 1);
					}
				}
			}

			int sum = 0;
			for (String key : tempMap.keySet()) {
				sum += tempMap.get(key);
			}

			if (sum == 0) {
				answer++;
			}
		}

		return answer;
	}

	public static void main(String[] args) {
		String[] want = {"banana", "apple", "rice", "pork", "pot"};
		int[] number = {3, 2, 2, 2, 1};
		String[] discount = {"chicken", "apple", "apple", "banana", "rice", "apple", "pork", "banana", "pork", "rice", "pot", "banana", "apple", "banana"};
		SaleEvent biggestNumber = new SaleEvent();
		int solution = biggestNumber.solution(want, number, discount);
		System.out.println("solution = " + solution);

		int solution2 = biggestNumber.solutionStream(want, number, discount);
		System.out.println("solution = " + solution2);
	}
}
