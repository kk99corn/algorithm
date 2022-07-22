package progrmmers.level2;

import java.util.Arrays;

/*
programmers
level: 2
title: H-Index
url: https://programmers.co.kr/learn/courses/30/lessons/42747
*/
public class HIndex {
	public int solution(int[] citations) {
		int answer = 0;
		Arrays.sort(citations);

		for (int i = 0; i < citations.length; i++) {
			int h = citations.length - i;
			if (citations[i] >= h) {
				answer = h;
				break;
			}
		}

		return answer;
	}

	public static void main(String[] args) {
		int[] citations = {3, 0, 6, 1, 5};
		HIndex hIndex = new HIndex();
		int solution = hIndex.solution(citations);
		System.out.println("solution = " + solution);
	}
}
