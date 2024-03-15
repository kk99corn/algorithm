package progrmmers.level0;

import java.util.Scanner;

/*
programmers
level: 0
title: [PCCE 기출문제] 2번 / 피타고라스의 정리
url: https://school.programmers.co.kr/learn/courses/30/lessons/250132
*/
public class PCCE2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int c = sc.nextInt();

		int b_square = (c * c) - (a * a);

		System.out.println(b_square);
	}
}
