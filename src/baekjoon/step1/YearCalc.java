package baekjoon.step1;

import java.util.Scanner;

/*
baekjoon
step: 1
title: 1998년생인 내가 태국에서는 2541년생?!
url: https://www.acmicpc.net/problem/18108
*/
public class YearCalc {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int y = scanner.nextInt();

		System.out.print(y - 543);
	}
}