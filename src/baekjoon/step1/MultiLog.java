package baekjoon.step1;

import java.util.Scanner;

/*
baekjoon
step: 1
title: 곱셈
url: https://www.acmicpc.net/problem/2588
*/
public class MultiLog {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int A = scanner.nextInt();
		int B = scanner.nextInt();

		System.out.println(A * (Character.getNumericValue(Integer.toString(B).charAt(2))));
		System.out.println(A * (Character.getNumericValue(Integer.toString(B).charAt(1))));
		System.out.println(A * (Character.getNumericValue(Integer.toString(B).charAt(0))));
		System.out.println(A * B);
	}
}