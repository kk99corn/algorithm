package progrmmers.level0;

import java.util.Arrays;

/*
programmers
level: 0
title: 아이스 아메리카노
url: https://school.programmers.co.kr/learn/courses/30/lessons/120819
*/
public class IcedAmericano {

	public int[] solution(int money) {
		int[] answer = new int[2];
		answer[0] = money / 5500;
		answer[1] = money % 5500;
		return answer;
	}

	public static void main(String[] args) {
		int money = 15000;
		IcedAmericano solution = new IcedAmericano();
		int[] solution1 = solution.solution(money);
		System.out.println("result = " + Arrays.toString(solution1));
	}
}
