package baekjoon.step1;

import java.util.Scanner;

/*
baekjoon
step: 1
title: 사칙연산
url: https://www.acmicpc.net/problem/10869
*/
public class AcalcB {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int a = scanner.nextInt();
		int b = scanner.nextInt();

		System.out.println(a + b);
		System.out.println(a - b);
		System.out.println(a * b);
		System.out.println(a / b);
		System.out.println(a % b);
	}
}