package progrmmers.level0;

import java.util.stream.IntStream;

/*
programmers
level: 0
title: 각도기
url: https://school.programmers.co.kr/learn/courses/30/lessons/120829
*/
public class Angle {

	public int solution(int angle) {
		int answer = 0;
		if (angle > 0 && angle < 90) {
			answer = 1;
		} else if (angle == 90) {
			answer = 2;
		} else if (angle > 90 && angle < 180) {
			answer = 3;
		} else if (angle == 180) {
			answer = 4;
		}

		return answer;
	}

	public static void main(String[] args) {
		int age = 10;
		Angle solution = new Angle();
		int solution1 = solution.solution(age);
		System.out.println("result = " + (solution1));
	}
}
