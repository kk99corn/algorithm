package progrmmers.level0;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/*
programmers
level: 0
title: 특이한 정렬
url: https://school.programmers.co.kr/learn/courses/30/lessons/120880
*/
public class StrangeSort {
	static class Distance implements Comparable<Distance> {
		int num;
		int diff;

		public Distance(int num, int diff) {
			this.num = num;
			this.diff = diff;
		}

		@Override
		public int compareTo(Distance o) {
			if (this.diff < o.diff) {
				return -1;
			} else if (this.diff > o.diff) {
				return 1;
			} else {
				if (this.num > o.num) {
					return -1;
				} else {
					return 1;
				}
			}
		}
	}

	public int[] solution(int[] numlist, int n) {
		List<Distance> distanceList = new ArrayList<>();
		for (int num : numlist) {
			distanceList.add(new Distance(num, Math.abs(num - n)));
		}
		Collections.sort(distanceList);

		int[] answer = new int[numlist.length];
		for (int i = 0; i < distanceList.size(); i++) {
			answer[i] = distanceList.get(i).num;
		}
		return answer;
	}

	public static void main(String[] args) {
		int[] numList = {10, 9, 8, 7, 6, 5, 4, 3, 2, 1, 11};
		int n = 6;
		StrangeSort solution = new StrangeSort();
		int[] solution1 = solution.solution(numList, n);
		System.out.println("result = " + Arrays.toString(solution1));
	}
}
