package progrmmers.level2;

import java.util.Arrays;
import java.util.Deque;
import java.util.LinkedList;

/*
programmers
level: 2
title: 구명보트
url: https://programmers.co.kr/learn/courses/30/lessons/42885
*/
public class LifeBoat {
	public int solution(int[] people, int limit) {
		// people 정렬
		Arrays.sort(people);

		// deque 세팅
		Deque<Integer> deque = new LinkedList<>();
		for (Integer p : people) {
			deque.add(p);
		}

		int answer = 0;
		while (!deque.isEmpty()) {
			int sum = deque.pollLast(); // 제일큰 무게
			if (sum <= limit) {
				if (!deque.isEmpty() && (limit - sum) >= deque.peekFirst()) {
					deque.pollFirst(); // 제일작은 무게
				}
			}
			answer++;
		}

		return answer;
	}

	public static void main(String[] args) {
		int[] people = {70, 50, 80, 50};
		int limit = 100;
		LifeBoat lifeBoat = new LifeBoat();
		int solution = lifeBoat.solution(people, limit);
		System.out.println("solution = " + solution);
	}
}
