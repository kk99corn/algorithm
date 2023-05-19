package progrmmers.level0;

/*
programmers
level: 0
title: 커피 심부름
url: https://school.programmers.co.kr/learn/courses/30/lessons/181837
*/
public class Coffee {

	public int solution(String[] order) {
		int answer = 0;
		for (String s : order) {
			if (s.contains("cafelatte")) {
				answer += 5000;
			} else {
				answer += 4500;
			}
		}
		return answer;
	}

	public static void main(String[] args) {
		Coffee solution = new Coffee();

		String[] order= {"cafelatte", "americanoice", "hotcafelatte", "anything"};
		int solution1 = solution.solution(order);
		System.out.println("result = " + (solution1));
	}
}
