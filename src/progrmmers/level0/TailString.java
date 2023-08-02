package progrmmers.level0;

/*
programmers
level: 0
title: 꼬리 문자열
url: https://school.programmers.co.kr/learn/courses/30/lessons/181841
*/
public class TailString {

	public String solution(String[] str_list, String ex) {
		String answer = "";
		for (String str : str_list) {
			if (!str.contains(ex)) answer += str;
		}
		return answer;
	}

	public static void main(String[] args) {
		TailString solution = new TailString();

		String[] str_list = {"abc", "def", "ghi"};
		String ex = "ef";
		String result = solution.solution(str_list, ex);
		System.out.println("result = " + (result));
	}
}
