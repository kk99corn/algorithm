package baekjoon.step3;

import java.util.Scanner;

/*
baekjoon
step: 3
title: 구구단
url: https://www.acmicpc.net/problem/2739
*/
public class MultiplicationTable {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int num = scanner.nextInt();

		for (int i = 1; i <= 9; i++) {
			System.out.println(num + " * " + i + " = " + num * i);
		}
	}
}
