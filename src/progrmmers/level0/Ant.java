package progrmmers.level0;

/*
programmers
level: 0
title: 개미 군단
url: https://school.programmers.co.kr/learn/courses/30/lessons/120837
*/
public class Ant {

	public int solution(int hp) {
		return (hp / 5) + ((hp % 5) / 3) + ((hp % 5) % 3);
	}

	public static void main(String[] args) {
		int n = 23;
		Ant solution = new Ant();
		int solution1 = solution.solution(n);
		System.out.println("result = " + (solution1));
	}
}
