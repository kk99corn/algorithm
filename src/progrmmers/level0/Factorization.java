package progrmmers.level0;

import java.util.Arrays;
import java.util.TreeSet;
import java.util.Set;

/*
programmers
level: 0
title: 소인수분해
url: https://school.programmers.co.kr/learn/courses/30/lessons/120852
*/
public class Factorization {

	public int[] solution(int n) {
		Set<Integer> numSet = new TreeSet<>();
		for (int i = 2; i <= Math.sqrt(n); i++) {
			while (n % i == 0){
				numSet.add(i);
				n /= i;
			}
		}

		if (n != 1) {
			numSet.add(n);
		}

		return numSet.stream().mapToInt(x -> x).toArray();
	}

	public static void main(String[] args) {
		int n = 40;
		Factorization solution = new Factorization();
		int[] solution1 = solution.solution(n);
		System.out.println("result = " + Arrays.toString(solution1));
	}
}
