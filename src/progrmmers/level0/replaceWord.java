package progrmmers.level0;

import java.util.Locale;
import java.util.Scanner;

/*
programmers
level: 0
title: 대소문자 바꿔서 출력하기
url: https://school.programmers.co.kr/learn/courses/30/lessons/181949
*/
public class replaceWord {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String a = sc.next();

		String answer = "";
		for (int i = 0; i < a.length(); i++) {
			if (a.charAt(i) >= 'a' && a.charAt(i) <= 'z') {
				answer += (a.charAt(i) + "").toUpperCase();
			} else {
				answer += (a.charAt(i) + "").toLowerCase();
			}
		}
		System.out.println(answer);
	}
}
