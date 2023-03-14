package progrmmers.level1;

import java.util.*;

/*
programmers
level: 1
title: 대충 만든 자판
url: https://school.programmers.co.kr/learn/courses/30/lessons/160586
*/
public class keyboard {

	public int[] solution(String[] keymap, String[] targets) {
		int targetSize = targets.length;
		int[] answer = new int[targetSize];

		Map<String, Integer> indexMap = new HashMap<>();
		for (int i = 0; i < targetSize; i++) {
			for (int j = 0; j < targets[i].length(); j++) {
				String x = targets[i].substring(j, j + 1);

				if (indexMap.get(x) == null) {
					List<Integer> xIndexList = new ArrayList<>();
					for (String s : keymap) {
						if (s.contains(x)) {
							xIndexList.add(s.indexOf(x));
						}
					}

					if (xIndexList.size() > 0) {
						int xIndex = Collections.min(xIndexList) + 1;
						indexMap.put(x, xIndex);
						answer[i] += xIndex;
					} else {
						answer[i] = -1;
						break;
					}
				} else {
					answer[i] += indexMap.get(x);
				}
			}
		}
		return answer;
	}

	public static void main(String[] args) {
		String[] keymap = {"ABACD", "BCEFD"};
		String[] targets = {"ABCD", "AABB"};
		keyboard solution = new keyboard();
		int[] solution1 = solution.solution(keymap, targets);
		System.out.println("result = " + Arrays.toString(solution1));
	}
}
