package baekjoon.step2;

import java.util.Scanner;

/*
baekjoon
step: 2
title: 사분면 고르기
url: https://www.acmicpc.net/problem/14681
*/
public class QuadrantN {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int A = scanner.nextInt();
		int B = scanner.nextInt();

		if (A > 0) {
			if (B > 0) {
				System.out.println(1);
			} else {
				System.out.println(4);
			}
		} else {
			if (B > 0) {
				System.out.println(2);
			} else {
				System.out.println(3);
			}
		}
	}
}