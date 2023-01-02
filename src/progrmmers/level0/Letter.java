package progrmmers.level0;

import java.util.Arrays;

/*
programmers
level: 0
title: 편지
url: https://school.programmers.co.kr/learn/courses/30/lessons/120898
*/
public class Letter {

	public int solution(String message) {
		return message.length() * 2;
	}

	public static void main(String[] args) {
		String message = "happy birthday!";
		Letter solution = new Letter();
		int solution1 = solution.solution(message);
		System.out.println("result = " + (solution1));
	}
}
