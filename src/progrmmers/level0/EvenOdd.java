package progrmmers.level0;

import java.util.Scanner;

/*
programmers
level: 0
title: 홀짝 구분하기
url: https://school.programmers.co.kr/learn/courses/30/lessons/181944
*/
public class EvenOdd {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		System.out.println((n % 2 == 0) ? n + " is even" : n + " is odd");
	}
}
