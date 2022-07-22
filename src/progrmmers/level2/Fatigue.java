package progrmmers.level2;

import java.util.ArrayList;
import java.util.Arrays;

/*
programmers
level: 2
title: 피로도
url: https://programmers.co.kr/learn/courses/30/lessons/87946
*/
public class Fatigue {
	int answer = 0;

	public int solution(int k, int[][] dungeons) {
		ArrayList<Integer[]> list = new ArrayList<>();
		for (int[] dungeon : dungeons) {
			list.add(Arrays.stream(dungeon).boxed().toArray(Integer[]::new));
		}

		r(k, list, 0);

		return answer;
	}

	public void r(int k, ArrayList<Integer[]> list, int n) {
		if (list.size() == 0) {
			answer = n;
		} else {
			for (int i = 0; i < list.size(); i++) {
				ArrayList<Integer[]> temp = new ArrayList<>(list);
				temp.remove(i);

				Integer[] arr = list.get(i);
				if (arr[0] <= k) {
					r(k - arr[1], temp, n + 1);
				} else {
					if (n > answer) {
						answer = n;
					}
				}
			}
		}
	}

	public static void main(String[] args) {
		int k = 80;
		int[][] dungeons = {{80, 20}, {50, 40}, {30, 10}};
		Fatigue fatigue = new Fatigue();
		int solution = fatigue.solution(k, dungeons);
		System.out.println("solution = " + solution);
	}
}
