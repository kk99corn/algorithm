package progrmmers.level0;

/*
programmers
level: 0
title: 숨어있는 숫자의 덧셈 (2)
url: https://school.programmers.co.kr/learn/courses/30/lessons/120864
*/
public class HideNumberSum {

	public int solution(String my_string) {
		int answer = 0;

		String[] removeAlphabetArr = my_string.split("[a-zA-Z]");
		for (String s : removeAlphabetArr) {
			if (!s.equals("")) answer += Integer.parseInt(s);
		}

		return answer;
	}

	public static void main(String[] args) {
		String numbers = "aAb1B2cC34oOp";
		HideNumberSum solution = new HideNumberSum();
		long solution1 = solution.solution(numbers);

		System.out.println("result = " + solution1);
	}
}
