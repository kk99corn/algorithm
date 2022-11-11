package progrmmers.level0;

import java.util.*;

/*
programmers
level: 0
title: 최빈값 구하기
url: https://school.programmers.co.kr/learn/courses/30/lessons/120812
*/
public class Mode {
	public int solution(int[] array) {
		int answer = 0;

		// 숫자별 카운팅 -> Map
		Map<Integer, Integer> map = new HashMap<>();
		for (int num : array) {
			map.put(num, map.getOrDefault(num, 0) + 1);
		}

		// Map value 정렬
		List<Map.Entry<Integer, Integer>> entryList = new LinkedList<>(map.entrySet());
		entryList.sort((Comparator.comparingInt(o -> -map.get(o.getKey()))));

		int maxCount = 0;
		int idx = 0;
		for (Map.Entry<Integer, Integer> entry : entryList) {
			if (idx == 0) {
				answer = entry.getKey();
				maxCount = entry.getValue();
			} else {
				if (maxCount == entry.getValue()) {
					answer = -1;
					break;
				}
			}
			idx++;
		}

		return answer;
	}

	public static void main(String[] args) {
		int[] array = {1,1,2,2,2};
		Mode solution = new Mode();
		int solution1 = solution.solution(array);
		System.out.println("result = " + solution1);
	}
}
