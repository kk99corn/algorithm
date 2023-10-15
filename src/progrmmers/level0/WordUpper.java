package progrmmers.level0;

/*
programmers
level: 0
title: 특정한 문자를 대문자로 바꾸기
url: https://school.programmers.co.kr/learn/courses/30/lessons/181873
*/
public class WordUpper {

	public String solution(String my_string, String alp) {
		String answer = "";
		for (int i = 0; i < my_string.length(); i++) {
			String s = Character.toString(my_string.charAt(i));
			if (s.equals(alp)) {
				s = s.toUpperCase();
			}
			answer += s;
		}
		return answer;
	}

	public static void main(String[] args) {
		WordUpper solution = new WordUpper();

		String my_string = "programmers";
		String alp = "p";
		String result = solution.solution(my_string, alp);
		System.out.println("result = " + (result));
	}
}
