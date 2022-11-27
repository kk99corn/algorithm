package progrmmers.level0;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

/*
programmers
level: 0
title: 진료순서 정하기
url: https://school.programmers.co.kr/learn/courses/30/lessons/120835
*/
public class TreatmentOrder {

	public int[] solution(int[] emergency) {
		int[] answer = new int[emergency.length];
		List<Integer> tempArr = Arrays.stream(emergency)
				.boxed()
				.sorted(Collections.reverseOrder())
				.collect(Collectors.toList());

		for (int i = 0; i < emergency.length; i++) {
			answer[i] = tempArr.indexOf(emergency[i]) + 1;
		}

		return answer;
	}

	public int[] solution_stream(int[] emergency) {
		return Arrays.stream(emergency)
				.map(i -> Arrays.stream(emergency)
						.boxed()
						.sorted(Comparator.reverseOrder())
						.collect(Collectors.toList())
						.indexOf(i) + 1)
				.toArray();
	}

	public static void main(String[] args) {
		int[] emergency = {3, 76, 24};
		TreatmentOrder solution = new TreatmentOrder();
		int[] solution1 = solution.solution(emergency);
		System.out.println("result = " + Arrays.toString(solution1));

		int[] solution2 = solution.solution_stream(emergency);
		System.out.println("result = " + Arrays.toString(solution2));
	}
}
