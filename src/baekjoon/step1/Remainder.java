package baekjoon.step1;

import java.util.Scanner;

/*
baekjoon
step: 1
title: 나머지
url: https://www.acmicpc.net/problem/10430
*/
public class Remainder {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int A = scanner.nextInt();
		int B = scanner.nextInt();
		int C = scanner.nextInt();

		System.out.println((A + B) % C);
		System.out.println(((A % C) + (B % C)) % C);
		System.out.println((A * B) % C);
		System.out.println(((A % C) * (B % C)) % C);
	}
}