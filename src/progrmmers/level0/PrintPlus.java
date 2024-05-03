package progrmmers.level0;

import java.util.Scanner;

/*
programmers
level: 0
title: 덧셈식 출력하기
url: https://school.programmers.co.kr/learn/courses/30/lessons/181947
*/
public class PrintPlus {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();

		System.out.println(a + " + " + b + " = " + (a + b));
	}
}
