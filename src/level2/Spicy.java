package level2;

import java.util.PriorityQueue;

/*
programmers
level: 2
title: 더 맵게
url: https://programmers.co.kr/learn/courses/30/lessons/42626
*/
public class Spicy {
	public int solution(int[] scoville, int K) {
		int answer = 0;
		PriorityQueue<Integer> pQueue = new PriorityQueue<>();
		for (int s : scoville) {
			pQueue.offer(s);
		}
		while (!pQueue.isEmpty()) {
			int mixScoville = pQueue.poll();
			if (mixScoville >= K) {
				return answer;
			} else {
				if (answer >= scoville.length - 1) {
					return -1;
				}
				if (pQueue.peek() != null) {
					mixScoville += (pQueue.poll() * 2);
					pQueue.offer(mixScoville);
					answer++;
				}
			}
		}
		return answer;
	}

	public static void main(String[] args) {
		int[] scoville = {1, 2, 3, 9, 10, 12};
		int K = 7;
		Spicy spicy = new Spicy();
		int solution = spicy.solution(scoville, K);
		System.out.println("solution = " + solution);
	}
}
