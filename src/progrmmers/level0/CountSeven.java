package progrmmers.level0;

/*
programmers
level: 0
title: 7의 개수
url: https://school.programmers.co.kr/learn/courses/30/lessons/120912
*/
public class CountSeven {

	public int solution(int[] array) {
		int answer = 0;

		for (int n : array) {
			String num = Integer.toString(n);
			answer += num.length() - num.replaceAll("7", "").length();
		}
		return answer;
	}

	public static void main(String[] args) {
		int[] array = {7, 77, 17};
		CountSeven solution = new CountSeven();
		int solution1 = solution.solution(array);
		System.out.println("result = " + solution1);
	}
}
