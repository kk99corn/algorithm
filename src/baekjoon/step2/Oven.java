package baekjoon.step2;

import java.util.Calendar;
import java.util.Scanner;

/*
baekjoon
step: 2
title: 오븐 시계
url: https://www.acmicpc.net/problem/2525
*/
public class Oven {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int A = scanner.nextInt();
		int B = scanner.nextInt();
		int C = scanner.nextInt();

		Calendar calendar = Calendar.getInstance();

		calendar.set(Calendar.HOUR_OF_DAY, A);
		calendar.set(Calendar.MINUTE, B);

		calendar.add(Calendar.MINUTE, C);
		System.out.println(calendar.get(Calendar.HOUR_OF_DAY) + " " + calendar.get(Calendar.MINUTE));
	}
}
