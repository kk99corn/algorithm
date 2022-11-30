package progrmmers.level0;

/*
programmers
level: 0
title: k의 개수
url: https://school.programmers.co.kr/learn/courses/30/lessons/120887
*/
public class CountK {

	public int solution(int i, int j, int k) {
		int answer = 0;
		for (; i <= j; i++) {
			String temp = Integer.toString(i);
			answer += temp.length() - temp.replaceAll(Integer.toString(k), "").length();
		}
		return answer;
	}


	public static void main(String[] args) {
		int i = 1;
		int j = 13;
		int k = 1;
		CountK solution = new CountK();
		int solution1 = solution.solution(i, j, k);
		System.out.println("result = " + solution1);
	}
}
