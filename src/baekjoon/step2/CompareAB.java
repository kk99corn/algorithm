package baekjoon.step2;

import java.util.Scanner;

/*
baekjoon
step: 2
title: 두 수 비교하기
url: https://www.acmicpc.net/problem/1330
*/
public class CompareAB {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int A = scanner.nextInt();
		int B = scanner.nextInt();

		if (A > B) System.out.println(">");
		else if (A < B) System.out.println("<");
		else System.out.println("==");
	}
}