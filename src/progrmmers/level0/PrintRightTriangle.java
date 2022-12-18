package progrmmers.level0;

import java.util.Scanner;

/*
programmers
level: 0
title: 직각삼각형 출력하기
url: https://school.programmers.co.kr/learn/courses/30/lessons/120823
*/
public class PrintRightTriangle {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();

		for (int i = 1; i <= n; i++) {
			for (int j = 1; j <= i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}
}
