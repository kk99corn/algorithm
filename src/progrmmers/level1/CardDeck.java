package progrmmers.level1;

import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedList;
import java.util.Queue;

/*
programmers
level: 1
title: 카드 뭉치
url: https://programmers.co.kr/learn/courses/30/lessons/159994
*/
public class CardDeck {

	public String solution_stream(String[] cards1, String[] cards2, String[] goal) {
		Queue<String> goalQ = new LinkedList<>(Arrays.asList(goal));
		Queue<String> q1 = new LinkedList<>(Arrays.asList(cards1));
		Queue<String> q2 = new LinkedList<>(Arrays.asList(cards2));

		while (!goalQ.isEmpty() && (!q1.isEmpty() || !q2.isEmpty())) {
			String x = goalQ.peek();
			boolean isContinue = false;
			if (!q1.isEmpty() && q1.peek().equals(x)) {
				q1.poll();
				isContinue = true;
			}
			if (!q2.isEmpty() && q2.peek().equals(x)) {
				q2.poll();
				isContinue = true;
			}

			if (isContinue) {
				goalQ.poll();
			} else {
				break;
			}
		}

		return goalQ.isEmpty() ? "Yes" : "No";
	}

	public String solution(String[] cards1, String[] cards2, String[] goal) {
		String answer = "Yes";

		Queue<String> goalQ = new LinkedList<>();
		Queue<String> q1 = new LinkedList<>();
		Queue<String> q2 = new LinkedList<>();
		Collections.addAll(goalQ, goal);
		Collections.addAll(q1, cards1);
		Collections.addAll(q2, cards2);

		while (!goalQ.isEmpty()) {
			if (q1.isEmpty() && q2.isEmpty()) break;

			String x = goalQ.peek();
			boolean isContinue = false;
			if (!q1.isEmpty() && q1.peek().equals(x)) {
				q1.poll();
				isContinue = true;
			}
			if (!q2.isEmpty() && q2.peek().equals(x)) {
				q2.poll();
				isContinue = true;
			}

			if (isContinue) {
				goalQ.poll();
			} else {
				break;
			}
		}

		if (!goalQ.isEmpty()) answer = "No";

		return answer;
	}

	public static void main(String[] args) {
		String[] cards1 = {"i", "drink", "water"};
		String[] cards2 = {"want", "to"};
		String[] goal = {"i", "want", "to", "drink", "water"};
		CardDeck solution = new CardDeck();
		String result = solution.solution(cards1, cards2, goal);
		System.out.println("result = " + result);

		String result2 = solution.solution_stream(cards1, cards2, goal);
		System.out.println("result2 = " + result2);
	}
}
