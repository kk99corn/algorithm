package progrmmers.level1;

import java.util.stream.IntStream;

/*
programmers
level: 1
title: 음양 더하기
url: https://programmers.co.kr/learn/courses/30/lessons/76501
*/
public class SumPlusMinus {

	public int solution_stream(int[] absolutes, boolean[] signs) {
		return IntStream.range(0, absolutes.length)
				.map(i -> signs[i] ? absolutes[i] : -absolutes[i])
				.sum();
	}

	public int solution(int[] absolutes, boolean[] signs) {
		int answer = 0;
		for (int i = 0; i < absolutes.length; i++) {
			answer += absolutes[i] * (signs[i] ? 1 : -1);
		}

		return answer;
	}

	public static void main(String[] args) {
		int[] absolutes = {4, 7, 12};
		boolean[] signs = {true, false, true};
		SumPlusMinus sumPlusMinus = new SumPlusMinus();
		int solution = sumPlusMinus.solution(absolutes, signs);
		System.out.println("solution = " + solution);

		int solution2 = sumPlusMinus.solution_stream(absolutes, signs);
		System.out.println("solution = " + solution2);
	}
}
