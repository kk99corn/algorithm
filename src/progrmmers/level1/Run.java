package progrmmers.level1;

import java.util.*;

/*
programmers
level: 1
title: 달리기 경주
url: https://school.programmers.co.kr/learn/courses/30/lessons/178871
*/
public class Run {

	public String[] solution(String[] players, String[] callings) {
		Map<Integer, String> playerMap = new HashMap<>();
		Map<String, Integer> playerMap2 = new HashMap<>();
		for (int i = 0; i < players.length; i++) {
			playerMap.put(i, players[i]);
			playerMap2.put(players[i], i);
		}

		for (String x : callings) {
			Integer xRank = playerMap2.get(x);
			playerMap2.put(x, xRank - 1);

			String t = playerMap.get(xRank - 1);
			Integer tRank = playerMap2.get(t);
			playerMap2.put(t, tRank + 1);

			playerMap.put(tRank + 1, t);
			playerMap.put(xRank - 1, x);
		}

		for (Integer i : playerMap.keySet()) {
			players[i] = playerMap.get(i);
		}

		return players;
	}

	public static void main(String[] args) {
		String[] players = {"mumu", "soe", "poe", "kai", "mine"};
		String[] callings = {"kai", "kai", "mine", "mine"};
		Run solution = new Run();
		String[] solution1 = solution.solution(players, callings);
		System.out.println("result = " + Arrays.toString(solution1));
	}
}
