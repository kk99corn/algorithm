package baekjoon.step3;

import java.util.Scanner;

/*
baekjoon
step: 3
title: 합계
url: https://www.acmicpc.net/problem/8393
*/
public class Sum {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int num = scanner.nextInt();

		int sum = 0;
		for (int i = 1; i <= num; i++) {
			sum += i;
		}
		System.out.println(sum);
	}
}
