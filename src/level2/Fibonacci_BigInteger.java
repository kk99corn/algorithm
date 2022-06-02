package level2;

import java.math.BigInteger;

/*
programmers
level: 2
title: 피보나치
url: https://programmers.co.kr/learn/courses/30/lessons/12945
*/
public class Fibonacci_BigInteger {
	public int solution(int n) {
		BigInteger divNum = new BigInteger("1234567");
		BigInteger[] numArr = new BigInteger[n + 1];
		for (int i = 0; i <= n; i++) {
			if (i == 0) numArr[0] = new BigInteger("0");
			if (i == 1) numArr[1] = new BigInteger("1");
			if (i > 1) {
				numArr[i] = numArr[i-1].add(numArr[i-2]);
			}
		}

		return numArr[n].remainder(divNum).intValue();
	}

	public static void main(String[] args) {
		Fibonacci_BigInteger fibonacci_bigInteger = new Fibonacci_BigInteger();
		int solution = fibonacci_bigInteger.solution(99999);
		System.out.println("solution = " + solution);
	}
}
