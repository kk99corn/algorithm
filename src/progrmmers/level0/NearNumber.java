package progrmmers.level0;

import java.util.*;

/*
programmers
level: 0
title: 가까운 수
url: https://school.programmers.co.kr/learn/courses/30/lessons/120890
*/
public class NearNumber {

	public int solution(int[] array, int n) {
		Arrays.sort(array);
		List<Integer> absList = new ArrayList<>();
		for (int j : array) absList.add(Math.abs(j - n));
		return array[absList.indexOf(Collections.min(absList))];
	}


	public static void main(String[] args) {
		int[] array = {3, 10, 28};
		int n = 20;
		NearNumber solution = new NearNumber();
		int solution1 = solution.solution(array, n);
		System.out.println("result = " + solution1);
	}
}
