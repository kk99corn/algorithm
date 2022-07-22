package baekjoon.step2;

import java.util.Scanner;

/*
baekjoon
step: 2
title: 시험 성적
url: https://www.acmicpc.net/problem/9498
*/
public class TestScore {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int A = scanner.nextInt();

		char grade;
		if (A >= 90) {
			grade = 'A';
		} else if ( A >= 80) {
			grade = 'B';
		} else if ( A >= 70) {
			grade = 'C';
		} else if ( A >= 60) {
			grade = 'D';
		} else {
			grade = 'F';
		}

		System.out.println(grade);
	}
}