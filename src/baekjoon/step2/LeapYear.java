package baekjoon.step2;

import java.util.Scanner;

/*
baekjoon
step: 2
title: 윤년
url: https://www.acmicpc.net/problem/2753
*/
public class LeapYear {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int A = scanner.nextInt();

		if (A % 4 == 0) {
			if (A % 100 == 0 && A % 400 == 0) {
				System.out.println(1);
			} else if (A % 100 == 0) {
				System.out.println(0);
			} else {
				System.out.println(1);
			}
		} else {
			System.out.println(0);
		}
	}
}