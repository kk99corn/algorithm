package baekjoon.step2;

import java.util.Calendar;
import java.util.Scanner;

/*
baekjoon
step: 2
title: 알람 시계
url: https://www.acmicpc.net/problem/2884
*/
public class Alarm {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int A = scanner.nextInt();
		int B = scanner.nextInt();

		Calendar calendar = Calendar.getInstance();

		calendar.set(Calendar.HOUR_OF_DAY, A);
		calendar.set(Calendar.MINUTE, B);

		calendar.add(Calendar.MINUTE, -45);
		System.out.println(calendar.get(Calendar.HOUR_OF_DAY) + " " + calendar.get(Calendar.MINUTE));
	}
}