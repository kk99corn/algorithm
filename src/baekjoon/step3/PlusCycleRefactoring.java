package baekjoon.step3;

import java.io.*;

/*
baekjoon
step: 3
title: 더하기 사이클(리팩터링)
url: https://www.acmicpc.net/problem/1110
*/
public class PlusCycleRefactoring {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int number = Integer.parseInt(br.readLine());
		int count = 0;
		int result = number;
		do {
			result = ((result % 10) * 10) + (((result / 10) + (result % 10)) % 10);
			count++;
		} while (number != result);

		System.out.println(count);
	}
}
