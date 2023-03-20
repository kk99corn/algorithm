package progrmmers.level1;

import java.util.*;

/*
programmers
level: 1
title: 키패드 누르기
url: https://school.programmers.co.kr/learn/courses/30/lessons/67256
*/
public class Keypad {

	public String solution(int[] numbers, String hand) {
		Map<Integer, List<Integer>> map = new HashMap<>();
		map.put(1, new ArrayList<>(List.of(0, 0)));
		map.put(2, new ArrayList<>(List.of(0, 1)));
		map.put(3, new ArrayList<>(List.of(0, 2)));
		map.put(4, new ArrayList<>(List.of(1, 0)));
		map.put(5, new ArrayList<>(List.of(1, 1)));
		map.put(6, new ArrayList<>(List.of(1, 2)));
		map.put(7, new ArrayList<>(List.of(2, 0)));
		map.put(8, new ArrayList<>(List.of(2, 1)));
		map.put(9, new ArrayList<>(List.of(2, 2)));
		map.put(0, new ArrayList<>(List.of(3, 1)));

		String answer = "";
		String selectedHand = "";

		int[] currentL = {3, 0};
		int[] currentR = {3, 2};

		int distanceLtoX;
		int distanceRtoX;

		for (int n : numbers) {
			if (n == 1 || n == 4 || n == 7) {
				selectedHand = "L";
			} else if (n == 3 || n == 6 || n == 9) {
				selectedHand = "R";
			} else {
				distanceLtoX = Math.abs(currentL[0] - map.get(n).get(0)) + Math.abs(currentL[1] - map.get(n).get(1));
				distanceRtoX = Math.abs(currentR[0] - map.get(n).get(0)) + Math.abs(currentR[1] - map.get(n).get(1));

				if (distanceLtoX == distanceRtoX) {
					if (hand.equals("left")) {
						selectedHand = "L";
					} else {
						selectedHand = "R";
					}
				} else if (distanceLtoX < distanceRtoX) {
					selectedHand = "L";
				} else {
					selectedHand = "R";
				}
			}

			if (selectedHand.equals("L")) {
				currentL[0] = map.get(n).get(0);
				currentL[1] = map.get(n).get(1);
			} else {
				currentR[0] = map.get(n).get(0);
				currentR[1] = map.get(n).get(1);
			}
			answer += selectedHand;
		}

		return answer;
	}

	public String solution_stream(int[] numbers, String hand) {
		Map<Integer, List<Integer>> map = new HashMap<>();
		map.put(1, new ArrayList<>(List.of(0, 0)));
		map.put(2, new ArrayList<>(List.of(0, 1)));
		map.put(3, new ArrayList<>(List.of(0, 2)));
		map.put(4, new ArrayList<>(List.of(1, 0)));
		map.put(5, new ArrayList<>(List.of(1, 1)));
		map.put(6, new ArrayList<>(List.of(1, 2)));
		map.put(7, new ArrayList<>(List.of(2, 0)));
		map.put(8, new ArrayList<>(List.of(2, 1)));
		map.put(9, new ArrayList<>(List.of(2, 2)));
		map.put(0, new ArrayList<>(List.of(3, 1)));

		String[] answer = {""};
		int[][] current = {{3, 0}, {3, 2}};

		Arrays.stream(numbers)
				.forEach(n -> {
					String selectedHand;
					if (n == 1 || n == 4 || n == 7) {
						selectedHand = "L";
					} else if (n == 3 || n == 6 || n == 9) {
						selectedHand = "R";
					} else {
						int distanceLtoX = Math.abs(current[0][0] - map.get(n).get(0)) + Math.abs(current[0][1] - map.get(n).get(1));
						int distanceRtoX = Math.abs(current[1][0] - map.get(n).get(0)) + Math.abs(current[1][1] - map.get(n).get(1));
						if (distanceLtoX == distanceRtoX) {
							selectedHand = hand.equals("left") ? "L" : "R";
						} else {
							selectedHand = distanceLtoX < distanceRtoX ? "L" : "R";
						}
					}
					if (selectedHand.equals("L")) {
						current[0] = new int[]{map.get(n).get(0), map.get(n).get(1)};
					} else {
						current[1] = new int[]{map.get(n).get(0), map.get(n).get(1)};
					}
					answer[0] += selectedHand;
				});

		return answer[0];
	}

	public static void main(String[] args) {
		int[] numbers = {1, 3, 4, 5, 8, 2, 1, 4, 5, 9, 5};
		String hand = "right";
		Keypad solution = new Keypad();
		String solution1 = solution.solution(numbers, hand);
		System.out.println("result = " + (solution1));

		String solution2 = solution.solution_stream(numbers, hand);
		System.out.println("result = " + (solution2));
	}
}
