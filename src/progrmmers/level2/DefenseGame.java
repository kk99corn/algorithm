package progrmmers.level2;

import java.util.Arrays;
import java.util.Collections;
import java.util.PriorityQueue;
import java.util.stream.Collectors;

/*
programmers
level: 2
title: 디펜스 게임
url: https://programmers.co.kr/learn/courses/30/lessons/142085
*/
public class DefenseGame {

	public int solutionStream(int n, int k, int[] enemy) {
		int answer = 0;
		PriorityQueue<Integer> enemyQueue = Arrays.stream(enemy)
				.boxed()
				.sorted(Collections.reverseOrder())
				.collect(Collectors.toCollection(PriorityQueue::new));

		while (!enemyQueue.isEmpty()) {
			int e = enemyQueue.poll();
			if (n < e) {
				if (k > 0) {
					k--;
					n += enemyQueue.poll();
				} else {
					break;
				}
			}
			n -= e;
			answer++;
		}

		return answer;
	}

	public int solution(int n, int k, int[] enemy) {
		int answer = 0;
		PriorityQueue<Integer> enemyQueue = new PriorityQueue<>(Collections.reverseOrder());

		for (int e : enemy) {
			enemyQueue.add(e);
			if (n < e) {
				if (k > 0) {
					k--;
					n += enemyQueue.poll();
				} else {
					break;
				}
			}
			n -= e;
			answer++;
		}

		return answer;
	}

	public static void main(String[] args) {
		int n = 7;
		int k = 3;
		int[] enemy = {4, 2, 4, 5, 3, 3, 1};
		DefenseGame arrayDivide = new DefenseGame();
		int solution = arrayDivide.solution(n, k, enemy);
		System.out.println("solution = " + (solution));

		int solution2 = arrayDivide.solutionStream(n, k, enemy);
		System.out.println("solution = " + (solution2));
	}
}
