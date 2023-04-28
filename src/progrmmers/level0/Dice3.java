package progrmmers.level0;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/*
programmers
level: 0
title: 주사위 게임 3
url: https://school.programmers.co.kr/learn/courses/30/lessons/181916
*/
public class Dice3 {

	public int solution(int a, int b, int c, int d) {
		Map<Integer, Integer> map = new HashMap<>();
		map.put(a, 1);
		map.put(b, map.getOrDefault(b, 0) + 1);
		map.put(c, map.getOrDefault(c, 0) + 1);
		map.put(d, map.getOrDefault(d, 0) + 1);

		int answer = 0;
		int size = map.size();
		if (size == 1) {
			answer = 1111 * a;
		} else if (size == 2) {
			if (map.containsValue(2)) {
				int sum = map.keySet().stream().mapToInt(Integer::intValue).sum();
				int[] diff = map.keySet().stream().mapToInt(Integer::intValue).toArray();
				answer = sum * Math.abs(diff[0] - diff[1]);
			} else {
				for (int n : map.keySet()) {
					if (map.get(n) == 3) {
						answer += (10 * n);
					} else {
						answer += n;
					}
				}
				answer = answer * answer;
			}
		} else if (size == 3) {
			answer = map.keySet().stream().filter(k -> map.get(k) == 1).reduce(1, (x, y) -> x * y);
		} else {
			answer = Collections.min(map.keySet());
		}

		return answer;
	}

	public static void main(String[] args) {
		int a = 2;
		int b = 2;
		int c = 2;
		int d = 2;

		Dice3 solution = new Dice3();
		int solution1 = solution.solution(a, b, c, d);
		System.out.println("result = " + (solution1));
	}
}
