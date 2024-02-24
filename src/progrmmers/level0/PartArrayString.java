package progrmmers.level0;

/*
programmers
level: 0
title: 부분 문자열 이어 붙여 문자열 만들기
url: https://school.programmers.co.kr/learn/courses/30/lessons/181911
*/
public class PartArrayString {

	public String solution(String[] my_strings, int[][] parts) {
		String answer = "";
		for (int i = 0; i <my_strings.length; i++) {
			answer += my_strings[i].substring(parts[i][0], parts[i][1] + 1);
		}
		return answer;
	}

	public static void main(String[] args) {
		PartArrayString solution = new PartArrayString();

		String[] my_strings = {"progressive", "hamburger", "hammer", "ahocorasick"};
		int[][] parts = {{0, 4}, {1, 2}, {3, 5}, {7, 7}};
		String result = solution.solution(my_strings, parts);
		System.out.println("result = " + (result));
	}
}
