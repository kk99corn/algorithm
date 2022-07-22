package progrmmers.level2;

import java.util.HashSet;
import java.util.Iterator;

/*
programmers
level: 2
title: 소수 찾기
url: https://programmers.co.kr/learn/courses/30/lessons/42839
*/
public class SearchPrime {
	// 소수 찾기
	public boolean isPrime(int num) {
		if (num < 2) return false;

		// 소수찾기 - 에라토스테네스의 체
		int limit = (int)Math.sqrt(num);
		for (int i = 2; i <= limit; i++) {
			if (num % i == 0) {
				return false;
			}
		}
		return true;
	}

	// 모든 조합
	public void combination(String x, String numbers, HashSet<Integer> numberSet) {
		if (!x.equals(""))
			numberSet.add(Integer.parseInt(x));
		for (int i = 0; i < numbers.length(); i++) {
			combination(x + numbers.charAt(i), numbers.substring(0, i) + numbers.substring(i+1), numberSet);
		}
	}

	public int solution(String numbers) {
		HashSet<Integer> numberSet = new HashSet<>();
		combination("", numbers, numberSet);

		int answer = 0;
		Iterator<Integer> it = numberSet.iterator();
		while (it.hasNext()) {
			int x = it.next();
			if (isPrime(x)) answer++;
		}

		return answer;
	}

	public static void main(String[] args) {
		SearchPrime searchPrime = new SearchPrime();
		int solution = searchPrime.solution("011");
		System.out.println("solution = " + solution);
	}
}
