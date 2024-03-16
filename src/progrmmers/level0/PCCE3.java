package progrmmers.level0;

import java.util.Scanner;

/*
programmers
level: 0
title: [PCCE 기출문제] 3번 / 나이 계산
url: https://school.programmers.co.kr/learn/courses/30/lessons/250131
*/
public class PCCE3 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int year = sc.nextInt();
		String age_type = sc.next();
		int answer = 0;

		if (age_type.equals(
				"Korea"
		)) {
			answer =
					2031 - year
			;
		}
		else if (age_type.equals("Year")) {

			answer = 2030 - year
			;
		}

		System.out.println(answer);
	}
}
