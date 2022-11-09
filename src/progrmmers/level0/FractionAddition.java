package progrmmers.level0;

import java.util.Arrays;

/*
programmers
level: 0
title: 분수의 덧셈
url: https://school.programmers.co.kr/learn/courses/30/lessons/120808
*/
public class FractionAddition {

	public int[] solution(int denum1, int num1, int denum2, int num2) {
		int[] answer = new int[2];

		int gcf = getGCF(num1, num2);
		int lcm = num1 * num2 / gcf;
		answer[0] = denum1 * lcm / num1 + denum2 * lcm / num2;
		answer[1] = lcm;

		int answerGcf = getGCF(answer[0], answer[1]);
		answer[0] = answer[0] / answerGcf;
		answer[1] = answer[1] / answerGcf;
		return answer;
	}

	public static int getGCF(int num1, int num2) {
		if (num1 % num2 == 0) {
			return num2;
		}
		return getGCF(num2, num1 % num2);
	}

	public static void main(String[] args) {
		int denum1 = 9;
		int num1 = 2;
		int denum2 = 1;
		int num2 = 3;
		FractionAddition solution = new FractionAddition();
		int[] result = solution.solution(denum1, num1, denum2, num2);
		System.out.println("result = " + Arrays.toString(result));
	}
}
