package progrmmers.level0;

import java.util.*;

/*
programmers
level: 0
title: 등수 매기기
url: https://school.programmers.co.kr/learn/courses/30/lessons/120882
*/
public class Rank {

	public int[] solution(int[][] score) {
		List<Integer> list = new ArrayList<>();
		for (int[] s : score) {
			list.add(s[0] + s[1]);
		}
		list.sort(Comparator.reverseOrder());

		Map<Integer, Integer> map = new HashMap<>();
		int rank = 1;
		int temp = 0;
		int tempRank = 0;
		for (Integer s : list) {
			if (s == temp) {
				map.put(s, tempRank);
			} else {
				map.put(s, rank);
				tempRank = rank;
			}
			temp = s;
			rank++;
		}

		int[] answer = new int[score.length];
		for (int i = 0; i < score.length; i++) {
			answer[i] = map.get(score[i][0] + score[i][1]);
		}
		return answer;
	}

	public static void main(String[] args) {
		int[][] score = {{80, 70}, {70, 80}, {70, 80}, {30, 50}, {90, 100}, {100, 90}, {100, 100}, {10, 30}};
		Rank solution = new Rank();
		int[] solution1 = solution.solution(score);
		System.out.println("result = " + Arrays.toString(solution1));
	}
}
