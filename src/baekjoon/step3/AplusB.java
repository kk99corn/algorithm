package baekjoon.step3;

import java.util.Scanner;

/*
baekjoon
step: 3
title: A+B - 3
url: https://www.acmicpc.net/problem/10950
*/
public class AplusB {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int iter = scanner.nextInt();

		for (int i = 0; i < iter; i++) {
			System.out.println(scanner.nextInt() + scanner.nextInt());
		}
	}
}
