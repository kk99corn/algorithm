package level2;

import java.util.HashMap;

/*
programmers
level: 2
title: 위장
url: https://programmers.co.kr/learn/courses/30/lessons/42578
*/
public class Camouflage {
	public int solution(String[][] clothes) {
		HashMap<String, Integer> map = new HashMap<>();

		for (String[] cloth : clothes) {
			map.put(cloth[1], map.getOrDefault(cloth[1], 0) + 1);
		}

		int cnt = 1;
		for (String key : map.keySet()) {
			cnt *= (map.get(key) + 1);
		}

		return cnt - 1;
	}

	public static void main(String[] args) {
		String[][] clothes = {
				{"yellow", "head"},
				{"blue", "eye"},
				{"green", "head"}
		};
		Camouflage camouflage = new Camouflage();
		int solution = camouflage.solution(clothes);
		System.out.println("solution = " + solution);
	}
}
