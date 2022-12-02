package progrmmers.level0;

import java.math.BigInteger;
import java.util.Arrays;

/*
programmers
level: 0
title: 구슬을 나누는 경우의 수
url: https://school.programmers.co.kr/learn/courses/30/lessons/120840
*/
public class DividingMarble {


	public int solution(int balls, int share) {
		if (balls == share) return 1;
		BigInteger[] facList = new BigInteger[balls + 1];

		BigInteger fac = new BigInteger("1");
		for (int i = 1; i <= balls; i++) {
			fac = fac.multiply(new BigInteger(Integer.toString(i)));
			facList[i] = fac;
		}

		return Integer.parseInt(facList[balls].divide(facList[balls - share].multiply(facList[share])).toString());
	}

	public static void main(String[] args) {
		int balls = 5;
		int share = 3;
		DividingMarble solution = new DividingMarble();
		int solution1 = solution.solution(balls, share);
		System.out.println("result = " + solution1);
	}
}
