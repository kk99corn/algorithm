package level2;

import java.util.HashMap;

/*
programmers
level: 2
title: 타겟 넘버
url: https://programmers.co.kr/learn/courses/30/lessons/43165
*/
public class TargetNumber {
	// 조합별 카운트 기록 map
	HashMap<Integer, Integer> map = new HashMap<>();

	public int solution(int[] numbers, int target) {
		r(0, numbers, 0);
		return map.getOrDefault(target, 0);
	}

	public void r(int num, int[] numbers, int s) {
		if (s <=  numbers.length - 1) {
			r(num + numbers[s], numbers, s+1);
			r(num - numbers[s], numbers, s+1);
		} else {
			map.put(num, map.getOrDefault(num, 0) + 1);
		}
	}

	public static void main(String[] args) {
		int[] numbers = {1, 1, 1, 1, 1};
		int target = 3;
		TargetNumber targetNumber = new TargetNumber();
		int solution = targetNumber.solution(numbers, target);
		System.out.println("solution = " + solution);
	}
}
